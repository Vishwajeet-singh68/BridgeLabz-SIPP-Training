package controlFlow;

import java.util.Scanner;
public class GreatestFactor{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number:");
        int number=in.nextInt();
        int greatestFactor=1;
        int counter=number-1;
        while(counter>=1){
            if(number%counter==0){
                greatestFactor=counter;
                break;
            }
            counter--;
        }
        System.out.println("Greatest factor of "+number+" (besides itself) is:"+greatestFactor);
    }
}

