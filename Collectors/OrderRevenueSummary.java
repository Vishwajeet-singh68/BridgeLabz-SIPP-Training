
import java.util.*;
import java.util.stream.*;

class Order {
    String customer;
    double total;
    Order(String customer, double total) { this.customer = customer; this.total = total; }
}

public class OrderRevenueSummary {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
            new Order("Alice", 250.0),
            new Order("Bob", 300.0),
            new Order("Alice", 150.0),
            new Order("Charlie", 400.0)
        );

        Map<String, Double> revenueByCustomer = orders.stream()
            .collect(Collectors.groupingBy(o -> o.customer, Collectors.summingDouble(o -> o.total)));

        revenueByCustomer.forEach((customer, total) -> System.out.println(customer + " -> " + total));
    }
}
