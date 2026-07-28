module com.debora.estoque {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens com.debora.estoque to javafx.fxml;
    exports com.debora.estoque.model;
    opens com.debora.estoque.model to javafx.fxml;
    exports com.debora.estoque.controller;
    opens com.debora.estoque.controller to javafx.fxml;
    exports com.debora.estoque.util;
    opens com.debora.estoque.util to javafx.fxml;
    exports com.debora.estoque;
}