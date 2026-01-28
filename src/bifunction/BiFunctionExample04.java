package bifunction;

import java.util.function.BiFunction;

class EmployeeInfo implements BiFunction<String, Integer, String> {
    public String apply(String name, Integer id) {
        return "Name: " + name + ", ID: " + id;
    }
}

public class BiFunctionExample04 {

	public static void main(String[] args) {
		BiFunction<String, Integer, String> b = new EmployeeInfo();
		System.out.println(b.apply("Rahul", 101));
		
		
		// lambd expression
		
		String s = "Rahul Verma";
		int num = 100;
		System.out.println();
		BiFunction<String, Integer, String> b1 = (name, id)-> "Name : " + name + "Id : " + id;
		System.out.println(b1.apply(s, num));

	}

}
