package biconsumer;

import java.util.function.BiConsumer;

class PrintStrings implements BiConsumer<String, String> {
    @Override
    public void accept(String s1, String s2) {
        System.out.println(s1 + " " + s2);
    }
}

public class BiConsumerExample01 {
    public static void main(String[] args) {
        BiConsumer<String, String> bc = new PrintStrings();
        bc.accept("Rahul", "Manotra");
        
        // lambda expression
        
        System.out.println();
        BiConsumer<String, String> b = (s1, s2) -> System.out.println(s1 + " " + s2);
        b.accept("Rahul", "Verma");

    }
}
