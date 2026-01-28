package biconsumer;

import java.util.function.BiConsumer;

class SumNumbers implements BiConsumer<Integer, Integer> {
    @Override
    public void accept(Integer a, Integer b) {
        System.out.println(a + b);
    }
}

public class BiConsumerExample02 {
	public static void main(String[] args) {
		
		BiConsumer<Integer, Integer> bb = new SumNumbers();
		bb.accept(80, 21);
		
		
		// with lambda expression
		System.out.println();
		BiConsumer<Integer, Integer> bc = (a, b) -> System.out.println(a + b);
		bc.accept(10, 20); // 30

	}

}
