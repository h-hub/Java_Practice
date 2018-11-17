package javaPractice.lambdas;

import java.util.Arrays;
import java.util.List;

/**
 * @author harsha
 *http://blog.agiledeveloper.com/2015/08/prefer-functional-style-over-imperative.html
 */
public class JavaPracticeLambdasNextLevel {

	public static void main(String[] args) {

		System.out.println("My Java Practice : Lambdas");

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// given the values, double the ven numbers and total

		int result = 0;

		for (int e : numbers) {

			if (e % 2 == 0) {
				result += e * 2;
			}
		}

		System.out.println(result);
		// above is spaggeti code and we shouldn't do
		// no clarity at all
		// this is so messed up and we have to deeply think about these
		// waste of our minds

		// for is like a hammer which we use in every situation, we can use a hammer in
		// every situation

		// stream is like a fancy iterator with many other featues
		System.out.println(
			numbers.stream()
				.filter(e -> e % 2 == 0)
				.map(e -> e * 2)
				.reduce(0, Integer::sum) );
		
		System.out.println(
			numbers.stream()
				.filter(e -> e % 2 == 0)
				.mapToInt(e -> e * 2)
				.sum() );
		
		//In above code, everything is done in a single pass through
		//We should not everything in one line

	}

}
