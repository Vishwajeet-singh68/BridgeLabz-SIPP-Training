import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    double discount;
    Product(String n, double p, double r, double d) {
        name = n; price = p; rating = r; discount = d;
    }
    public String toString() {
        return name + " " + price + " " + rating + " " + discount;
    }
}

public class CustomSorting {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("A", 500, 4.5, 10),
            new Product("B", 300, 4.8, 20),
            new Product("C", 700, 4.1, 15)
        );

        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        System.out.println("By Price: " + products);

        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        System.out.println("By Rating: " + products);

        products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
        System.out.println("By Discount: " + products);
    }
}
