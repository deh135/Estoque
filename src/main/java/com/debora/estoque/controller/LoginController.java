package com.debora.estoque.controller;

import com.debora.estoque.util.GerenciadorTela;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.TextFlow;

import java.io.IOException;

public class LoginController {
    @FXML
    private TextField usuario;

    @FXML
    private PasswordField senha;

    @FXML
    private TextFlow erroDados;

    private final String usuarioCadastrado = "deh";
    private final String senhaCadastrada = "12345";




    @FXML
    protected void aoApertarBotao(ActionEvent event) throws IOException {

        if (usuarioCadastrado.equalsIgnoreCase(usuario.getText()) && senhaCadastrada.equals(senha.getText())){
            GerenciadorTela.getIntancia().trocarTela(event, "menu.fxml", "Sistema de Estoque - Menu");

        }else {
            erroDados.setVisible(true);
        }
    }
    @FXML
    protected void aoEsquecerSenha(){
        System.out.println("Você esqueceu! Ja não e problema meu.");
    }
}
