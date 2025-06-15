package controlFlow;

import java.util.Scanner;
public class MultiplesBelow100UsingWhile{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a positive number less than 100:");
        int number=in.nextInt();
        System.out.println("Multiples of "+number+" below 100:");
        int counter=99;
        while(counter>1){
            if(counter%number==0){
                System.out.println(counter);
            }
            counter--;
        }
    }
}

