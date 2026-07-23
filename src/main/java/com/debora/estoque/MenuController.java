package com.debora.estoque;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {
    @FXML
    protected void aoVizualisarEstoque(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("estoque.fxml"));
        Scene scene = new Scene(FXMLLoader.load());

        Stage stage = (Stage) ((Node) event.getSource().getScene().getwindow);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void aoSair(ActionEvent event) throws IOException {
        FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("login.fxml"));
        Scene scene = new Scene(fxmlloader.load());

        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

}
