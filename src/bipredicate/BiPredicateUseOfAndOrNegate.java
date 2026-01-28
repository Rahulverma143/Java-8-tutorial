package bipredicate;
import java.util.function.BiPredicate;

public class BiPredicateUseOfAndOrNegate {
    public static void main(String[] args) {

        BiPredicate<Integer, Integer> bp1 = (a, b) -> a > b;
        BiPredicate<Integer, Integer> bp2 = (a, b) -> a % 2 == 0;

        BiPredicate<Integer, Integer> bp = bp1.and(bp2);
        System.out.println("Using and()");
        System.out.println(bp.test(10, 5)); // true
        System.out.println(bp.test(9, 5));  // false
        
        System.out.println();
        System.out.println("Using or()");
        BiPredicate<Integer, Integer> bp3 = (a, b) -> a < 0;
        BiPredicate<Integer, Integer> bp4 = (a, b) -> b < 0;

        System.out.println(bp3.or(bp4).test(-1, 5)); // true
        System.out.println(bp3.or(bp4).test(3, 4));  // false

        
        
    }
}
