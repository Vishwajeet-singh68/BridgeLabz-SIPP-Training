package controlFlow;

import java.util.Scanner;
public class MultiplicationTable6to9{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number:");
        int number=in.nextInt();
        System.out.println("Multiplication table of "+number+" from 6 to 9:");
        for(int i=6;i<=9;i++){
            System.out.println(number+" * "+i+" = "+(number*i));
        }
    }
}

