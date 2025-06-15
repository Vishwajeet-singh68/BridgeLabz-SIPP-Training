package controlFlow;

import java.util.Scanner;
public class EmployeeBonusCalculator{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter salary:");
        double salary=in.nextDouble();
        System.out.print("Enter years of service:");
        int years=in.nextInt();
        if(years>5){
            double bonus=salary*0.05;
            System.out.println("Bonus amount:"+bonus);
        }else{
            System.out.println("Bonus amount:0.0");
        }
    }
}
