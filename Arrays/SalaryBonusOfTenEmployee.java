package Arrays;
import java.util.*;
public class SalaryBonusOfTenEmployee {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double salary[]=new double[10];
        double yearOfService[]=new double[10];
        double newSalary[]=new double[10];
        double bonusAmout[]=new double[10];
        for(int i=0;i<10;i++){
            System.out.println("Enter Salary of the Employee:");
            double sal=in.nextDouble();
            System.out.println("Enter year of Services of the employee:");
            double exp=in.nextDouble();
            if(sal<0 || exp<0){
                i--;
                continue;
            }
            salary[i]=sal;
            yearOfService[i]=exp;
        }
        for(int i=0;i<10;i++){
            double sal=salary[i];
            double exp=yearOfService[i];
            if(exp>=5){
                bonusAmout[i]=sal*5/100;
            }
            else
                bonusAmout[i]=sal*2/100;
            
            newSalary[i]=sal+bonusAmout[i];
        }
        for(int i=0;i<10;i++){
            System.out.println("Bonus amount: "+bonusAmout[i]+" old salary: "+salary[i]+" new salary: "+newSalary);
        }
    }
}
