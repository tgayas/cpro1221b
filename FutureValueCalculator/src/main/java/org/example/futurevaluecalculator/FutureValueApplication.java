package org.example.futurevaluecalculator;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FutureValueApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("futureValueCalculator.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Future Value Calculator");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
