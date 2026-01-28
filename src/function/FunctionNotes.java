//package function;

/*
What is Function?

-> Function is a functional interface introduced in JDK 1.8.
-> It is available in the java.util.function package.
-> It contains one abstract method: apply(T t).
-> It accepts one input argument of type T and produces a result of type R.
-> Mainly used for transforming data (mapping one type to another).
-> Widely used in functional programming and Stream API operations.

Method Signature

R apply(T t);
-> T -> Input type (Generic)
-> R -> Return type (Generic)

Supports default methods like:
    andThen(Function<? super R, ? extends V> after)
    compose(Function<? super V, ? extends T> before)
    identity() -> returns input as output

Works seamlessly with Streams for map/filter/collect operations.

*/

/**
@FunctionalInterface
public interface Function<T, R> {

    /**
     * Applies this function to the given argument.
     *
     * @param t the input argument
     * @return the function result
     
    R apply(T t);

    // Default methods for chaining
    default <V> Function<T, V> andThen(Function<? super R, ? extends V> after) { ... }
    default <V> Function<V, R> compose(Function<? super V, ? extends T> before) { ... }
    static <T> Function<T, T> identity() { ... }
}
*/

