
import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        Function<String, Integer> lengthChecker = str -> str.length();
        String message = "Hello, World!";
        int length = lengthChecker.apply(message);
        System.out.println("Message length: " + length);
    }
}
