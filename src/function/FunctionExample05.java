package function;

import java.util.function.Function;

public class FunctionExample05 {
	public static void main(String[] args) {
		
		// remove space 
		Function<String, String> f = s -> s.replaceAll(" ", "");
		System.out.println(f.apply("My name is rahul verma"));
		
		Function<String, Integer>  f1 = s1 -> s1.length();
		System.out.println(f1.apply("Rahul verma"));
		
		
	}

}
