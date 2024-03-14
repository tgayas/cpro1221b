module org.example.futurevaluecalculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens org.example.futurevaluecalculator to javafx.fxml;
    exports org.example.futurevaluecalculator;
}