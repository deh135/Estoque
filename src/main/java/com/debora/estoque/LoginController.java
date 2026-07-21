package com.debora.estoque;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Main {
    @FXML
    private Label textoNaTela;

    @FXML
    protected void aoApertarBotao() {
        textoNaTela.setText("seja bem vindo a primeira tela da Debora");
    }
}
