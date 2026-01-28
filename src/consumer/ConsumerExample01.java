package consumer;
import java.util.function.Consumer;

class PrintString implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

public class ConsumerExample01 {
    public static void main(String[] args) {
        Consumer<String> c = new PrintString();
        c.accept("Hello Java 8");
        
        
        
        // lambda Expression
        System.out.println();
        
        Consumer<String> cc = s -> System.out.println(s);
        cc.accept("Hello Java 8");

    }
}
