package controlFlow;

import java.util.Scanner;
public class GreatestFactorUsingForLoop{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number:");
        int number=in.nextInt();
        int greatestFactor=1;
        for(int i=number-1;i>=1;i--){
            if(number%i==0){
                greatestFactor=i;
                break;
            }
        }
        System.out.println("Greatest factor of "+number+" is:"+greatestFactor);
    }
}
