package quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by Stefano on 23/09/2016.
 */
public class QuestionPanel extends JPanel {

    JButton continueButton;

    public QuestionPanel (int n, String question, ActionListener actionListener) {
        super(new BorderLayout());

        add(new JLabel("Domanda n. " + n + ":"), BorderLayout.NORTH);

        add(new JLabel(question), BorderLayout.CENTER);

        continueButton = new JButton("Prosegui");
        continueButton.setActionCommand("GoToAnswers");
        continueButton.setName("QuestionPanelButton");
        continueButton.addActionListener(actionListener);
        add(continueButton, BorderLayout.SOUTH);
    }
}
