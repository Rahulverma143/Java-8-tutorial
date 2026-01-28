package bifunction;

import java.util.function.BiFunction;

class AddNumbers implements BiFunction<Integer, Integer, Integer> {
	@Override
	public Integer apply(Integer a, Integer b) {
		return a + b;
	}
}

public class BiFunctionExample01 {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> bf = new AddNumbers();
		System.out.println(bf.apply(10, 20)); // 30
		
		// with lambda 
		System.out.println();
		BiFunction<Integer, Integer, Integer> bff = (a, b) -> a - b;
		System.out.println(bff.apply(20, 40));

	}
}
