import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.function.Function;

@FunctionalInterface    // functional interface is an interface that has only one method
public interface Runnable {
    public abstract void run();
}

