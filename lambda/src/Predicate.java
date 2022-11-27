public interface Predicate<T> {
    boolean test(T t);

    default Predicate<T> and(Predicate<? super T> other) {
        return null;
    }

    default Predicate<T> negate() {
        return null;
    }

    default Predicate<T> or(Predicate<? super T> other) {
        return null;
    }

    static <T> Predicate<T> isEqual(Object targetOf) {
        return null;
    }

    static <T> Predicate<T> not(Predicate<? super T> target) {
        return null;
    }
}
