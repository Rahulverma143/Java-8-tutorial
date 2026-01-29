package stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamAllMethodsExample {
    public static void main(String[] args) {

        // Existing collection
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(5);
        list.add(10);
        list.add(50);
        list.add(20);
        list.add(12);

        System.out.println("Original List : " + list);
        System.out.println("--------------------------------");

        // forEach (Consumer)
        System.out.println("forEach()");
        list.forEach(n -> System.out.println(n));

        System.out.println("--------------------------------");

        // map() – transform data
        System.out.println("map() - multiply by 2");
        list.stream()
            .map(n -> n * 2)
            .forEach(System.out::println);

        System.out.println("--------------------------------");

        // filter() – even numbers
        System.out.println("filter() - even numbers");
        list.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);

        System.out.println("--------------------------------");

        // method chaining
        System.out.println("Method Chaining (filter + map)");
        list.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * n)
            .forEach(System.out::println);

        System.out.println("--------------------------------");

        // collect() to List and Set
        List<Integer> doubledList =
                list.stream()
                    .map(n -> n * 2)
                    .collect(Collectors.toList());

        Set<Integer> squaredSet =
                list.stream()
                    .map(n -> n * n)
                    .collect(Collectors.toSet());

        System.out.println("Collected List : " + doubledList);
        System.out.println("Collected Set  : " + squaredSet);

        System.out.println("--------------------------------");

        // distinct(), limit(), skip()
        List<Integer> l = Arrays.asList(1, 2, 2, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println("Original List with duplicates : " + l);

        System.out.println("distinct()");
        l.stream()
         .distinct()
         .forEach(System.out::println);

        System.out.println("--------------------------------");

        System.out.println("limit(3)");
        l.stream()
         .limit(3)
         .forEach(System.out::println);

        System.out.println("--------------------------------");

        System.out.println("skip(4)");
        l.stream()
         .skip(4)
         .forEach(System.out::println);

        System.out.println("--------------------------------");

        // distinct + limit chaining
        System.out.println("distinct() + limit(5)");
        l.stream()
         .distinct()
         .limit(5)
         .forEach(System.out::println);
    }
}
