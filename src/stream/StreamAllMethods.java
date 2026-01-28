package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
// Consumer - functional interface  predefined interface
// predicate, function, supplier also as a predefined functional interfcae 
// Funcational interface - single abstract method (SAM), multiple static and default methods 
// and functional interface we can apply lambda expression
//  map transfrom
// collectors classs - toSet, toMap,
// distinct
public class StreamAllMethods {
	public static void main(String[] args) {
     
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(15);
		list.add(5);
		list.add(10);
		list.add(50);
		list.add(20);
		list.add(12);
		
//		List<Intger> list =Arrays.asList(10,20,2,30,15);    
		
		System.out.println(list);  // Existing collection
		/*
		for(Integer l :list) {    // External for each loop
		Integer result	=l*2;
			System.out.println(result);
		}
		*/
		
		// forEach method   // internally 
//		Consumer<Integer> consumer = new Consumer<Integer>() {  // anonymous class 
//			
//			@Override
//			public void accept(Integer n) {
//				System.out.println(n);
//				
//			}
//		};
		
//		Consumer<Integer> consumer1 = n -> System.out.println(n);
//		list.forEach(consumer1);
//		System.out.println(list);   // Existing collection
		
//		list.forEach(n->System.out.println(n)); 
		
		
//		Collections.sort(list); 
//		System.out.println(list);     // sorted or  
		
		 /*
		  Stream<Integer>streamData= list.stream(); 
		  Stream<Integer> sortedStream = streamData.sorted();  
//		   System.out.println(sortedStream);   // hascode print   
		   sortedStream.forEach(n->System.out.println(n));   // sorted data print */
		

//		   Stream<Integer>  streamData2= streamData.map(n->n*n);
//		    streamData2.forEach(i->System.out.println(i));  // java.lang.IllegalStateException
//		   // once stream is consumed no operation further will be applied on that particuler stream
		/*
		  Stream<Integer>streamData1=list.stream();
		 Stream<Integer>  streamAdd = streamData1.map(n-> n + n);
		 streamAdd.forEach(i->System.out.println(i));   */
		  
		// Method channing
//		list.
//		stream().map(n->n*2).
//		forEach(i->System.out.println(i));
		
		/*
		String name = "Rahul";
	int lengthoftheString = 	name.toLowerCase().toUpperCase().concat("verma").length();
		System.out.println("length of String is :" + lengthoftheString);   */
		
		
//		list.stream().map(m->m*3).forEach(l->System.out.println(l));
//		
//		  System.out.println(list); 
		  
		/*  List<String> list1 = new ArrayList<>();
		  list1.add("Rahul");
		  list1.add("Devansh");
		  list1.add("Tarun");
		  list1.add("Ajay");
		  System.out.println(list1);
		Set<String>  setData = list1.stream().collect(Collectors.toSet());
		List<String>  newlist = list1.stream().collect(Collectors.toList());
		System.out.println(setData);
		System.out.println(newlist);
		System.out.println(list1);
		  */
		System.out.println(" usnig Method Chaning");
		list.stream().filter(n->n%2==0).forEach(h->System.out.println(h));
		System.out.println();
		list.stream().filter(n->n%n==0).map(n->n+n).forEach(n->System.out.println(n));
		  System.out.println();
		  System.out.println("usnig method reference");
		list.stream().filter(n->n%2==0).map(n->n*n).forEach(System.out::println);   // by reference 
	
		
		List<Integer> l = Arrays.asList(1,2,2,2,3,4,5,6,7,8,9);
		
		// convert stream
		System.out.println();
		System.out.println("Print all list : "+l);
		System.out.println("Duplicate remove using distinct");
		l.stream().distinct().forEach(i->System.out.println(i));
		System.out.println("Print all list : "+l);
		
		// usnig  limit(long(3))   first 3 letter print

		
		l.stream().limit(3).forEach(m->System.out.println(m));
		
		// usiing skip()
		System.out.println(l);
        System.out.println("using skip method");
		l.stream().skip(4).forEach(n->System.out.println(n));
		
		System.out.println();
		System.out.println();
		l.stream().distinct().limit(8).forEach(n->System.out.println(n));
		
		
		
	}
}
