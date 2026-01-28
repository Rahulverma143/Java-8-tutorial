package bifunction;

import java.util.function.BiFunction;

class MaxNumber implements BiFunction<Integer, Integer, Integer> {
	public Integer apply(Integer a, Integer b) {
		return (a > b) ? a : b;
	}
}

public class BiFunctionExample03 {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> bf = new MaxNumber();
		System.out.println(bf.apply(20, 40));
		
		
		
		// lamda function
		System.out.println();
		int num1 = 10;
		int num2 = 15;
		BiFunction<Integer, Integer, Integer> bff = (a, b) -> a > b ? a : b;

		System.out.println(bff.apply(num1, num2));

	}

}
