package bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateAllMethods {
    public static void main(String[] args) {

        // test(T t, U u)
        BiPredicate<Integer, Integer> isSumEven =
                (a, b) -> (a + b) % 2 == 0;

        System.out.println(isSumEven.test(10, 20)); // true


        //  and(BiPredicate other)
        BiPredicate<Integer, Integer> bothPositive =
                (a, b) -> a > 0 && b > 0;

        BiPredicate<Integer, Integer> sumEvenAndPositive =
                isSumEven.and(bothPositive);

        System.out.println(sumEvenAndPositive.test(10, 20)); // true
        System.out.println(sumEvenAndPositive.test(-10, 20)); // false


        // or(BiPredicate other)
        BiPredicate<Integer, Integer> sumEvenOrPositive =
                isSumEven.or(bothPositive);

        System.out.println(sumEvenOrPositive.test(3, 5)); // true
        System.out.println(sumEvenOrPositive.test(-3, -5)); // true


        //  negate()
        BiPredicate<Integer, Integer> notSumEven =
                isSumEven.negate();

        System.out.println(notSumEven.test(10, 20)); // false
    }
}
