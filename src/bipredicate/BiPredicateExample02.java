package bipredicate;
import java.util.function.BiPredicate;

public class BiPredicateExample02 {
    public static void main(String[] args) {

        BiPredicate<Integer, Integer> bp =
                (a, b) -> a % 2 == 0 && b % 2 == 0;

        System.out.println(bp.test(4, 6)); // true
        System.out.println(bp.test(4, 5)); // false
    }
}


//package bipredicate;
//
//import java.util.function.BiPredicate;
//
//// Implementation class
//class EvenNumbersCheck implements BiPredicate<Integer, Integer> {
//
//    @Override
//    public boolean test(Integer a, Integer b) {
//       
//        return a % 2 == 0 && b % 2 == 0;
//    }
//}
//
//public class BiPredicateExample02 {
//
//    public static void main(String[] args) {
//
//        // Create object of implementation class
//        BiPredicate<Integer, Integer> bp = new EvenNumbersCheck();
//
//        System.out.println(bp.test(4, 6)); // true
//        System.out.println(bp.test(4, 5)); // false
//    }
//}
