//package supppier;

/*
What is Supplier?

-> Supplier is a functional interface introduced in JDK 1.8.
-> It is available in the java.util.function package.
-> It contains one abstract method: get().
-> It does NOT accept any input arguments.
-> It produces a result of type T.
-> Mainly used to generate or supply values/data.
-> Widely used in functional programming and Stream API operations.

Method Signature

T get();
-> T -> Return type (Generic)
-> No input argument

Key Points:
-> Supplier provides data/value.
-> It does not take input.
-> Used when you want to generate or supply something on demand.

Supports default methods like:
// No default method for basic Supplier
// Can be used with other functions for chaining using custom logic

Works seamlessly with Streams, lazy evaluation, and object creation.

*/

/**
@FunctionalInterface
public interface Supplier<T> {

/**
 * Gets a result.
 *
 * @return a result of type T
   
T get();
}
*/
package supplier;


