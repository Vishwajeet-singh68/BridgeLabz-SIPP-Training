package Workshop1;
import java.util.*;

// Custom exception for invalid time format
class InvalidTimeFormatException extends Exception {
    public InvalidTimeFormatException(String message) {
        super(message);
    }
}

public class MovieBooking {
    private List<String> movieTitles = new ArrayList<>();
    private List<String> showTimes = new ArrayList<>();

    // Method to validate and add a movie
    public void addMovie(String title, String time) throws InvalidTimeFormatException {
        if (!isValidTimeFormat(time)) {
            throw new InvalidTimeFormatException("Invalid time format: " + time);
        }
        movieTitles.add(title);
        showTimes.add(time);
        System.out.println("Movie added successfully!\n");
    }

    // Method to search movies by keyword
    public void searchMovie(String keyword) {
        boolean found = false;
        System.out.println("Search Results:");
        for (int i = 0; i < movieTitles.size(); i++) {
            if (movieTitles.get(i).toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(String.format("%d. %s at %s", i + 1, movieTitles.get(i), showTimes.get(i)));
                found = true;
            }
        }
        if (!found) {
            System.out.println("No movie found with keyword: " + keyword);
        }
        System.out.println();
    }

    // Method to display all movies
    public void displayAllMovies() {
        System.out.println("All Scheduled Movies:");
        if (movieTitles.isEmpty()) {
            System.out.println("No movies scheduled.\n");
            return;
        }

        for (int i = 0; i < movieTitles.size(); i++) {
            System.out.println(String.format("%d. %s at %s", i + 1, movieTitles.get(i), showTimes.get(i)));
        }

        System.out.println();
    }

    // Helper: validate HH:mm time format
    private boolean isValidTimeFormat(String time) {
        try {
            String[] parts = time.split(":");
            if (parts.length != 2) return false;
            int hour = Integer.parseInt(parts[0]);
            int minute = Integer.parseInt(parts[1]);
            return hour >= 0 && hour < 24 && minute >= 0 && minute < 60;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Generate printable report
    public void generateReport() {
        System.out.println("=== Printable Movie Report ===");
        String[] titles = movieTitles.toArray(new String[0]);
        String[] times = showTimes.toArray(new String[0]);

        for (int i = 0; i < titles.length; i++) {
            System.out.println(String.format("%d. %s - %s", i + 1, titles[i], times[i]));
        }

        System.out.println("==============================\n");
    }
}
