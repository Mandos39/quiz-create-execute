import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by Stefano on 22/09/2016.
 */
public class FirstPanel extends JPanel {

   JButton continueButton;

    public FirstPanel (String sentence, ActionListener actionListener) {
        super(new BorderLayout());

        add(new JLabel(sentence), BorderLayout.NORTH);

        continueButton = new JButton("Prosegui");
        continueButton.setActionCommand("GoToQuestion");
        continueButton.setName("FirstPanelButton");
        continueButton.addActionListener(actionListener);
        add(continueButton, BorderLayout.CENTER);
    }

}
