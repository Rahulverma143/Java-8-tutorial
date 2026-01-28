//package biconsumer;

/*
What is BiConsumer?

-> BiConsumer is a functional interface introduced in JDK 1.8.
-> It is available in the java.util.function package.
-> It contains one abstract method: accept(T t, U u).
-> It accepts TWO input arguments.
-> It DOES NOT return any value.
-> Mainly used to perform operations like printing, logging, updating data using two inputs.
-> Widely used in functional programming and Stream API operations.

Method Signature

void accept(T t, U u);
-> T -> First input type (Generic)
-> U -> Second input type (Generic)
-> No return type (void)

Key Points:
-> BiConsumer consumes two inputs and performs an action.
-> It does not produce any result.
-> Used when output is not required but two inputs are involved.

Supports default method:
andThen(BiConsumer<? super T, ? super U> after)

Works seamlessly with Streams for forEach() operations with key-value pairs, maps, etc.

*/

/**
@FunctionalInterface
public interface BiConsumer<T, U> {

/**
 * Performs this operation on the given arguments.
 *
 * @param t the first input argument
 * @param u the second input argument
 
void accept(T t, U u);

// Default method for chaining
default BiConsumer<T, U> andThen(BiConsumer<? super T, ? super U> after) { ... }
}
*/
