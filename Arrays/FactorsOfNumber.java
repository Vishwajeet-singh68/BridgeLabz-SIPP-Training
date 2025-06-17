package Arrays;
import java.util.*;
public class FactorsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int maxDigit = 10;
		int[] arr = new int[maxDigit];
		int ind = 0;
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				if(ind<maxDigit) {
					arr[ind] = i;
					ind++;
				}
				else {
					maxDigit *= 2;
					int[] temp = new int[maxDigit];
					for(int j=0;j<arr.length;j++) {
						temp[j] = arr[j];
					}
					arr = temp;
					arr[ind] = i;
					ind++;
				}
			}
		}
		
		System.out.print(Arrays.toString(arr));
	}

}
