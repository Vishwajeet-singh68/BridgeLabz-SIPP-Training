
import java.util.*;
import java.util.stream.*;
import java.util.function.Function;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String paragraph = "hello world hello java stream world java collectors";
        List<String> words = Arrays.asList(paragraph.split(" "));

        Map<String, Long> frequency = words.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        frequency.forEach((word, count) -> System.out.println(word + ": " + count));
    }
}
