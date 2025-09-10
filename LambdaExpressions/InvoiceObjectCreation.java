import java.util.*;
import java.util.stream.*;

class Invoice {
    String transactionId;
    Invoice(String id) { transactionId = id; }
    public String toString() { return "Invoice: " + transactionId; }
}

public class InvoiceObjectCreation {
    public static void main(String[] args) {
        List<String> transactionIds = Arrays.asList("TXN001", "TXN002", "TXN003");
        List<Invoice> invoices = transactionIds.stream().map(Invoice::new).toList();
        invoices.forEach(System.out::println);
    }
}
