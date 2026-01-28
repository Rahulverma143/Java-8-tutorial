package supplier;
import java.util.function.Supplier;

class StringSupplier implements Supplier<String> {
    @Override
    public String get() {
        return "Hello Java 8";
    }
}

public class SupplierExample01 {
    public static void main(String[] args) {
        Supplier<String> s = new StringSupplier();
        System.out.println(s.get());
        
        
        // using lambda expression
        System.out.println();
        Supplier<String> ss = () -> "Hello Java 8";
        System.out.println(ss.get());

    }
}
