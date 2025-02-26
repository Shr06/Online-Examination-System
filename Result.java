package models;

public class Result {
    private String studentName;
    private String examName;
    private int score;
    private int totalQuestions;

    public Result(String studentName, String examName, int score, int totalQuestions) {
        this.studentName = studentName;
        this.examName = examName;
        this.score = score;
        this.totalQuestions = totalQuestions;
    }

    public void displayResult() {
        System.out.println("\nStudent: " + studentName);
        System.out.println("Exam: " + examName);
        System.out.println("Score: " + score + "/" + totalQuestions);
    }
}
