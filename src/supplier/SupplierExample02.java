package supplier;

import java.util.function.Supplier;

class RandomNumberSupplier implements Supplier<Double> {
    public Double get() {
        return Math.random();
    }
}

public class SupplierExample02 {
	public static void main(String[] args) {
		Supplier<Double> s = new RandomNumberSupplier();
		System.out.println(s.get());
		
		// using lambda expression
		
		Supplier<Double> ss = () -> Math.random();
		System.out.println(ss.get());

	}

}
