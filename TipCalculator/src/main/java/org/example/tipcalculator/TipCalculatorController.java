package org.example.tipcalculator;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TipCalculatorController {
    // formatters for currency and percentages
    private static final NumberFormat currency =
            NumberFormat.getCurrencyInstance();
    private static final NumberFormat percent =
            NumberFormat.getPercentInstance();

    private BigDecimal tipPercentage = new BigDecimal(0.15); // 15% default

    // GUI controls defined in FXML and used by the controller's code
    @FXML
    private TextField amountTextField;

    @FXML
    private Label tipPercentageLabel;

    @FXML
    private ChoiceBox<String> myChoiceBox; // Updated to specify String type for ChoiceBox

    @FXML
    private TextField tipTextField;

    @FXML
    private TextField totalTextField;

    // calculates and displays the tip and total amounts
    @FXML
    private void calculateButtonPressed(ActionEvent event) {
        try {
            BigDecimal amount = new BigDecimal(amountTextField.getText());
            BigDecimal tip = amount.multiply(tipPercentage);
            BigDecimal total = amount.add(tip);

            tipTextField.setText(currency.format(tip));
            totalTextField.setText(currency.format(total));
        }
        catch (NumberFormatException ex) {
            amountTextField.setText("Enter amount");
            amountTextField.selectAll();
            amountTextField.requestFocus();
        }
    }

    // called by FXMLLoader to initialize the controller
    public void initialize() {
        // 0-4 rounds down, 5-9 rounds up
        currency.setRoundingMode(RoundingMode.HALF_UP);

        // Populate choice box with options
        myChoiceBox.getItems().addAll("15%", "20%", "30%");

        // Set default selection
        myChoiceBox.getSelectionModel().selectFirst();

        // listener for changes to myChoiceBox selection
        myChoiceBox.getSelectionModel().selectedItemProperty().addListener(
                new ChangeListener<String>() {
                    @Override
                    public void changed(ObservableValue<? extends String> ov,
                                        String oldValue, String newValue) {
                        if (newValue != null) {
                            tipPercentage = new BigDecimal(newValue.replace("%", ""))
                                    .divide(BigDecimal.valueOf(100));
                            tipPercentageLabel.setText(newValue);
                        }
                    }
                }
        );
    }
}