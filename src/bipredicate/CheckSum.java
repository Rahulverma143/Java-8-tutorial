package bipredicate;

import java.util.function.BiPredicate;
   // with lambda expression
public class CheckSum {
    public static void main(String[] args) {

        BiPredicate<Integer, Integer> bp = (a, b) -> a > b;

        System.out.println(bp.test(100, 20)); 
    }
}

//package biPredicate;
//
//import java.util.function.BiPredicate;
//   without lambda expression
//public class CheckSum implements BiPredicate<Integer, Integer> {
//
//	@Override
//	public boolean test(Integer a, Integer b) {
//
//		return (a + b) > 20;
//	}
//
//	public static void main(String[] args) {
//		BiPredicate<Integer, Integer> bp = new CheckSum();
//		System.out.println(bp.test(10, 20));
//
//	}
//}