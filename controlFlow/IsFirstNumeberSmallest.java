package controlFlow;

import java.util.Scanner;

public class IsFirstNumeberSmallest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a1=in.nextInt(),b1=in.nextInt(),c1=in.nextInt();
        System.out.println("Is the first number the smallest? "+(a1<b1&&a1<c1));
    }
}