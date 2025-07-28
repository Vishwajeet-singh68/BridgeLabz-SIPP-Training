package BookShelf;

public class Main {
	public static void main(String[] args) {
		Bookshelf b=new Bookshelf();
		b.insert("horror", "Dracula");
		b.insert("horror", "Smile");
		b.insert("Drama", "Merchant of venice");
		b.insert("fantasy", "Harry Porter");
		b.display();
		System.out.println("After delete operations...");
		b.delete("fantasy","Harry Porter");
		b.display();
	}
}
