package Arrays;
import java.util.*;
public class NumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i=0;i<5;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<5;i++) {
			if(arr[i]>0) {
				if(arr[i]%2==0) {
					System.out.println(arr[i]+" is positive and even.");
				}
				else {
					System.out.println(arr[i]+" is positive and odd.");
				}
			}
			else if(arr[i]<0) {
				System.out.println(arr[i]+" is negative.");
			}
			else {
				System.out.println(arr[i]+" is Zero.");
			}
		}
		
		if(arr[0]>arr[4]) System.out.print("First is greater then last.");
		else if(arr[0]<arr[4]) System.out.print("First is less then last.");
		else System.out.print("First is equal to last");
	}

}
