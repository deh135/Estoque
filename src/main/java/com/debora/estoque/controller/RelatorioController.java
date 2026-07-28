package com.debora.estoque.controller;

import com.debora.estoque.util.GerenciadorTela;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class RelatorioController {

    @FXML
    protected void aoVoltarMenu(ActionEvent event) throws IOException{
        GerenciadorTela.getIntancia().trocarTela(event, "menu.fxml", "Sistema do Estoque - Menu");
    }
}
