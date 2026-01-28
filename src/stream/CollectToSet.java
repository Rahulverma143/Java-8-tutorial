package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectToSet {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2,2,5, 3, 4, 5, 6);
		Set<Integer> uniqueNumbers =
			    numbers.stream()
						.collect(Collectors.toSet());

		
		 System.out.println(uniqueNumbers);
	}

}
