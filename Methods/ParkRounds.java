import java.util.Scanner;

public class ParkRounds {
    public static int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double distance = 5000; // 5 km in meters
        return (int)Math.ceil(distance/perimeter);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1 (meters): ");
        double s1 = sc.nextDouble();
        System.out.print("Enter side 2 (meters): ");
        double s2 = sc.nextDouble();
        System.out.print("Enter side 3 (meters): ");
        double s3 = sc.nextDouble();
        
        int rounds = calculateRounds(s1, s2, s3);
        System.out.println("Number of rounds needed: " + rounds);
    }
}