import java.util.Scanner;

public class GradedQuiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define quiz questions and correct answers
        String[] questions = {
            "What is the capital of France?",
            "What is 2 + 2?",
            "What planet is known as the Red Planet?"
        };

        String[] answers = {"Paris", "4", "Mars"};

        int score = 0;

        // Ask each question and check answers
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(answers[i])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect!");
            }
        }

        // Display final score
        System.out.println("Your score: " + score + " out of " + questions.length);

        // Close the scanner
        scanner.close();
    }
}

