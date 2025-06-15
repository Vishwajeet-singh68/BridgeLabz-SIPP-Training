package controlFlow;

import java.util.Scanner;
public class PowerCalculatorUsingWhile{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter base number:");
        int number=in.nextInt();
        System.out.print("Enter power:");
        int power=in.nextInt();
        long result=1;
        int counter=0;
        while(counter<power){
            result*=number;
            counter++;
        }
        System.out.println(number+" raised to power "+power+" is "+result);
    }
}

