//package bipredicate;

/*
What is BiPredicate?

-> BiPredicate is a functional interface (SAM – Single Abstract Method) introduced in JDK 1.8.
-> It is available in the java.util.function package.
-> It contains one abstract method: test(T t, U u).
-> It accepts TWO input arguments.
-> It always returns a boolean value (true / false).
-> Mainly used for condition checking involving two values.
-> Commonly used for filtering or matching data based on two inputs.
-> It is widely used in functional programming and Stream API operations.

Method Signature

boolean test(T t, U u);
-> T -> First input type (Generic)
-> U -> Second input type (Generic)

Supports default methods like:
and()
or()
negate()
Works seamlessly with Streams
*/

/**
@FunctionalInterface
public interface BiPredicate<T, U> {

/**
 * Evaluates this predicate on the given arguments.
 *
 * @param t the first input argument
 * @param u the second input argument
 * @return {@code true} if the input arguments match the predicate,
 * otherwise {@code false}
 * boolean test(T t, U u);
 * 
 * }
 
   
*/
