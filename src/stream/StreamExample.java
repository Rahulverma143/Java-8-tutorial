package stream;
import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {

        // Stream Life Cycle
        // Source → Intermediate Operations → Terminal Operation

        // Source (Collection)
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        // Terminal Operation with Collector
        // toList(), toSet(), toMap(), counting(), joining()
        Set<Integer> set = list.stream()
                               .collect(Collectors.toSet());
        System.out.println("Set: " + set);

        // Method Reference (Terminal Operation)
        list.stream()
            .forEach(System.out::print);

        System.out.println();

        // IllegalStateException:
        // Stream cannot be reused after a terminal operation
        /*
        Stream<Integer> st = list.stream();
        st.forEach(System.out::println); // terminal operation
        st.count(); // ❌ IllegalStateException
        */

        // Intermediate Operations:
        // map(), filter(), distinct(), sorted(), limit(), skip()
        // Terminal Operations:
        // forEach(), count(), reduce(), min(), max()

        // Method Chaining
        list.stream()
            .map(n -> n * 2)          // intermediate
            .forEach(System.out::println); // terminal
    }
}
