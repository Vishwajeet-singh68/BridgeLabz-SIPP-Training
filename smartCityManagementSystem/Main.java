package smartCityManagementSystem;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<TransportService> services = Arrays.asList(
                new BusService("08:00, 12:00, 18:00", 15),
                new MetroService("09:00, 15:00, 21:00", 20),
                new TaxiService("On Demand", 50),
                new AmbulanceService()
        );

        System.out.println("\nServices sorted by Fare:");
        services.stream()
                .filter(s -> !(s instanceof EmergencyService))
                .sorted(Comparator.comparingDouble(TransportService::getFare))
                .forEach(TransportService::printServiceDetails);

        System.out.println("\nService Names:");
        services.stream()
                .map(TransportService::getServiceName)
                .forEach(System.out::println);

        FareCalculator calculator = distance -> distance * 10; 
        calculator.printFare(12);

        Map<String, Double> revenueSummary = services.stream()
                .collect(Collectors.groupingBy(
                        TransportService::getServiceName,
                        Collectors.summingDouble(TransportService::getFare)
                ));
        System.out.println("\nRevenue Summary: " + revenueSummary);

        Map<Boolean, List<TransportService>> partitioned = services.stream()
                .collect(Collectors.partitioningBy(s -> s.getFare() > 20));
        System.out.println("\nPartitioned by Fare (>20): " + partitioned);

        System.out.println("\nFare Stats: " +
                services.stream()
                        .collect(Collectors.summarizingDouble(TransportService::getFare))
        );

        System.out.println("\nEmergency Services:");
        services.stream()
                .filter(s -> s instanceof EmergencyService)
                .forEach(TransportService::printServiceDetails);

        double distance = GeoUtils.calculateDistance(28.6139, 77.2090, 28.7041, 77.1025);
        System.out.println("\nDistance between two locations: " + distance + " km");
    }
}