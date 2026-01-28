package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Example {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(15);
		list.add(1);
		list.add(60);
		System.out.println(list); // Existing collection

		Stream<Integer> streamData = list.stream();
		Stream<Integer> sortedStream = streamData.sorted();
		System.out.println(sortedStream); // hashcode
		sortedStream.forEach(n -> System.out.println(n));

		// method channing

		list.stream().map(n -> n * 2).forEach(n -> System.out.println(n));
		System.out.println(list);

		List<String> list2 = new ArrayList<String>();
		list2.add("java");
		list2.add("html");
		list2.add("css");

	}
}
