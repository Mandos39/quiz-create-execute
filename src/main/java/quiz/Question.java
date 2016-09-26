package quiz;

import java.util.ArrayList;

/**
 * Created by Stefano on 23/09/2016.
 */
public class Question {

    String question;
    ArrayList<String> answers;

    public Question(String question, ArrayList<String> answers) {
        this.question = question;
        this.answers = answers;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
