package bipredicate;

import java.util.function.BiPredicate;
  // with lambda expression
public class BiPredicateExample03 {
	public static void main(String[] args) {
		BiPredicate<String, String> bp = (s1, s2) -> s1.charAt(0) == s2.charAt(0);

		System.out.println(bp.test("Java", "Java8")); // true
		System.out.println(bp.test("Hello", "World")); // false

	}
}
	

//package bipredicate;
//
//import java.util.function.BiPredicate;
//
//    without lambda expression
//class FirstCharCompare implements BiPredicate<String, String> {
//
//    @Override
//    public boolean test(String s1, String s2) {
//        return s1.charAt(0) == s2.charAt(0);
//    }
//}
//
//public class BiPredicateExample03 {
//
//    public static void main(String[] args) {
//
//        BiPredicate<String, String> bp = new FirstCharCompare();
//
//        System.out.println(bp.test("Java", "Java8")); // true
//        System.out.println(bp.test("Hello", "World")); // false
//    }
//}
