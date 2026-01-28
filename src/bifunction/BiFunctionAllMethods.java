package bifunction;

import java.util.function.BiFunction;

public class BiFunctionAllMethods {
    public static void main(String[] args) {

        //  apply(T t, U u)
        BiFunction<Integer, Integer, Integer> add =
                (a, b) -> a + b;

        System.out.println(add.apply(10, 20));   // 30


        // andThen(Function after)
        BiFunction<Integer, Integer, Integer> multiply =
                (a, b) -> a * b;

        BiFunction<Integer, Integer, Integer> addThenMultiply =
                add.andThen(result -> result * 2);

        System.out.println(addThenMultiply.apply(10, 20)); // 60


        // Example with String
        BiFunction<String, String, String> concat =
                (s1, s2) -> s1 + " " + s2;

        System.out.println(concat.apply("Hello", "Java"));
    }
}
