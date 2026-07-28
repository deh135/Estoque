package com.debora.estoque.controller;

import com.debora.estoque.util.GerenciadorTela;
import javafx.fxml.FXML;

import java.io.IOException;

import javafx.event.ActionEvent;

public class EstoqueController {
    @FXML
    protected void  aoVoltarMenu(ActionEvent event) throws IOException {
        GerenciadorTela.getIntancia().trocarTela(event, "menu.fxml", "Sistema de Estoque - Menu");

    }
}
