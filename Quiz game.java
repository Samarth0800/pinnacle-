import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array of questions
        String[] questions = {
                "1. What is the size of int in Java?",
                "2. Which keyword is used to create a subclass?",
                "3. Who developed Java?",
                "4. What is the default value of a boolean in Java?",
                "5. Which method is the entry point for any Java program?"
        };

        // Array of options for each question
        String[][] options = {
                { "1) 8 bytes", "2) 2 bytes", "3) 4 bytes", "4) 1 byte" },
                { "1) implements", "2) inherits", "3) extends", "4) super" },
                { "1) Microsoft", "2) Sun Microsystems", "3) Oracle", "4) Google" },
                { "1) false", "2) true", "3) null", "4) undefined" },
                { "1) start()", "2) execute()", "3) main()", "4) run()" }
        };

        // Index of correct answers (0-based)
        int[] answers = { 2, 2, 1, 0, 2 };

        int score = 0;

        System.out.println("🎮 Welcome to the Java Quiz Game!\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (int j = 0; j < 4; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Your answer (1-4): ");
            int userAnswer = scanner.nextInt();

            if (userAnswer - 1 == answers[i]) {
                System.out.println("✅ Correct!\n");
                score++;
            } else {
                System.out.println("❌ Wrong! Correct answer: " + (answers[i] + 1) + "\n");
            }
        }

        System.out.println("🎉 Quiz Finished!");
        System.out.println("✅ Your Score: " + score + " out of " + questions.length);

        // Performance feedback
        if (score == questions.length) {
            System.out.println("🏆 Perfect! You're a Java Master!");
        } else if (score >= 3) {
            System.out.println("👍 Good effort! Keep improving.");
        } else {
            System.out.println("📚 Keep practicing. You'll get better!");
        }

        scanner.close();
    }
}
