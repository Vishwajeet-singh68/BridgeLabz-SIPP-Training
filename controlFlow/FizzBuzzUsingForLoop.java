package controlFlow;

import java.util.Scanner;
public class FizzBuzzUsingForLoop{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a positive number:");
        int number=in.nextInt();
        for(int i=1;i<=number;i++){
            if(i%15==0){
                System.out.println("FizzBuzz");
            }else if(i%3==0){
                System.out.println("Fizz");
            }else if(i%5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}

