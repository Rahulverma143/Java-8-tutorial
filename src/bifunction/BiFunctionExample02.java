package bifunction;

import java.util.function.BiFunction;

class ConcatStrings implements BiFunction<String, String, String> {
    public String apply(String s1, String s2) {
        return s1 + " " + s2;
    }
}

public class BiFunctionExample02 {
	public static void main(String[] args) {
		BiFunction<String, String, String> bf = new ConcatStrings();
		System.out.println(bf.apply("Rahul", "Verma"));
		
		
		// with lambda function
		BiFunction<String, String, String> bff = (a, b) -> a + " " + b;
		System.out.println(bff.apply("Java","Programming"));
	}

}
