
import java.util.*;
import java.util.stream.*;

class Doctor {
    String name;
    String specialty;
    boolean weekendAvailable;
    Doctor(String name, String specialty, boolean weekendAvailable) {
        this.name = name; this.specialty = specialty; this.weekendAvailable = weekendAvailable;
    }
    public String toString() { return name + " - " + specialty; }
}

public class HospitalDoctorAvailability {
    public static void main(String[] args) {
        List<Doctor> doctors = Arrays.asList(
            new Doctor("Dr. A", "Cardiology", true),
            new Doctor("Dr. B", "Neurology", false),
            new Doctor("Dr. C", "Orthopedics", true),
            new Doctor("Dr. D", "Dermatology", true)
        );

        doctors.stream()
               .filter(d -> d.weekendAvailable)
               .sorted(Comparator.comparing(d -> d.specialty))
               .forEach(System.out::println);
    }
}
