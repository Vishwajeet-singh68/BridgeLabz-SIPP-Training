package Arrays;
import java.util.*;
public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double[] arr = new double[10];
		int ind = 0;
	
		while(true) {
			if(ind==10) break;
			int n = sc.nextInt();
			if(n>0) {
				arr[ind] = n;
				ind++;
			}
			else break;
		}
		
		double sum = 0;
		ind = 0;
		System.out.println("The numbers are -");
		while(ind<10 && arr[ind]!=0) {
			sum += arr[ind];
			System.out.print(arr[ind]+" ");
			ind++;
		}
		
		System.out.println();
		System.out.print("The sum of all the numbers is = "+sum);
	}

}
