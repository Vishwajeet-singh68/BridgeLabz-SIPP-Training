import java.util.*;
public class KilometersToMiles2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the distance in Kilometers");
        double distanceInKM=in.nextInt();
        double distanceInMiles=distanceInKM/1.6;
        System.out.println("The distance "+distanceInKM+"km in miles is "+distanceInMiles);
    }
}
