import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int low = 1, high = 100;
        int attempts = 0;

        System.out.println("Think of a number between 1 and 100. I'll try to guess it!");
        System.out.println("After each guess, respond with 'high', 'low', or 'correct'.");

        while (true) {
            int guess = generateGuess(rand, low, high);
            attempts++;
            System.out.println("Is your number " + guess + "? (high/low/correct)");
            String feedback = getFeedback(sc);
            
            if (feedback.equals("correct")) {
                System.out.println("I guessed your number (" + guess + ") in " + attempts + " attempts!");
                break;
            } else if (feedback.equals("high")) {
                high = updateHighBound(guess);
            } else if (feedback.equals("low")) {
                low = updateLowBound(guess);
            }

            if (low > high) {
                System.out.println("Invalid feedback! The number cannot exist in the current range.");
                break;
            }
        }
        sc.close();
    }

    private static int generateGuess(Random rand, int low, int high) {
        return rand.nextInt(high - low + 1) + low;
    }

    private static String getFeedback(Scanner sc) {
        String feedback;
        while (true) {
            feedback = sc.next().trim().toLowerCase();
            if (feedback.equals("high") || feedback.equals("low") || feedback.equals("correct")) {
                return feedback;
            }
            System.out.println("Invalid input! Please enter 'high', 'low', or 'correct'.");
        }
    }

    private static int updateHighBound(int guess) {
        return guess - 1;
    }

    private static int updateLowBound(int guess) {
        return guess + 1;
    }
}
