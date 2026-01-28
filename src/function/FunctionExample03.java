package function;

import java.util.function.Function;

public class FunctionExample03 {
    public static void main(String[] args) {

        // Function to convert String to Integer
        Function<String, Integer> f = s -> s.length();

        System.out.println(f.apply("Hello")); // 5
        System.out.println(f.apply("Java"));  // 4

        // Function chaining using andThen()
        Function<Integer, Integer> square = n -> n * n;
        System.out.println(f.andThen(square).apply("Hi")); // 4
    }
}