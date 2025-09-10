
interface UnitConverter {
    static double kmToMiles(double km) { return km * 0.621371; }
    static double kgToLbs(double kg) { return kg * 2.20462; }
}

public class ConversionTool {
    public static void main(String[] args) {
        System.out.println("10 km in miles: " + UnitConverter.kmToMiles(10));
        System.out.println("5 kg in lbs: " + UnitConverter.kgToLbs(5));
    }
}
