import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> predicate =
                (String s) -> {
                    return s.length() == 3;
                };

        // For single parameter, no need of parenthesis
        // For more than one parameter or no parameter, empty parenthesis
        // will be used
        // while for single statement in the body, no need of curly braces
        // and return keyword
        // Predicate<String> predicate = s -> s.length() == 3;

        System.out.println(predicate.test("Sho"));


        DoubleUnaryOperator sqrt = Math::sqrt;
    }
}
