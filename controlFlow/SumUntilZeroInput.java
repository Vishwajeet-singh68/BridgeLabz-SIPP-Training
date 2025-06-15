package controlFlow;

import java.util.Scanner;
public class SumUntilZeroInput{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        double total=0.0;
        System.out.print("Enter a number:");
        double number=in.nextDouble();
        while(number!=0){
            total+=number;
            System.out.print("Enter a number:");
            number=in.nextDouble();
        }
        System.out.println("Total sum:"+total);
    }
}

