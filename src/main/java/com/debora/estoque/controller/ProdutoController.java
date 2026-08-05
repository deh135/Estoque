package com.debora.estoque.controller;

import com.debora.estoque.model.EstoqueDAO;
import com.debora.estoque.model.Produto;
import com.debora.estoque.util.GerenciadorTela;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ProdutoController {

    @FXML
    private TextField campoNome;

    @FXML
    private TextField campoCategoria;

    @FXML
    private TextField campoQuantidade;

    @FXML
    private TextField campoPreco;

    @FXML
    private Button botaoSalvar;


    private final EstoqueDAO dadosEstoque = EstoqueDAO.getInstancia();

    private Produto produtoEmEdicao;

    public void preencherParaEdicao( Produto produto ){
        this.produtoEmEdicao = produto;
        campoNome.setText(produto.getNome());
        campoCategoria.setText(produto.getCategoria());
        campoQuantidade.setText(String.valueOf(produto.getQuantidade()));
        campoPreco.setText(String.valueOf(produto.getPreco()));
        botaoSalvar.setText("Salvar Alteracoes");
    }

    @FXML
    protected void salvar(ActionEvent event) throws IOException {
        String nome = campoNome.getText();
        String categoria = campoCategoria.getText();
        if (nome == null || nome.isBlank() || categoria == null || categoria.isBlank()) {
            mostrarErro("informe um nome ou uma categoria valida!");
            return;
        }
        int quantidade;
        double preco;
        try {
            quantidade = Integer.parseInt(campoQuantidade.getText().trim());
            preco = Double.parseDouble(campoPreco.getText().trim().replace(",", "."));
        } catch (NumberFormatException ex) {
            mostrarErro("Quantidade e preco precisam ser numeros validos.");
            return;
        }

        if (produtoEmEdicao == null) {
            Produto produto = new Produto(0, nome, categoria, quantidade, preco);
            dadosEstoque.adicionar(produto);
            mostrarSucesso(event, "produto inserido com sucesso!");
        } else {
            produtoEmEdicao.setNome(nome);
            produtoEmEdicao.setCategoria(categoria);
            produtoEmEdicao.setQuantidade(quantidade);
            produtoEmEdicao.setPreco(preco);
            mostrarSucesso(event, "Produto editado com sucesso!");
        }
        dadosEstoque.listarProdutos().forEach(System.out::println);
    }

    private void mostrarErro(String mensagem){
        Alert alerta = new Alert (Alert.AlertType.ERROR, mensagem);
        alerta.setHeaderText(null);
        alerta.showAndWait();
    }

    private void mostrarSucesso(ActionEvent event, String mensagem) throws IOException{
        Alert confirmacao = new Alert(Alert.AlertType.INFORMATION, mensagem);
        confirmacao.setHeaderText(null);
        confirmacao.showAndWait();
        GerenciadorTela.getIntancia().trocarTela(event, "estoque.fxml", "Sistema de estoque - Estoque" );
    }

    @FXML
    protected  void cancelar(ActionEvent event) throws IOException {
        GerenciadorTela.getIntancia().trocarTela(event, "menu.fxml", "Sistema de Estoque - Menu");
    }

}
