package quiz;

import javax.swing.*;

/**
 * Created by Stefano on 27/09/2016.
 */
public class RitualForm {
    private JLabel QuestionLabel;
    private JButton sonoProntoButton;
    private JPanel pagnello;

    public JLabel getQuestionLabel() {
        return QuestionLabel;
    }

    public void setQuestionLabel(JLabel questionLabel) {
        QuestionLabel = questionLabel;
    }

    public JButton getSonoProntoButton() {
        return sonoProntoButton;
    }

    public void setSonoProntoButton(JButton sonoProntoButton) {
        this.sonoProntoButton = sonoProntoButton;
    }

    public JPanel getPagnello() {
        return pagnello;
    }

    public void setPagnello(JPanel pagnello) {
        this.pagnello = pagnello;
    }
}
