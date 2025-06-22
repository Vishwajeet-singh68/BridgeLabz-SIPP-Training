import java.util.Scanner;

public class CalculateSimpleInterest {
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal*rate*time)/100;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter Rate: ");
        double r = sc.nextDouble();
        System.out.print("Enter Time: ");
        double t = sc.nextDouble();
        
        double si = calculateSimpleInterest(p, r, t);
        System.out.println("The Simple Interest is " + si + " for Principal " + p + ", Rate of Interest " + r + " and Time " + t);
    }
}