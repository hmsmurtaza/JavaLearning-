import java.util.function.Consumer;

public class LambdaRun {
    public static void main(String[] args) {
        /*Predicate<String> predicate = (String s) -> {
            return s.length() == 3;
        };*/
        // simpler form due to one parameter and one line of code in the method body
        Predicate<String> predicate = s -> s.length() == 3;

        Consumer<String> print = s -> System.out.println(s);

        Runnable runnable = () -> System.out.println("I'm running");
    }
}
