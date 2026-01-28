//package predicate;
//
//import java.util.function.Predicate;
//
//     //  Without Lambda Expression
//
//class GreaterThanTen implements Predicate<Integer> {
//
//    @Override
//    public boolean test(Integer n) {
//        return n > 10;
//    }
//}
//
//public class TestPredicate {
//
//    public static void main(String[] args) {
//
//        Predicate<Integer> p = new GreaterThanTen();
//
//        System.out.println(p.test(5));   // false
//        System.out.println(p.test(15));  // true
//    }
//}
//  =============================================================================
//  With lambda Expression

//package predicate;
//
//import java.util.function.Predicate;
//
//public class TestPredicate {
//	public static void main(String[] args) {
//		Predicate<Integer> p = num -> num > 15;
//		System.out.println(p.test(5));   // false
//		System.out.println(p.test(20));   // true
//	}
//}