package stream;

import java.util.Arrays;
import java.util.List;

public class FilterExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,20,25, 28);
        
        System.out.println("full list print "+ list);
        System.out.println();
        list.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);   // using method reference
        
        System.out.println();
        list.stream().filter(n->n%5==0).forEach(n->System.out.println(n));
        
//        using string 
        
        List<String> names = Arrays.asList("Rahul", "Devansh", "Tarun", "Ajay", "Rohit");

        names.stream()
             .filter(name -> name.startsWith("R"))
             .forEach(n->System.out.println(n));

    }
}

/**  Filter()
 * filter() is a method of Stream API in Java 8.
 * It is used to select elements based on a condition.
 * filter() in Java 8 is used to keep only the elements that match a given condition.
 * filter() = remove unwanted data
 * filter() used
 * With Stream API
 * On collections like List, Set
 * Uses Predicate (a condition)
 */

//How filter() works
//Convert a collection into a stream
//Apply a condition using filter()
//Only matching elements pass
//Use a terminal method like forEach()