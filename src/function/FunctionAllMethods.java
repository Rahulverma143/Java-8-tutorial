package function;

import java.util.function.Function;

public class FunctionAllMethods {
    public static void main(String[] args) {

        // 1  apply(T t)
        Function<Integer, Integer> square = n -> n * n;
        System.out.println("Square: " + square.apply(5)); // 25


        // andThen(Function after)
        Function<Integer, Integer> doubleValue = n -> n * 2;
        Function<Integer, Integer> squareThenDouble = square.andThen(doubleValue);

        System.out.println("Square then Double: " + squareThenDouble.apply(5)); // 50


        // compose(Function before)
        Function<Integer, Integer> doubleThenSquare = square.compose(doubleValue);

        System.out.println("Double then Square: " + doubleThenSquare.apply(5)); // 100


        // identity() – static method
        Function<String, String> identityFunction = Function.identity();

        System.out.println("Identity: " + identityFunction.apply("Java 8")); // Java 8
    }
}
