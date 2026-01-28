package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectWithString {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Rahul", "Devansh", "Tarun");

		List<String> result = names.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());

		System.out.println(result);
	}
}
