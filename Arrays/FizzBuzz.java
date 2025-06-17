package Arrays;
import java.util.*;
public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>0) {
			String[] arr = new String[n];
			
			for(int i=1;i<=n;i++) {
				if(i%3==0 && i%5==0) {
					arr[i-1] = "FizzBuzz";
				}
				else if(i%5==0) {
					arr[i-1] = "Buzz";
				}
				else if(i%3==0) {
					arr[i-1] = "Fizz";
				}
				else {
					arr[i-1] = i+"";
				}
			}
			
			System.out.print(Arrays.toString(arr));
		}
	}

}
