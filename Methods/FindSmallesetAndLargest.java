import java.util.Scanner;

public class FindSmallesetAndLargest {
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int[] result = new int[2];
        
        // Find smallest
        int smallest = number1;
        if(number2<smallest) {
            smallest = number2;
        }
        if(number3<smallest) {
            smallest = number3;
        }
        result[0] = smallest;
        
        // Find largest
        int largest = number1;
        if(number2>largest) {
            largest = number2;
        }
        if(number3>largest) {
            largest = number3;
        }
        result[1] = largest;
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        
        int[] result = findSmallestAndLargest(num1, num2, num3);
        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);
    }
}