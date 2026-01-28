package consumer;

import java.util.function.Consumer;

public class ConsumerAllMethods {
    public static void main(String[] args) {

        // accept(T t)
        Consumer<String> printUpper = s -> 
            System.out.println(s.toUpperCase());

        printUpper.accept("java");   // JAVA


        // andThen(Consumer after)
        Consumer<String> printLength = s -> 
            System.out.println("Length: " + s.length());

        Consumer<String> upperThenLength = printUpper.andThen(printLength);

        upperThenLength.accept("java"); 
        // Output:
        // JAVA
        // Length: 4
    }
}
