package function;

import java.util.function.Function;

public class FunctionExample04 implements Function<Integer, String> {

	public String apply(Integer i) {
		return "Value: " + i;
	}

	public static void main(String[] args) {

		Function<Integer, String> f = new FunctionExample04();
		System.out.println(f.apply(20));
		
		
		// with lambda expression
		System.out.println();
		Function<Integer, String> f1 = i -> "Value: " + i;
		System.out.println(f1.apply(210));

	}

}
