package month_1.lesson_8;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculationListener implements ActionListener {
    private TextField textField;

    public CalculationListener(TextField textField) {
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String value = textField.getText();
        String[] numbers;
        // вычисление с плавающей запятой
        if (value.contains(".")) {
            if (value.contains("+")) {
                numbers = value.split("\\+");
                textField.setText(
                        String.valueOf(
                                Double.parseDouble(numbers[0]) + Double.parseDouble(numbers[1])
                        )
                );
            } else if (value.contains("-")) {
                numbers = value.split("-");
                textField.setText(
                        String.valueOf(
                                Double.parseDouble(numbers[0]) - Double.parseDouble(numbers[1])
                        )
                );
            } else if (value.contains("*")) {
                numbers = value.split("\\*");
                textField.setText(
                        String.valueOf(
                                Double.parseDouble(numbers[0]) * Double.parseDouble(numbers[1])
                        )
                );
            } else if (value.contains("\u00f7")) {
                numbers = value.split("\u00f7");
                textField.setText(
                        String.valueOf(
                                Double.parseDouble(numbers[0]) / Double.parseDouble(numbers[1])
                        )
                );
            }
            // вычисление с целочисленными числами
        } else {
            if (value.contains("+")) {
                numbers = value.split("\\+");
                textField.setText(
                        String.valueOf(
                                Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1])
                        )
                );
            } else if (value.contains("-")) {
                numbers = value.split("-");
                textField.setText(
                        String.valueOf(
                                Integer.parseInt(numbers[0]) - Integer.parseInt(numbers[1])
                        )
                );
            } else if (value.contains("*")) {
                numbers = value.split("\\*");
                textField.setText(
                        String.valueOf(
                                Integer.parseInt(numbers[0]) * Integer.parseInt(numbers[1])
                        )
                );
            } else if (value.contains("\u00f7")) {
                numbers = value.split("\u00f7");
                textField.setText(
                        String.valueOf(
                                Integer.parseInt(numbers[0]) / Integer.parseInt(numbers[1])
                        )
                );
            }
        }
    }
}
