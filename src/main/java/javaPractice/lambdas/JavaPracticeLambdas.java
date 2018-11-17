package javaPractice.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @param args
 * http://blog.agiledeveloper.com/2015/06/lambdas-are-glue-code.html
 * https://youtu.be/1OpAgZvYXLQ
 */
public class JavaPracticeLambdas {

	public static void main(String[] args) {

		System.out.println("My Java Practice : Lambdas");

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// external iterator
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}

		// external iterator
		for (int e : numbers) {
			System.out.println(e);
		}

		// internal iterator
		numbers.forEach(new Consumer<Integer>() {

			public void accept(Integer value) {
				System.out.println(value);
			}

		});

		// java 8 and above. Lambdas
		numbers.forEach((Integer value) -> System.out.println(value));

		// Java 8 has type inference only for lambda expressions
		numbers.forEach((value) -> System.out.println(value));

		// parenthesis is optional , but only for one parameter lambdas
		numbers.forEach(value -> System.out.println(value));

		// :: is a methods reference syntax. Here we have replaced the lambda with a method reference 
		// to say all my intention is to receive and pass "value" as an argument
		// Here we are passing the function, not invoking it
		// receive and pass though, no modifying. methods references are used in this case only.
		//println is an instance methos of System.out
		numbers.forEach( System.out::println );
		
		//here we are passing e to a static method
		//valueOf is a static method
		numbers	.stream()
			.map(e -> String.valueOf(e))
			.forEach( System.out::println );
		
		//here we are passing e to a static method (using method reference)
		//valueOf is a static method
		numbers	.stream()
			.map(String::valueOf)
			.forEach( System.out::println );
		
		//parameter has become a target. calling a function on that object.
		//Earlier cases it was an argument
		numbers	.stream()
			.map(e -> e.toString())
			.forEach( System.out::println );
		
		System.out.println("--------------------------------------------------------------");
		
		//using two arguments
		System.out.println(
			numbers	.stream()
				.reduce(0, (total, e) -> Integer.sum(total, e))	
		);
		
		System.out.println("--------------------------------------------------------------");
		
		//using two arguments
		//using method referrence, but incoming and outgoing order of the parameters has to be the same
		System.out.println(
			numbers	.stream()
				.reduce(0, Integer::sum)
		);
		
		System.out.println("--------------------------------------------------------------");
		
		//first parameter is a target, other one is an argument, order matters.
		System.out.println(
			numbers	.stream()
				.map(String::valueOf)
				.reduce("", (carry, str) -> carry.concat(str))
		);
		
		System.out.println("--------------------------------------------------------------");
		
		//first parameter is a target, other one is an argument, order matters.
		//using method references
		System.out.println(
			numbers	.stream()
				.map(String::valueOf)
				.reduce("", String::concat)
		);
		
		//there are two limitation in method references
		// 1. Can't use when data manipulation
		// 2. If there is conflict between instance and static method
		// ( ex: toStringMethod in integer bcz it is both static and an instance method
		

	}

}
