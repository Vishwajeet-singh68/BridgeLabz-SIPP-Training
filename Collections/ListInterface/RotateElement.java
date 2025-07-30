package Collections.ListInterface;
import java.util.*;

public class RotateElement {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		List<Integer> list=new ArrayList<>();
		int n=in.nextInt();
		for(int i=0;i<n;i++) {
			list.add(in.nextInt());
		}
		int k=in.nextInt()%n;
		reverseArrayList(list,0,k-1);
		reverseArrayList(list,k,n-1);
		reverseArrayList(list,0,n-1);
		System.out.println(list);
	}
	public static void reverseArrayList(List<Integer> list,int start,int end) {
		while(start<end) {
			swap(list,start,end);
			start++;end--;
		}
	}
	public static void swap(List<Integer> list,int i, int j) {
		int a=list.get(i);
		list.set(i,list.get(j));
		list.set(j, a);
	}
}
