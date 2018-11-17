package javaPractice.lambdas;

import java.util.Arrays;
import java.util.List;

/**
 * @author harsha
 *
 */
public class JavaPracticeLambdasComplexExample {

	public static void main(String[] args) {

		System.out.println("My Java Practice : Lambdas Complex Example");

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		System.out.println(
			numbers	.stream()
				.filter(e -> e % 2 == 0)
				.mapToInt(JavaPracticeLambdasComplexExample::Complex)
				.sum() );
		
		//parallel streams
		//much faster
		//you shouldn't do becasue you can
		//Use when, 
		// 1. makes sence to paralalize it
		// 2. willing to spend more resources
		// 3. when data sizes big enough
		// 4. when taskc computation is big enough
		System.out.println(
			numbers	.parallelStream()
				.filter(e -> e % 2 == 0)
				.mapToInt(JavaPracticeLambdasComplexExample::Complex)
				.sum() );
		
		

	}
	
	public static int Complex(int e) {
		
		//complex computing 
		return 2 * e;
	}

}
