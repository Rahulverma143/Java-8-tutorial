package stream;

import java.util.Arrays;
import java.util.List;

public class DistinctExample {
    public static void main(String[] args) {
    	List<Integer> numbers = Arrays.asList(10, 20, 10, 30, 20, 10, 30, 20);
    	numbers.stream()
    	       .distinct()
    	       .forEach(System.out::println);

        
        System.out.println(numbers);
        System.out.println("Using Distinct method");
        numbers.stream()
        .distinct()
        .forEach(n->System.out.println(n));
        
        List<String> names = Arrays.asList("Rahul", "Devansh", "Rahul", "Devansh", "Tarun");

        names.stream()
             .distinct()
             .forEach(System.out::println);

    }
}


/*
 * distinct() is a method of the Stream API.
 * It is used to remove duplicate elements from a stream.
 * Only unique elements are kept.
 * distinct() = remove duplicates
 * distinct() in Java 8 removes duplicate elements and keeps only unique values in a stream.
 * distinct() used
 * With Stream API
 * On collections (List, Set, etc.)
 * To get unique data
 */