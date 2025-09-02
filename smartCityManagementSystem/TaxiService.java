package smartCityManagementSystem;

public class TaxiService implements TransportService {
    private String schedule;
    private double fare;

    public TaxiService(String schedule, double fare) {
        this.schedule = schedule;
        this.fare = fare;
    }

    @Override
    public String getServiceName() {
        return "Taxi";
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
