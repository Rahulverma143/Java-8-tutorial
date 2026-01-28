package bipredicate;
import java.util.function.BiPredicate;

public class BiPredicateExample01 {
    public static void main(String[] args) {

        BiPredicate<Integer, Integer> bp = (a, b) -> (a + b) > 10;

        System.out.println(bp.test(3, 4));   // false
        System.out.println(bp.test(6, 7));   // true
    }
}

//package bipredicate;
//
//import java.util.function.BiPredicate;
//
//public class BiPredicateExample01 implements BiPredicate<Integer, Integer> {
//
//	@Override
//	public boolean test(Integer a, Integer b) {
//
//		return a + b > 10;
//	}
//
//	public static void main(String[] args) {
//
//		BiPredicate<Integer, Integer> bp = new BiPredicateExample1();
//		System.out.println(bp.test(3, 2)); // false
//	}
//
//}