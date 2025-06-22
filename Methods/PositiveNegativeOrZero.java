import java.util.Scanner;

public class PositiveNegativeOrZero {
    public static int checkNumber(int number) {
        if(number>0) {
            return 1; // positive
        } else if(number<0) {
            return -1; // negative
        } else {
            return 0; // zero
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int result = checkNumber(num);
        if(result==1) {
            System.out.println("The number is positive");
        } else if(result==-1) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }
    }
}