package Collections.ListInterface;

import java.util.*;

public class RemoveDuplicateFromLinkedList {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(4);
		Set<Integer> set=new HashSet<>();
		set.add(list.get(0));
		for(int i=1;i<list.size();i++) {
			while(set.contains(list.get(i)))
				list.remove(i);
			set.add(list.get(i));
		}
		System.out.println(list);
	}
}
