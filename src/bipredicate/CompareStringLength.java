package bipredicate;
import java.util.function.BiPredicate;
  // with lambda expression
public class CompareStringLength {
    public static void main(String[] args) {

        BiPredicate<String, String> bp =
                (s1, s2) -> s1.length() == s2.length();

        System.out.println(bp.test("Java", "Code")); // true
        System.out.println(bp.test("Hi", "Hello"));  // false
    }
}


//package bipredicate;
//
//import java.util.function.BiPredicate;
//
//    withoiut lambda expression 
//class CompareLength implements BiPredicate<String, String> {
//
//    @Override
//    public boolean test(String s1, String s2) {
//        return s1.length() == s2.length();
//    }
//}
//
//public class CompareStringLength {
//    public static void main(String[] args) {
//
//        
//        BiPredicate<String, String> bp = new CompareLength();
//
//        System.out.println(bp.test("Java", "Code")); // true
//        System.out.println(bp.test("Hi", "Hello"));  // false
//    }
//}
