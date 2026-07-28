package com.debora.estoque.controller;

import com.debora.estoque.util.GerenciadorTela;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class MenuController {


    @FXML
    protected void  aoVisualizarEstoque(ActionEvent event) throws IOException{
        GerenciadorTela.getIntancia().trocarTela(event, "estoque.fxml", "Sistema de Estoque - Estoque");
    }

    @FXML
    protected void  aoCadastrarProdutos(ActionEvent event) throws IOException {
        GerenciadorTela.getIntancia().trocarTela(event, "produto.fxml", "Sistema de Estoque - Produto");
    }

    @FXML
    protected  void aoGerarRelatorio(ActionEvent event) throws IOException{
        GerenciadorTela.getIntancia().trocarTela(event, "relatorio.fxml", "Sistema de Estoque - Relatorio");
    }

    @FXML
    protected void aoSair(ActionEvent event) throws IOException {
        GerenciadorTela.getIntancia().trocarTela(event, "login.fxml", "Sistema de Estoque - Login");
    }

}