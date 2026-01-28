package stream;

import java.util.Arrays;
import java.util.List;
   // filter() + distinct()
public class MapExample01 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4);

		numbers.stream()
		       .filter(n -> n > 2)
		       .distinct()
		       .forEach(n->System.out.println(n));

	}
}
