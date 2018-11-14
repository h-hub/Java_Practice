package javaPractice.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class JavaPracticeLambdas {

	public static void main(String[] args) {

		System.out.println("My Java Practice Lambdas");

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

		// Java 8 has type inference only for lambda expressions
		numbers.forEach( value -> System.out.println(value));

	}

}
