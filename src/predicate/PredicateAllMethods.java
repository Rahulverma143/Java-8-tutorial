package predicate;

import java.util.function.Predicate;

public class PredicateAllMethods {
    public static void main(String[] args) {

        // test(T t)
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Is Even: " + isEven.test(10));   // true


        // and(Predicate other)
        Predicate<Integer> isGreaterThan10 = num -> num > 10;
        Predicate<Integer> evenAndGreaterThan10 = isEven.and(isGreaterThan10);

        System.out.println("Even AND >10: " + evenAndGreaterThan10.test(12)); // true


        // or(Predicate other)
        Predicate<Integer> evenOrGreaterThan10 = isEven.or(isGreaterThan10);

        System.out.println("Even OR >10: " + evenOrGreaterThan10.test(7)); // false
        System.out.println("Even OR >10: " + evenOrGreaterThan10.test(11)); // true


        // negate()
        Predicate<Integer> isOdd = isEven.negate();

        System.out.println("Is Odd: " + isOdd.test(9)); // true


        // isEqual(Object targetRef) – static method
        Predicate<String> isHello = Predicate.isEqual("Hello");

        System.out.println("Is Equal Hello: " + isHello.test("Hello")); // true
        System.out.println("Is Equal Hello: " + isHello.test("Hi"));    // false
    }
}
