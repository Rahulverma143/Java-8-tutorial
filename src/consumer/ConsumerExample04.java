package consumer;

import java.util.function.Consumer;

class UpperCasePrint implements Consumer<String> {
	public void accept(String s) {
		System.out.println(s.toUpperCase());
	}
}

public class ConsumerExample04 {

	public static void main(String[] args) {
		Consumer<String> cc = new UpperCasePrint();
		cc.accept("Rahul verma");
		
		
		
		// lambd expression
		System.out.println();
		Consumer<String> c = s -> System.out.println(s.toUpperCase());
		c.accept("java");
	}

}
