package controlFlow;

import java.util.Scanner;
public class PositiveNumberFactors{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a positive number:");
        int number=in.nextInt();
        System.out.println("Factors of "+number+":");
        int counter=1;
        while(counter<=number){
            if(number%counter==0){
                System.out.println(counter);
            }
            counter++;
        }
    }
}

