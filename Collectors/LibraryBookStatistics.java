
import java.util.*;
import java.util.stream.*;

class Book {
    String genre;
    int pages;
    Book(String genre, int pages) { this.genre = genre; this.pages = pages; }
}

public class LibraryBookStatistics {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
            new Book("Fiction", 300),
            new Book("Fiction", 450),
            new Book("Science", 200),
            new Book("Science", 500),
            new Book("History", 350)
        );

        Map<String, IntSummaryStatistics> statsByGenre = books.stream()
            .collect(Collectors.groupingBy(b -> b.genre, Collectors.summarizingInt(b -> b.pages)));

        statsByGenre.forEach((genre, stats) -> {
            System.out.println(genre + " -> Total Pages: " + stats.getSum() +
                               ", Avg Pages: " + stats.getAverage() +
                               ", Max Pages: " + stats.getMax());
        });
    }
}
