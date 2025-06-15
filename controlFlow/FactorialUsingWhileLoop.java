package controlFlow;

import java.util.Scanner;
public class FactorialUsingWhileLoop{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a positive integer:");
        int number=in.nextInt();
        long factorial=1;
        int i=1;
        while(number-->1){
            factorial*=number;
            i++;
        }
        System.out.println("Factorial of "+number+" is "+factorial);
    }
}
