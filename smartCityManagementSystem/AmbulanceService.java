package smartCityManagementSystem;

public class AmbulanceService implements TransportService, EmergencyService {

    @Override
    public String getServiceName() {
        return "Ambulance";
    }

    @Override
    public String getSchedule() {
        return "Available 24/7";
    }

    @Override
    public double getFare() {
        return 0; 
    }
}
