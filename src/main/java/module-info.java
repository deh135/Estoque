module com.debora.estoque {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.ikonli.materialdesign2;

    opens com.debora.estoque to javafx.fxml;
    opens com.debora.estoque.model to javafx.base;
    opens com.debora.estoque.controller to javafx.fxml;
    opens com.debora.estoque.util to javafx.fxml;

    exports com.debora.estoque;
}