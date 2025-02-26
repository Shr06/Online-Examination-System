package models;

public class Question {
    private String questionText;
    private String[] options;
    private int correctOption;

    public Question(String questionText, String[] options, int correctOption) {
        this.questionText = questionText;
        this.options = options;
        this.correctOption = correctOption;
    }

    public String getQuestionText() { return questionText; }
    public String[] getOptions() { return options; }
    public int getCorrectOption() { return correctOption; }

    @Override
    public String toString() {
        return questionText + "\n1. " + options[0] + "\n2. " + options[1] +
                "\n3. " + options[2] + "\n4. " + options[3];
    }
}
