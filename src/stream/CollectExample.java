package stream;

import java.util.*;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Rahul","Ajay","Rahul");

        Set<String> set = list.stream().collect(Collectors.toSet());
        System.out.println(set);
        list.stream().map(n->n+n).forEach(s->System.out.println(s));
    }
}


/*
 * collect() is a terminal operation of the Stream API.
 * It is used to convert a stream into a collection or a single result
 * Most commonly used to create List, Set, or Map
 * collect() = gather the result
 * 
 * 
 * A Collector tells Java:
 * Where to store the result
 * How to combine elements
 */