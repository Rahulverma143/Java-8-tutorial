package consumer;

import java.util.function.Consumer;

class SquareNumber implements Consumer<Integer> {
	public void accept(Integer n) {
		System.out.println(n * n);
	}
}

public class ConsumerExample03 {
	public static void main(String[] args) {
		Consumer<Integer> c = new SquareNumber();
		c.accept(14);

		
		// lambda expression
		System.out.println();
		Consumer<Integer> cc = n -> System.out.println(n * n);
		cc.accept(5);

	}
}
