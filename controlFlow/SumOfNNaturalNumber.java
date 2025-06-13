package controlFlow;

import java.util.Scanner;

public class SumOfNNaturalNumber{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sum=n*(n+1)/2;
        if(n>=0)
            System.out.println("The Sum of "+n+" natural number is "+sum);
        else    
            System.out.println("The Numeber "+n+"is not Natural Number.");
    }
}