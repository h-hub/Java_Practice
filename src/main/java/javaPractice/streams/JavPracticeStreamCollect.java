package javaPractice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javaPractice.sample.models.Gender;
import javaPractice.sample.models.Person;

/**
 * @author harsha 
 * https://youtu.be/1OpAgZvYXLQ
 * https://www.baeldung.com/java-8-streams
 * https://stackoverflow.com/questions/44219903/why-is-shared-mutability-bad
 * http://blog.agiledeveloper.com/2015/11/the-power-and-practicality-of.html
 */
public class JavPracticeStreamCollect {
    
    public static List<Person> createPeople(){
	
	return Arrays.asList(
		new Person("Sara", Gender.FEMALE, 20),
		new Person("Sara", Gender.FEMALE, 22),
		new Person("Bob", Gender.MALE, 20),
		new Person("Paula", Gender.FEMALE, 32),
		new Person("Paul", Gender.FEMALE, 32),
		new Person("Jack", Gender.MALE, 2),
		new Person("Jack", Gender.MALE, 72),
		new Person("Jill", Gender.FEMALE, 12)
	);
	
    }
    

    public static void main(String[] args) {
	
	List<Person> people = createPeople();

	System.out.println("My Java Practice : Stram, Collect example");
	
	//create a map with name and age as key, and the person as value
	System.out.println(
		people.stream()
		.collect(Collectors.toMap(
			person -> person.getName() + "-" + person.getAge(),
			person -> person)));
	
	
	//give a list of people, create a map where
	//their name is the key and value is all the people with that name
	System.out.println(
		people.stream()
		.collect(Collectors.groupingBy(Person::getName)));
	
	//give a list of people, create a map where
	//their name is the key and value is all the ages of people with that name
	System.out.println(
		people.stream()
		.collect(Collectors.groupingBy(Person::getName, 
			Collectors.mapping(Person::getAge, Collectors.toList()))));
	
	
	
	

	
    }

}
