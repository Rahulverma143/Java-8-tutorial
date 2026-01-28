package function;

import java.util.function.Function;
  // Write a program to convert the String in toUpperCase

public class FunctionExample01 implements Function<String, String> {
	@Override
	public String apply(String s) {
		
		return s.toUpperCase();
	}
	public static void main(String[] args) {
		Function<String, String> f = new FunctionExample01();
		System.out.println(f.apply("Rahul"));
		
		
		System.out.println();
		System.out.println("With lambda expression");
		
		Function<String, String> f1 = s -> s.toUpperCase();
		System.out.println(f1.apply("Rahul Verma"));
	}

}
