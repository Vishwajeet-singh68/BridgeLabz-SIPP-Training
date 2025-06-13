package controlFlow;

import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int number=in.nextInt();
        System.out.print("Is the number "+number+" divisible by 5? ");
        if(number%5==0)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}
