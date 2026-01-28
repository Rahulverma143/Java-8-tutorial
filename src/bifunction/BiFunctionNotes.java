//package bifunction;

/*
What is BiFunction?

-> BiFunction is a functional interface introduced in JDK 1.8.
-> It is available in the java.util.function package.
-> It contains one abstract method: apply(T t, U u).
-> It accepts TWO input arguments.
-> It produces ONE result.
-> Mainly used when logic needs two inputs to produce a single output.
-> Widely used in functional programming and Stream API operations.

Method Signature

R apply(T t, U u);
-> T -> First input type (Generic)
-> U -> Second input type (Generic)
-> R -> Return type (Generic)

Key Points:
-> Takes two arguments, unlike Function which takes only one.
-> Returns a result.
-> Cannot be used where only one input is expected.

Supports default method:
  andThen(Function<? super R, ? extends V> after)

Does NOT support compose() because it has two inputs.

Common Use Cases:
-> Adding two numbers
-> Concatenating two strings
-> Combining two objects into one result
*/

/**
@FunctionalInterface
public interface BiFunction<T, U, R> {

  /**
   * Applies this function to the given arguments.
   *
   * @param t the first input argument
   * @param u the second input argument
   * @return the function result
   
  R apply(T t, U u);

  // Default method for chaining
  default <V> BiFunction<T, U, V> andThen(
          Function<? super R, ? extends V> after) { ... }
}
*/
