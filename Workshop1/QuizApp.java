package Workshop1;
import java.util.*;

class InvalidQuizSubmissionException extends Exception {
    public InvalidQuizSubmissionException(String message) {
        super(message);
    }
}

public class QuizApp {
    private String[] correctAnswers;
    private List<Integer> scores;

    public QuizApp(String[] correctAnswers) {
        this.correctAnswers = correctAnswers;
        this.scores = new ArrayList<>();
    }

    public int calculateScore(String[] userAnswers) throws InvalidQuizSubmissionException {
        if (userAnswers.length != correctAnswers.length) {
            throw new InvalidQuizSubmissionException("Answer length mismatch.");
        }

        int score = 0;
        for (int i = 0; i < correctAnswers.length; i++) {
            if (correctAnswers[i].equalsIgnoreCase(userAnswers[i])) {
                score++;
            }
        }
        scores.add(score);
        return score;
    }

    public String getGrade(int score) {
        double percentage = (score * 100.0) / correctAnswers.length;
        if (percentage >= 90) return "A";
        else if (percentage >= 75) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 40) return "D";
        else return "F";
    }

    public List<Integer> getAllScores() {
        return scores;
    }
}
