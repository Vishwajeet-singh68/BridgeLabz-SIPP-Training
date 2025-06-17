package Arrays;
import java.util.*;
public class MeanOfHeights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double[] heights = new double[11];
		double sum = 0;
		for(int i=0;i<11;i++) {
			heights[i] = sc.nextDouble();
			sum += heights[i];
		}
		
		System.out.print("The mean height of all the players in the football team is "+sum/11.0);
	}

}
