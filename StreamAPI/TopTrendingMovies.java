
import java.util.*;
import java.util.stream.*;

class Movie {
    String title;
    double rating;
    int year;
    Movie(String title, double rating, int year) {
        this.title = title; this.rating = rating; this.year = year;
    }
    public String toString() { return title + " (" + year + ") - " + rating; }
}

public class TopTrendingMovies {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
            new Movie("Movie A", 8.5, 2024),
            new Movie("Movie B", 9.0, 2025),
            new Movie("Movie C", 7.5, 2023),
            new Movie("Movie D", 8.9, 2025),
            new Movie("Movie E", 9.5, 2025),
            new Movie("Movie F", 8.7, 2024)
        );

        movies.stream()
              .sorted(Comparator.comparingDouble((Movie m) -> m.rating).reversed()
              .thenComparingInt(m -> m.year))
              .limit(5)
              .forEach(System.out::println);
    }
}
