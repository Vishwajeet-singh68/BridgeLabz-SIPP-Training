package Arrays;
import java.util.*;
public class EligibilityCheckForVoting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] ages = new int[10];
		
		for(int i=0;i<10;i++) {
			ages[i] = sc.nextInt();
		}
		
		for(int i=0;i<10;i++) {
			if(ages[i]<=0) {
				System.out.println(ages[i]+" not a valid age.");
			}
			else if(ages[i]<18) {
				System.out.println("The person with age "+ages[i]+" is not eligible to vote.");
			}
			else {
				System.out.println("The person with age "+ages[i]+" is eligible to vote.");
			}
		}
	}

}
