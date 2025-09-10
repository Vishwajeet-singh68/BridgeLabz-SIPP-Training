import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;
    Alert(String t) { type = t; }
    public String toString() { return type; }
}

public class NotificationFiltering {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
            new Alert("Critical"),
            new Alert("Normal"),
            new Alert("Urgent"),
            new Alert("Info")
        );

        Predicate<Alert> criticalOrUrgent = a -> a.type.equals("Critical") || a.type.equals("Urgent");

        alerts.stream().filter(criticalOrUrgent).forEach(System.out::println);
    }
}
