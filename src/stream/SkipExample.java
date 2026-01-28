package stream;

import java.util.Arrays;
import java.util.List;

public class SkipExample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);

		list.stream().skip(2).forEach(n->System.out.println(n));
		
		
		// using string 
		List<String> names = Arrays.asList("Rahul", "Tarun", "Devash", "Verma");

		names.stream()
		     .skip(1)
		     .forEach(n->System.out.println(n));

		
		// skip() with filter() and distinct() used 
		
		List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25,25);

		numbers.stream()
		       .filter(n -> n > 10)
		       .skip(1)
		       .distinct()
		       .forEach(n->System.out.println(n));  // 20, 25 

	}

}


/*
 * skip() is a method of the Stream API.
 * It is used to ignore (skip) the first N elements of a stream.
 * After skipping, the remaining elements are processed.
 * skip() = leave the first elements and move ahead
 */