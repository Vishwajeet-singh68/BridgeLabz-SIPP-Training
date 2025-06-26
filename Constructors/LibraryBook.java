// Q5_LibraryBook.java
// Book class for Library Book System with borrow method
public class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;
    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }
    public boolean borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " borrowed successfully.");
            return true;
        } else {
            System.out.println(title + " is not available.");
            return false;
        }
    }
    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", Available: " + available);
    }
    public static void main(String[] args) {
        LibraryBook book = new  LibraryBook("Java Basics", "James Gosling", 299.99);
        book.display();
        book.borrowBook();
        book.borrowBook();
        book.display();
    }
}
