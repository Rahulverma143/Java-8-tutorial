package function;

import java.util.function.Function;

public class FunctionExample02 {

	public static void main(String[] args) {
		String [] s = {"Rahul", "Devansh", "Tarun", "Ajay"};
		
		Function<String, String> convertToUpperCase = ss -> ss.toUpperCase();
		System.out.println(convertToUpperCase.apply(s[2]));
		
		
		System.out.println();
		for(String sss : s) {
			System.out.println(convertToUpperCase.apply(sss));
		}
	}
}
