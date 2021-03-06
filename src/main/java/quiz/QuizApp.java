package quiz;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Stefano on 23/09/2016.
 */
public class QuizApp extends JFrame implements ActionListener {

    public QuizApp() {
        super();
        //add(new FirstPanel("Frase di rito", this));
        add(new ProvaForm(this).getPanel1());
        //add(new quiz.QuestionPanel(3, "Quanti anni hai?", this));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
    }

    public static void main (String[] args) {
        new QuizApp();
    }

    public void actionPerformed(ActionEvent e) {
        if ("GoToQuestion".equals(e.getActionCommand())) {
            getContentPane().removeAll();
            //add(new QuestionPanel(3, "Quanti anni hai?", this));
            add(new RitualForm().getPagnello());
            pack();
        }

    }
}
