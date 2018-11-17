package javaPractice.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author harsha 
 * https://youtu.be/1OpAgZvYXLQ
 * https://www.baeldung.com/java-8-streams
 * https://stackoverflow.com/questions/44219903/why-is-shared-mutability-bad
 * http://blog.agiledeveloper.com/2015/11/the-power-and-practicality-of.html
 */
public class JavPracticeStreamNextLevel {

    public static void main(String[] args) {

	System.out.println("My Java Practice : Lambdas Complex Example");

	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5);
	
	//Task : Doubl the even values and put that into a list
	
	//wrong way to do
	List<Integer> doubeOfEven = new ArrayList<>();
	
	numbers.stream()
		.filter(e -> e % 2 == 0)
		.map(e -> e * 2)
		.forEach(e -> doubeOfEven.add(e));
	//Mutability is ok, sharing is ok, shared mutability is devils work
	//doubeOfEven is being changed and if few threads to share it, there can be data corruption
	
	System.out.println(doubeOfEven);
	
	//Correct way to do
	List<Integer> doubeOfEven2 = 
        	numbers.stream()
        		.filter(e -> e % 2 == 0)
        		.map(e -> e * 2)
        		.collect(Collectors.toList());
	
	System.out.println(doubeOfEven2);
	
	//using sets
	Set<Integer> doubeOfEven2set = 
        	numbers.stream()
        		.filter(e -> e % 2 == 0)
        		.map(e -> e * 2)
        		.collect(Collectors.toSet());
	
	System.out.println(doubeOfEven2set);
	

	
    }

}
