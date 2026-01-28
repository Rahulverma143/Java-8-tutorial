package biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerAllMethods {
    public static void main(String[] args) {

        //  accept(T t, U u)
        BiConsumer<String, Integer> printNameAndAge =
                (name, age) -> System.out.println("Name: " + name + ", Age: " + age);

        printNameAndAge.accept("Rahul", 25);


        // andThen(BiConsumer after)
        BiConsumer<String, Integer> printUpperName =
                (name, age) -> System.out.println("Upper Name: " + name.toUpperCase());

        BiConsumer<String, Integer> combinedConsumer =
                printNameAndAge.andThen(printUpperName);

        combinedConsumer.accept("Rahul", 25);
    }
}
