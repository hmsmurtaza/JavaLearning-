@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);

    /*default Predicate<T> and(Predicate<? super T> other) {

    }*/

    /*default Predicate<T> negate() {

    }*/

    /*default Predicate<T> or(Predicate<? super T> other) {

    }*/

    /*static <T> Predicate<T> isEqual(Object targetRef) {

    }*/

    /*static <T> Predicate<T> not(Predicate<? super T> target) {

    }*/
}
