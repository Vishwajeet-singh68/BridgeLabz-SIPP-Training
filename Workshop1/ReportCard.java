package Workshop1;
import java.util.*;

// Custom Exception for Invalid Marks
class InvalidMarkException extends Exception {
    public InvalidMarkException(String message) {
        super(message);
    }
}

// Student class to store subject-wise marks and calculate results
public class ReportCard {
    private String name;
    private String[] subjects;
    private int[] marks;

    public ReportCard(String name, String[] subjects, int[] marks) throws InvalidMarkException {
        if (subjects.length != marks.length)
            throw new IllegalArgumentException("Subjects and marks count must match.");
        this.name = name;
        this.subjects = subjects;
        this.marks = new int[marks.length];
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 0 || marks[i] > 100) {
                throw new InvalidMarkException("Mark for subject '" + subjects[i] + "' is invalid: " + marks[i]);
            }
            this.marks[i] = marks[i];
        }
    }

    // Calculate average marks
    public double calculateAverage() {
        int total = 0;
        for (int mark : marks) total += mark;
        return (double) total / marks.length;
    }

    // Assign grade based on average
    public String assignGrade() {
        double avg = calculateAverage();
        if (avg >= 90) return "A+";
        if (avg >= 80) return "A";
        if (avg >= 70) return "B";
        if (avg >= 60) return "C";
        if (avg >= 50) return "D";
        return "F";
    }

    // Display formatted report card
    public void displayReportCard() {
        System.out.println("\n========== Report Card ==========");
        System.out.println("Name: " + name);
        System.out.println("---------------------------------");
        for (int i = 0; i < subjects.length; i++) {
            System.out.printf("%-15s : %3d\n", subjects[i], marks[i]);
        }
        System.out.println("---------------------------------");
        System.out.printf("Average        : %.2f\n", calculateAverage());
        System.out.println("Grade          : " + assignGrade());
        System.out.println("=================================\n");
    }
}
