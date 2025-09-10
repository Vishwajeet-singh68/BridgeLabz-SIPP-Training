package smartCityManagementSystem;

public class MetroService implements TransportService {
    private String schedule;
    private double fare;

    public MetroService(String schedule, double fare) {
        this.schedule = schedule;
        this.fare = fare;
    }

    @Override
    public String getServiceName() {
        return "Metro";
    }

    @Override
    public String getSchedule() {
        return schedule;
    }

    @Override
    public double getFare() {
        return fare;
    }
}