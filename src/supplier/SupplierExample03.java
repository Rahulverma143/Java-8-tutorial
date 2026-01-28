package supplier;
import java.util.Date;
import java.util.function.Supplier;

class DateSupplier implements Supplier<Date> {
    public Date get() {
        return new Date();
    }
}

public class SupplierExample03 {
	public static void main(String[] args) {
		Supplier<Date> s = new DateSupplier();
		System.out.println(s.get());
		System.out.println(s.getClass());
		System.out.println(s.hashCode());
		
		// using lambda expression
		System.out.println();
		Supplier<Date> ss = () -> new Date();
		System.out.println(ss.get());
		System.out.println(ss.getClass());
		System.out.println(ss.hashCode());
		
		

	}

}
