public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm=6378;
        double volumeKm3=(4.0/3.0)*22/7*radiusKm*radiusKm*radiusKm;
        double kmToMiles=0.621371;
        double radiusMiles=radiusKm*kmToMiles;
        double volumeMiles3=(4.0/3.0)*22/7*radiusMiles*radiusMiles*radiusMiles;
        System.out.println("The volume of earth in cubic kilometers is "+volumeKm3+" and cubic miles is "+volumeMiles3);
    }
}
