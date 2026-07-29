package com.debora.estoque.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class EstoqueDAO {
    private static EstoqueDAO instancia;
    private final ObservableList<Produto> listaProdutos;
    private int idProduto;

    private EstoqueDAO(){
        this.listaProdutos = FXCollections.observableArrayList();
    }

    public static EstoqueDAO getInstance(){
        if ( instancia == null){
            instancia = new EstoqueDAO();
        }
        return instancia;
    }
    public void adicionar(Produto produto){
        produto.setId(idProduto++);
        listaProdutos.add(produto);
    }
    public ObservableList<Produto> ListaProdutos(){
        return ListaProdutos();
    }
    public void remover(Produto produto){
        ListaProdutos().remove(produto);
    }
}
