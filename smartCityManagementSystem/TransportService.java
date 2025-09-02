package smartCityManagementSystem;

public interface TransportService {
    String getServiceName();
    String getSchedule();
    double getFare();  
    default void printServiceDetails() {
        System.out.println("Service Details:-\n"
                + "Service Name: " + getServiceName() + "\n"
                + "Schedule: " + getSchedule() + "\n"
                + "Fare: " + getFare());
    }
}
