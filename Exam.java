package models;
import java.util.List;
import java.util.Scanner;

public class Exam {
    private String examName;
    private List<Question> questions;
    private int score;

    public Exam(String examName, List<Question> questions) {
        this.examName = examName;
        this.questions = questions;
        this.score = 0;
    }

    public void startExam() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Starting Exam: " + examName);
        for (Question q : questions) {
            System.out.println("\n" + q);
            System.out.print("Enter your choice (1-4): ");
            int userAnswer = scanner.nextInt();
            
            if (userAnswer == q.getCorrectOption()) {
                score++;
            }
        }
        
        System.out.println("\nExam Finished! Your Score: " + score + "/" + questions.size());
        scanner.close();
    }
}
