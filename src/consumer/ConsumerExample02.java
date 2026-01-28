package consumer;

import java.util.function.Consumer;

class StringLength implements Consumer<String> {
    public void accept(String s) {
        System.out.println(s.length());
    }
}

public class ConsumerExample02 {
		public static void main(String[] args) {
			Consumer<String> c = new StringLength();
			c.accept("Java programming");
			
			// lambda expression
			System.out.println();
			
			String s = "Rahul Verma";
			Consumer<String> cc = str -> System.out.println(s.length());
			cc.accept(s);

		}
}
