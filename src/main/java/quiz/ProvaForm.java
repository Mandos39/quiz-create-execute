package quiz;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by Stefano on 26/09/2016.
 */
public class ProvaForm {
    private JButton GoToQuestion;
    private JPanel panel1;
    private ActionListener listener;

    public JButton getGoToQuestion() {
        return GoToQuestion;
    }

    public void setGoToQuestion(JButton goToQuestion) {
        this.GoToQuestion = goToQuestion;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }


    public ProvaForm(ActionListener listener) {
        this.listener = listener;
        GoToQuestion.addActionListener(listener);
        GoToQuestion.setActionCommand("GoToQuestion");
    }


}
