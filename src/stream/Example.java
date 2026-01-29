package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
// internidiate operation
// terminal opeeration foreach(result provide karte hai) , count, max 
public class Example {
	public static void main(String[] args) {
		// list ik interface hai
		// integer type ki ualue store kr rahe hai

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(15);
		list.add(10);
		list.add(60);
		System.out.println(list); // Existing collection
		System.out.println();
		// element retrive
		// iterate list pr krna hai
//	for( Integer i : list) {   // expecitly // outer loop
//		int result = i*i;
//		System.out.println(result);
//	}
//	System.out.println(list);

//		Consumer<Integer> consumer = (t)->System.out.println(t);
//		list.forEach(consumer);

//		Collections.sort(list);
//		System.out.println(list);  // existing data ka ander modification

		Stream<Integer> streamdata = list.stream();
		Stream<Integer> sortedStream = streamdata.sorted();
		Stream<Integer> mappedStream = sortedStream.map(n->n*n);
//		mappedStream.forEach(i->System.out.println(i)); 
		System.out.println();
		sortedStream.forEach(i -> System.out.println(i));
//		sortedStream.map(n->n*n).forEach(i->System.out.println(i));  // java.lang.IllegalStateException:
		System.out.println();
		System.out.println(list);

//		Stream<Integer> streamData = list.stream();
//		Stream<Integer> sortedStream = streamData.sorted();
//		System.out.println(sortedStream); // hashcode
//		sortedStream.forEach(n -> System.out.println(n));
//	
//		// method channing
//
//		list.stream().map(n -> n * 2).forEach(n -> System.out.println(n));
//		System.out.println(list);
//
//		List<String> list2 = new ArrayList<String>();
//		list2.add("java");
//		list2.add("html");
//		list2.add("css");

	}
}
