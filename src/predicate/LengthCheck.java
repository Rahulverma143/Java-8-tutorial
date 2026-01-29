//package predicate;
//
//import java.util.function.Predicate;
//     Without lambda expression
//public class LengthCheck implements Predicate<String> {
//	@Override
//	public boolean test(String s) {
//		
//		return s.length() > 5;
//	}
//
//	public static void main(String[] args) {
//		Predicate<String> p = new LengthCheck();
//		System.out.println(p.test("Rahul"));    // false
//		System.out.println(p.test("RahulVerma"));   // true
//	}
//}

//  =========== OR ==================


//package predicate;
//import java.util.function.Predicate;
//
//public class LengthCheck {
//    public static void main(String[] args) {
//    Anonumous inner class
//        Predicate<String> p = new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.length() > 5;
//            }
//        };
//
//        System.out.println(p.test("Hello"));     // false
//        System.out.println(p.test("Welcome"));   // true
//    }
//}


//With lambda expression 
package predicate;
import java.util.function.Predicate;

public class LengthCheck {
    public static void main(String[] args) {

        Predicate<String> p = s -> s.length() > 5;

        System.out.println(p.test("Hello"));     // false
        System.out.println(p.test("Welcome"));   // true
    }
}
