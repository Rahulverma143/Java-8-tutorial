//package predicate; 

/*
What is Predicate?

-> Predicate is a functional interface (SAM – Single Abstract Method) introduced in JDK 1.8.
-> It is available in the java.util.function package.
-> It contains one abstract method: test(T t).
-> It accepts one input argument.
-> It always returns a boolean value (true / false).
-> Mainly used for condition checking.
-> Commonly used for filtering data.
-> It is widely used in functional programming and Stream API operations.


   Method Signature
   
   boolean test(T t);
   -> T -> Any type (Generic)
   
   
   Supports default methods like:
    and()
    or()
    negate()
  Works seamlessly with Streams
 */


/**
@FunctionalInterface
public interface Predicate<T> {

    /**
     * Evaluates this predicate on the given argument.
     *
     * @param t the input argument
     * @return {@code true} if the input argument matches the predicate,
     * otherwise {@code false}
    
    boolean test(T t);
     */

    


//public class PredicateNotes {
//
//}
package predicate;


