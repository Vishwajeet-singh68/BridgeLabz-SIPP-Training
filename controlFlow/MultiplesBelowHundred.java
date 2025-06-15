package controlFlow;

import java.util.Scanner;
public class MultiplesBelowHundred{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a positive number less than 100:");
        int number=in.nextInt();
        System.out.println("Multiples of "+number+" below 100:");
        for(int i=100;i>=1;i--){
            if(i%number==0){
                System.out.println(i);
            }
        }
    }
}

