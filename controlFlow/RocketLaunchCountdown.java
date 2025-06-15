package controlFlow;

import java.util.Scanner;
public class RocketLaunchCountdown{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter countdown value:");
        int counter=in.nextInt();
        System.out.println("Rocket Launch Countdown:");
        for(int i=counter;i>=1;i--){
            System.out.println(i);
        }
        System.out.println("Blast Off!");
    }
}

