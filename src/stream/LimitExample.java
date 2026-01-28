package stream;

import java.util.Arrays;
import java.util.List;

public class LimitExample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		list.stream().limit(3).forEach(n->System.out.println(n));
		// Only first 3 elements are taken
		
		
		
		// String use 
		System.out.println();
		List<String> names = Arrays.asList("Rahul", "verma", "Anil", "Sourabh");

		names.stream()
		     .limit(2)
		     .forEach(n->System.out.println(n));
		
		// limit() with filter()  used 
		System.out.println();
		List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25, 30);

		numbers.stream()
		       .filter(n -> n > 10)
		       .limit(2)
		       .forEach(n->System.out.println(n));
		
		//  limit() with skip()  used 
		System.out.println();
		List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6);

		numbers1.stream()
		       .skip(2)
		       .limit(3)
		       .forEach(n->System.out.println(n));



	}

}


/* 
 * limit() is a method of the Stream API.
 * It is used to take only the first N elements from a stream.
 * After N elements, the stream stops processing.
 * limit() = stop after some elements
 */