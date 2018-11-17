package javaPractice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javaPractice.sample.models.Gender;
import javaPractice.sample.models.Person;

/**
 * @author harsha 
 * https://youtu.be/1OpAgZvYXLQ
 * https://www.baeldung.com/java-8-streams
 */
public class JavPracticeStreamCharacteristic {
    
    public static void main(String[] args) {

	System.out.println("My Java Practice : Stream Characteristic");

	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5);
	
	numbers.stream()
		.filter(e -> e % 2 == 0)
		.forEach(System.out::println);
	//sized, ordered, non-distinct(list can have duplicate), non-sorted
	
	numbers.stream()
        	.filter(e -> e % 2 == 0)
        	.sorted()
        	.forEach(System.out::println);
        //sized, ordered, non-distinct(list can have duplicate), sorted
	
	numbers.stream()
        	.filter(e -> e % 2 == 0)
        	.distinct()
        	.forEach(System.out::println);
        //sized, ordered, non-sorted
	
	
	
	//Another example
	//Given a number k, and a count n, find the toatl of double of n
	//even numbers starting with k, where sqrt of each number is > 20
	int k = 121;
	int n = 51;
	
	System.out.println(complex(k, n));
	
    }
    
    public static int complex(int k, int n) {
	
//	int result = 0;
//	
//	int index = k;
//	int count = 0;
//	
//	while(count < n) {
//	    if(index % 2 == 0 && Math.sqrt(index) > 20) {
//		result += index * 2;
//		count++;
//	    }
//	    index++;
//	}
//	
//	return result;
	
	return	Stream.iterate(k, e -> e + 1)		//unbound, lazy
        		.filter(e -> e % 2 == 0)	//unbound, lazy
        		.filter(e -> Math.sqrt(e) > 20)	//unbound, lazy
        		.mapToInt(e -> e * 2)		//unbound, lazy
        		.limit(n)			//sized, lazy
        		.sum();
	
	//Any function that returns stream from stream is lazy
		
	
	
    }

}
