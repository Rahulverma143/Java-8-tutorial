package supplier;

import java.util.function.Supplier;

public class SupplierAllMethods {
    public static void main(String[] args) {

        // Supplier of String
        Supplier<String> messageSupplier = () -> "Welcome to Java 8";
        System.out.println(messageSupplier.get());

        // Supplier of Random Number
        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println(randomSupplier.get());

        // Supplier of Integer
        Supplier<Integer> numberSupplier = () -> 100;
        System.out.println(numberSupplier.get());
    }
}
