package smartCityManagementSystem;

@FunctionalInterface
public interface FareCalculator {
    double calculateFare(double distance);

    default void printFare(double distance) {
        System.out.println("Calculated Fare: " + calculateFare(distance));
    }
}
