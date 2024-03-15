module org.example.tipcalculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens org.example.tipcalculator to javafx.fxml;
    exports org.example.tipcalculator;
}