package javaPractice.streams;

import java.util.Arrays;
import java.util.List;

/**
 * @author harsha 
 * https://youtu.be/1OpAgZvYXLQ
 * https://www.baeldung.com/java-8-streams
 */
public class JavPracticeStream {

    public static void main(String[] args) {

	System.out.println("My Java Practice : Lambdas Complex Example");

	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	// Stream is a bunch of functions. they have no data. Purely and abstraction
	// Non mutating pipelines

	// filter : takes the values in the stream, blocks some and let some of it go
	// parameter : Stream<T> filter takes Predicate<t>
	System.out.println(
		numbers	.stream()
			.filter(e -> e % 2 == 0));

	// map transforms values
	// number of inputs == number of outputs
	// type of the output might change
	// parameter : Stream<T> map takes Function<T,R> to Stream<R>
	
	//incoming int, out going double
	System.out.println(
		numbers	.stream()
            		.filter(e -> e % 2 == 0)
            		.map(e -> e * 2.0));
	
	//incoming int, out going int
	System.out.println(
		numbers.stream()
        		.filter(e -> e % 2 == 0)
        		.map(e -> e * 2));
	
	/**
	 * filter and map stay within their same swimlane
	 * but reduce cuts across swimlanes
	 */
	
	//reduce (Brinds values together)
	//reduce on Strea<T> takes two parameters
	//first parameter is of type T
	//second parameter is of type BiFunction<R, T, R> to produce a result of R
	System.out.println(
            	numbers.stream()
                    	.filter(e -> e % 2 == 0)
                    	.map(e -> e * 2.0)
                    	.reduce(0.0, (carry, e) -> carry + e ));
	//we can replace above code with sum()
	System.out.println(
        	numbers.stream()
                	.filter(e -> e % 2 == 0)
                	.mapToDouble(e -> e * 2.0)
                	.sum());
	
    }

}
