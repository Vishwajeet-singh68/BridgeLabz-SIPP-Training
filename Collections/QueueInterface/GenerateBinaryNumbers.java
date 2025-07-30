package Collections.QueueInterface;
import java.util.*;

public class GenerateBinaryNumbers {

    public static List<String> generateBinary(int N) {
        List<String> result = new ArrayList<>();
        Queue<String> q = new LinkedList<>();

        q.add("1");

        while (N-- > 0) {
            String current = q.remove();
            result.add(current);

            q.add(current + "0");
            q.add(current + "1");
        }

        return result;
    }

    public static void main(String[] args) {
        int N = 5;
        List<String> binaryNumbers = generateBinary(N);

        System.out.println("First " + N + " binary numbers: " + binaryNumbers);
    }
}
