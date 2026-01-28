package predicate;
import java.util.*;
import java.util.function.Predicate;

public class PredicateWithCollectionUse {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5, 12, 18, 3, 20);

        Predicate<Integer> p = n -> n > 10;

        for (Integer i : list) {
            if (p.test(i)) {
                System.out.println(i);
            }
        }
    }
}
