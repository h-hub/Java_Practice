package javaPractice.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author harsha 
 * https://youtu.be/1OpAgZvYXLQ
 */
public class JavPracticeStreameEfficiency {

    public static void main(String[] args) {

	System.out.println("My Java Practice : Lambdas Complex Example");

	List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8, 9, 10 ,11 ,12 ,13, 14, 15, 16, 17, 18, 19, 20);
	
	//given an ordered list find the double of the first even number greater than 3
	int result = 0;
	
	for(int e : numbers) {
	    if(e > 3 && e % 2 == 0) {
		result = e * 2;
		break;
	    }
	}
	
	System.out.println(result);
	//how much work ? 8 steps
	
	
	//with java streams and lambdas
	System.out.println(
		numbers.stream()
		.filter(JavPracticeStreameEfficiency::isGT3)
		.filter(JavPracticeStreameEfficiency::isEven)
		.map(JavPracticeStreameEfficiency::doubleIt)
		.findFirst());
	//What s the cost here? 
	// Streams are Lazy
	// Streams creates(builds) a pipe line with all the filters and maps we have provided
	// It will only be triggered only when you call findFirst() [Lazy evaluation]
	
	// it doesnt take the entire stream and apply a filter.
	// it takes one element and applies the entire sequence of functions (filters and map)
	// and so on... [You can understand by executing this code]
	
	// Number of steps or the cost is the same as the first method (Empirical way)
	
	
	//in this case, nothing is done, since we haven't call the terminal operation
	numbers.stream()
        	.filter(JavPracticeStreameEfficiency::isGT3)
        	.filter(JavPracticeStreameEfficiency::isEven)
        	.map(JavPracticeStreameEfficiency::doubleIt);
	System.out.println("DONE");
	
	//lazy eval is possible only if the functions don't have side effect (Don't print stuff like in methods in this class
	// , they should only be checking conditions instead of printing stuff). the world shouldn't know whether you have run the 
	// funtions or not. it should not make any difference.
	
    }
    
    public static boolean isGT3(int number) {
	System.out.println("isGT3 "+number);
	return number > 3;
    }
    
    public static boolean isEven(int number) {
	System.out.println("isEven "+number);
	return number % 2 == 0;
    }
    
    public static int doubleIt(int number) {
	System.out.println("isEven "+number);
	return number * 2;
    }
    

}
