package stream;

import java.util.Arrays;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4);
        System.out.println("Print all "+ list);
        list.stream()
            .map(n -> n * n)
            .forEach(System.out::println);  // method reference 
        
        System.out.println();
        list.stream().map(n->n+n).forEach(n->System.out.println(n));
        
        
        // using string
        System.out.println();
        List<String> names = Arrays.asList("rahul", "verma", "java");

        names.stream()
             .map(name -> name.toUpperCase())
             .forEach(n->System.out.println(n));

    }
}


/*
 * map() is a method of the Stream API.
 * It is used to change (transform) each element of a stream.
 * It does not remove elements, it modifies them.
 * map() = convert data from one form to another
 * 
 * map() used With Stream API
 * For data transformation
 * Works with Function interface
 * 
 */