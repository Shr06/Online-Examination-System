package main;
import models.*;
import java.util.*;

public class ExamApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Question> questionBank = new ArrayList<>();
        questionBank.add(new Question("What is Java?", new String[]{"Language", "Food", "City", "Car"}, 1));
        questionBank.add(new Question("What is OOP?", new String[]{"Function", "Loop", "Object", "Class"}, 3));
        questionBank.add(new Question("Java uses?", new String[]{"Compiler", "Interpreter", "Both", "None"}, 3));

        System.out.print("Enter your name: ");
        String studentName = scanner.nextLine();

        Exam exam = new Exam("Java Basics", questionBank);
        exam.startExam();

        Result result = new Result(studentName, "Java Basics", exam.getScore(), questionBank.size());
        result.displayResult();

        scanner.close();
    }
}
