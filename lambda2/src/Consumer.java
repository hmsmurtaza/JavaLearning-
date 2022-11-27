@FunctionalInterface
public interface Consumer<T>{
    void accept(T t);

    // default Consumer<T> andThen(Consumer<? super T> after)
    default void andThen(Consumer<? super T> after) {
        // the body of this method has been removed
        System.out.println("inside andThen method");
    }
}
