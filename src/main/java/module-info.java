module com.debora.estoque {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.debora.estoque to javafx.fxml;
    exports com.debora.estoque;
}