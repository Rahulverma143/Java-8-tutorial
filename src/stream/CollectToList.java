package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectToList {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2,2, 3, 4, 5, 6);
		System.out.println("even number print");
		List<Integer> evenList = numbers
				.stream()
				.filter(n -> n % 2 == 0)
				.collect(Collectors.toList());
		
		System.out.println(evenList);
		
	    System.out.println("full list print");
		List<Integer> evenList1 = numbers.stream().collect(Collectors.toList());
		System.out.println(evenList1);

	}
}
