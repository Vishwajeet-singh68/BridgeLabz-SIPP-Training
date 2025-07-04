public class MovieManagementSystem {
    class Node {
        String title;
        String director;
        int year;
        double rating;
        Node next;
        Node prev;

        Node(String title, String director, int year, double rating) {
            this.title = title;
            this.director = director;
            this.year = year;
            this.rating = rating;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private Node tail;

    public MovieManagementSystem() {
        head = null;
        tail = null;
    }

    // Add at beginning
    public void addAtBeginning(String title, String director, int year, double rating) {
        Node newNode = new Node(title, director, year, rating);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Add at end
    public void addAtEnd(String title, String director, int year, double rating) {
        Node newNode = new Node(title, director, year, rating);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Add at position
    public void addAtPosition(int position, String title, String director, int year, double rating) {
        if (position < 1) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 1) {
            addAtBeginning(title, director, year, rating);
            return;
        }
        Node newNode = new Node(title, director, year, rating);
        Node current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Position out of range");
            return;
        }
        newNode.next = current.next;
        newNode.prev = current;
        if (current.next != null) {
            current.next.prev = newNode;
        } else {
            tail = newNode;
        }
        current.next = newNode;
    }

    // Remove by title
    public void removeByTitle(String title) {
        Node current = head;
        while (current != null && !current.title.equals(title)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Movie not found");
            return;
        }
        if (current == head) {
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
        } else if (current == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    // Search by director
    public void searchByDirector(String director) {
        Node current = head;
        while (current != null) {
            if (current.director.equals(director)) {
                System.out.println(current.title + ", " + current.director + ", " + current.year + ", " + current.rating);
            }
            current = current.next;
        }
    }

    // Search by rating
    public void searchByRating(double rating) {
        Node current = head;
        while (current != null) {
            if (current.rating == rating) {
                System.out.println(current.title + ", " + current.director + ", " + current.year + ", " + current.rating);
            }
            current = current.next;
        }
    }

    // Display forward
    public void displayForward() {
        Node current = head;
        while (current != null) {
            System.out.println(current.title + ", " + current.director + ", " + current.year + ", " + current.rating);
            current = current.next;
        }
    }

    // Display reverse
    public void displayReverse() {
        Node current = tail;
        while (current != null) {
            System.out.println(current.title + ", " + current.director + ", " + current.year + ", " + current.rating);
            current = current.prev;
        }
    }

    // Update rating
    public void updateRating(String title, double newRating) {
        Node current = head;
        while (current != null) {
            if (current.title.equals(title)) {
                current.rating = newRating;
                System.out.println("Rating updated for " + title);
                return;
            }
            current = current.next;
        }
        System.out.println("Movie not found");
    }

    public static void main(String[] args) {
        MovieManagementSystem list = new MovieManagementSystem();
        list.addAtBeginning("Inception", "Nolan", 2010, 8.8);
        list.addAtEnd("Titanic", "Cameron", 1997, 7.8);
        list.addAtPosition(2, "Avatar", "Cameron", 2009, 7.8);
        System.out.println("Forward display:");
        list.displayForward();
        System.out.println("Reverse display:");
        list.displayReverse();
        list.searchByDirector("Cameron");
        list.updateRating("Inception", 9.0);
        list.removeByTitle("Titanic");
        System.out.println("After deletion:");
        list.displayForward();
    }
}