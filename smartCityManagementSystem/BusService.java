package smartCityManagementSystem;

public class BusService implements TransportService {
    private String schedule;
    public int distance;    
    private double fare;

    public BusService(String schedule, double fare) {
        this.schedule = schedule;
        this.fare = fare;
    }

    @Override
    public String getServiceName() {
        return "Bus";
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
