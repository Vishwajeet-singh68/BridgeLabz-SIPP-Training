// Q6_OnlineRetailOrder.java
// Demonstrates multilevel inheritance: Order -> ShippedOrder -> DeliveredOrder

import java.time.LocalDate;

class Order {
    private String orderId;
    private LocalDate orderDate;

    public Order(String orderId, LocalDate orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order placed";
    }
}

class ShippedOrder extends Order {
    private String trackingNumber;

    public ShippedOrder(String orderId, LocalDate orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order shipped, Tracking: " + trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    private LocalDate deliveryDate;

    public DeliveredOrder(String orderId, LocalDate orderDate, String trackingNumber, LocalDate deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }
}

public class OnlineRetailOrder {
    public static void main(String[] args) {
        Order o1 = new Order("ORD123", LocalDate.of(2025, 7, 1));
        ShippedOrder o2 = new ShippedOrder("ORD124", LocalDate.of(2025, 7, 2), "TRK987");
        DeliveredOrder o3 = new DeliveredOrder("ORD125", LocalDate.of(2025, 7, 3), "TRK654", LocalDate.of(2025, 7, 5));
        System.out.println(o1.getOrderStatus());
        System.out.println(o2.getOrderStatus());
        System.out.println(o3.getOrderStatus());
    }
}
