package Arrays;
import java.util.*;
public class EvenOddArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number<=0) {
			System.out.print("Error : Not a natural number.");
			return;
		}
		
		int s = number/2+1;
		int[] even = new int[s];
		int[] odd = new int[s];
		
		int e = 0;
		int o = 0;
		
		for(int i=1;i<=number;i++) {
			if(i%2==0) {
				even[e] = i;
				e++;
			}
			else {
				odd[o] = i;
				o++;
			}
		}
		
		System.out.println("Even numbers are - ");
		for(int i=0;i<e;i++) {
			System.out.print(even[i]+" ");
		}
		System.out.println();
		System.out.println("Odd numbers are - ");
		for(int i=0;i<o;i++) {
			System.out.print(odd[i]+" ");
		}
		
	}

}
