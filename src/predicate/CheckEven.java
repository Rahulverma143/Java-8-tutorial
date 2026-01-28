//package predicate;
//
//import java.util.function.Predicate;
//
//   // Without Lambda Expression
//
//public class CheckEven implements Predicate<Integer> {
//
//	@Override
//	public boolean test(Integer numbers) {
//
//		return numbers % 2 == 0;
//	}
//
//	public static void main(String[] args) {
//
//		Predicate<Integer> p = new CheckEven();
//		System.out.println(p.test(10));
//		
//
//	}
//
//}
//

// =================== with Lambda expression =================

package predicate;

import java.util.function.Predicate;

public class CheckEven {
	public static void main(String[] args) {
		int n = 20;
		Predicate<Integer> p = num -> num % 2 == 0;
		System.out.println(p.test(n));
	}
}


//===============================================================

//package predicate;
//
//import java.util.function.Predicate;
//
//public class CheckEven {
//    public static void main(String[] args) {
//
//        int n = 20;   // number to check
//
//        // Anonymous Inner Class implementation of Predicate
//        Predicate<Integer> p = new Predicate<Integer>() {
//
//            @Override
//            public boolean test(Integer num) {
//                // checks whether the number is even
//                return num % 2 == 0;
//            }
//        };
//
//        // Calls test() method and prints the result
//        System.out.println(p.test(n));
//    }
//}
