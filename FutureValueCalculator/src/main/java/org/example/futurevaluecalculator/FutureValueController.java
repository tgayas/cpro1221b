package org.example.futurevaluecalculator;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FutureValueController {

    @FXML
    private TextField investmentField;
    @FXML
    private TextField interestRateField;
    @FXML
    private TextField yearsField;
    @FXML
    private Button calculateButton;
    @FXML
    private TextField futureValueField;

    @FXML
    public void calculateFutureValue(ActionEvent event) {
        try {
            double investment = Double.parseDouble(investmentField.getText());
            double interestRate = Double.parseDouble(interestRateField.getText());
            int years = Integer.parseInt(yearsField.getText());

            double futureValue = investment * Math.pow(1 + interestRate / 100, years);
            futureValueField.setText(String.format("%.2f", futureValue));
        } catch (NumberFormatException e) {
            futureValueField.setText("Invalid input");
        }
    }

    @FXML
    public void exitApplication() {
        Platform.exit();
    }
}
