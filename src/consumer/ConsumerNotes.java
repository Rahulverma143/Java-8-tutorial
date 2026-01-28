package consumer;
//package function;

/*
What is Consumer?

-> Consumer is a functional interface introduced in JDK 1.8.
-> It is available in the java.util.function package.
-> It contains one abstract method: accept(T t).
-> It accepts ONE input argument.
-> It DOES NOT return any value.
-> Mainly used to perform operations like printing, logging, updating data.
-> Widely used in functional programming and Stream API operations.

Method Signature

void accept(T t);
-> T -> Input type (Generic)
-> No return type (void)

Key Points:
-> Consumer consumes the data.
-> It performs action but does not produce result.
-> Used when output is not required.

Supports default method:
  andThen(Consumer<? super T> after)

Works seamlessly with Streams for forEach() operations.

*/

/**
@FunctionalInterface
public interface Consumer<T> {

  /**
   * Performs this operation on the given argument.
   *
   * @param t the input argument
   
  void accept(T t);

  // Default method for chaining
  default Consumer<T> andThen(Consumer<? super T> after) { ... }
}
*/
