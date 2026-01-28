package predicate;
import java.util.function.Predicate;

public class PredicateUseOfAndOrNegate {
    public static void main(String[] args) {

    	
    	System.out.println("Predicate with and()");
      System.out.println("greater than 10 AND even check");
    	 
        Predicate<Integer> p1 = n -> n > 10;
        Predicate<Integer> p2 = n -> n % 2 == 0;

        Predicate<Integer> p = p1.and(p2);

        System.out.println(p.test(12)); // true
        System.out.println(p.test(15)); // false
        System.out.println();
        System.out.println("Predicate with or()");
        
        Predicate<Integer> p3 = n -> n < 0;
        Predicate<Integer> p4 = n -> n > 100;

        System.out.println(p3.or(p4).test(-5));   // true
        System.out.println(p3.or(p4).test(50));   // false
     
        System.out.println();
        System.out.println("Predicate with negate()");
        System.out.println("negate() means NOT");
        
        Predicate<Integer> p5 = n -> n > 10;

        System.out.println(p5.negate().test(5));   // true
        System.out.println(p5.negate().test(20));  // false

    }
}

