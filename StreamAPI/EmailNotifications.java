
import java.util.*;

public class EmailNotifications {
    static void sendEmailNotification(String email) {
        System.out.println("Sending email to: " + email);
    }

    public static void main(String[] args) {
        List<String> emails = Arrays.asList("a@example.com", "b@example.com", "c@example.com");
        emails.forEach(email -> sendEmailNotification(email));
    }
}
