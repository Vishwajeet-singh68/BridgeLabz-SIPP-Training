package Collections.ListInterface;
import java.util.*;

public class FindFrequency {
	public static void main(String[] args) {
		String s[]= {"apple", "banana", "apple", "orange"};
		Map<String, Integer> map=new TreeMap<>();
		for(String str:s) {
			map.put(str, map.getOrDefault(str, 0)+1);
		}
		System.out.println(map);
	}
}
