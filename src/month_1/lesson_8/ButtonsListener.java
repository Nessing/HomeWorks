package month_1.lesson_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonsListener implements ActionListener {
    private TextField textField;

    public ButtonsListener(TextField textField) {
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        JButton button = (JButton) a.getSource();

        StringBuilder stringBuilder = new StringBuilder(textField.getText());
        stringBuilder.append(button.getText());
        textField.setText(stringBuilder.toString());
    }
}
