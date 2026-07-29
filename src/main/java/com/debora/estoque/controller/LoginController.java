package com.debora.estoque.controller;

import com.debora.estoque.util.GerenciadorTela;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.TextFlow;

import java.io.IOException;
import java.util.Locale;
import java.util.Map;

public class LoginController {
    @FXML
    private TextField usuario;

    @FXML
    private PasswordField senha;

    @FXML
    private TextFlow erroDados;

    private Map<String, String> usuarioscadastrados = Map.of(
            "admi@gmail.com", "admin",
            "debora@gmail.com", "1213",
            "funci@gamil.com", "123",
            "deh", "12345"

    );



    @FXML
    protected void aoApertarBotao(ActionEvent event) throws IOException {

        String usuarioDigitado = usuario.getText().toLowerCase();
        String senhaDigitada = senha.getText();

        if (usuarioscadastrados.containsKey(usuarioDigitado) && usuarioscadastrados.get(usuarioDigitado).equals(senhaDigitada) ) {

            GerenciadorTela.getIntancia().trocarTela(event, "menu.fxml", "Sistema Estoque - Menu");
        } else {
            erroDados.setVisible(true);
        }
    }

    @FXML
    protected void aoEsquecerSenha(){
        System.out.println("Você esqueceu! Ja não e problema meu.");
    }
}
