
import java.util.*;
import java.util.stream.*;

public class IoTSensorReadings {
    public static void main(String[] args) {
        List<Integer> readings = Arrays.asList(45, 72, 90, 30, 85);
        readings.stream()
                .filter(r -> r > 70)
                .forEach(r -> System.out.println("High Reading: " + r));
    }
}
