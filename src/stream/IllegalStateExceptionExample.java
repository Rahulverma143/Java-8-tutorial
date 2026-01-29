package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IllegalStateExceptionExample {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 15, 20, 25, 30);

        Stream<Integer> stream = list.stream()
                                     .filter(n -> n > 20);

        // terminal operation 1
        stream.forEach(System.out::println);

        // ❌ terminal operation 2 on same stream
        stream.forEach(n -> System.out.println("Again: " + n));
    }
}
