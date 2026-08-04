package com.debora.estoque.controller;

import com.debora.estoque.model.EstoqueDAO;
import com.debora.estoque.model.Produto;
import com.debora.estoque.util.GerenciadorTela;
import javafx.beans.InvalidationListener;
import javafx.collections.transformation.FilteredList;
import javafx.fxml.FXML;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;


public class EstoqueController{
    @FXML
    private TextField campoBusca;

    @FXML
    private TableView tabelaProdutos;

    @FXML
    private TableColumn colunaID;

    @FXML
    private TableColumn colunaNome;

    @FXML
    private TableColumn colunaCategoria;

    @FXML
    private TableColumn colunaQuantidade;

    @FXML
    private TableColumn colunaPreco;

    private final EstoqueDAO dadosEstoque = EstoqueDAO.getInstance();
    private FilteredList<Produto> ListaFiltrada;

    @FXML
    public void initialize(){
        colunaID.setCellValueFactory( new PropertyValueFactory<>("id"));
        colunaNome.setCellValueFactory( new PropertyValueFactory<>("nome"));
        colunaCategoria.setCellValueFactory( new PropertyValueFactory<>("categoria"));
        colunaQuantidade.setCellValueFactory( new PropertyValueFactory<>("quantidade"));
        colunaPreco.setCellValueFactory( new PropertyValueFactory<>("preco"));

        ListaFiltrada = new FilteredList<>( dadosEstoque.ListaProdutos(), p -> true);
        tabelaProdutos.setItems(ListaFiltrada);

        campoBusca.textProperty().addListener((obs, textoAntigo, textoNovo) ->{
            String filtro = textoNovo == null ? "" : textoNovo.toLowerCase();
            ListaFiltrada.setPredicate(produto -> filtro.isEmpty() || produto.getNome().contains
                    (filtro) || produto.getCategoria().toLowerCase().contains(filtro) || String.valueOf(produto.getPreco()).contains(filtro));
        });
    }

    @FXML
    protected  void adicionarProduto(){

    }

    @FXML
    protected  void editarProduto(){

    }

    @FXML
    protected void removerProduto(){
    }


    @FXML
    protected void  aoVoltarMenu(ActionEvent event) throws IOException {
        GerenciadorTela.getIntancia().trocarTela(event, "menu.fxml", "Sistema de Estoque - Menu");

    }
}
