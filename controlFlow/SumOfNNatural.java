package controlFlow;

import java.util.Scanner;

public class SumOfNNatural {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
            sum+=i;
        int formulaSum=n*(n+1)/2;
        System.out.println("Sum of N natural number using loop is "+sum);
        System.out.println("Sum of N natural number using formula is "+formulaSum);
    }
}
