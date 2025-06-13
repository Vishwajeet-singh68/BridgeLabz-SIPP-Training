import java.util.Scanner;

public class BasicCalculator{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        float num1=in.nextFloat();
        float num2=in.nextFloat();
        float addition=num1+num2;
        float subtraction=num1-num2;
        float multiplication=num1*num2;
        float division=num1/num2;
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers"+num1+" and "+num2+" is "+addition +", "+subtraction+", "+multiplication+", and "+division); 
    }
}