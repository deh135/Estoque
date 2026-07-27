module com.debora.estoque {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens com.debora.estoque to javafx.fxml;
    exports com.debora.estoque;
}