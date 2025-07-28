package BookShelf;
import java.util.*;
public class Bookshelf {
	HashMap<String, Set<String>> map;
	Bookshelf(){
		map=new HashMap<>();
	}
	
	public void insert(String genre, String bookName) {
		if(!map.containsKey(genre)) {
			map.put(genre, new HashSet<>());
		}
		map.get(genre).add(bookName);
	}
	
	public void delete(String genre, String bookName) {
		if(!map.containsKey(genre)) {
			System.out.println("Genre not available.");
			return;
		}
		map.get(genre).remove(bookName);
		if(map.get(genre).size()==0)
			map.remove(genre);
	}
	
	public void display() {
		if(map.size()==0) {
			System.out.println("Library is Empty.");
			return;
		}
		for(String i:map.keySet()) {
			System.out.println(i+" "+map.get(i));
		}
	}
	
}
