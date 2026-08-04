package com.debora.estoque.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class EstoqueDAO {
    private static EstoqueDAO instancia;
    private final ObservableList<Produto> ProdutosList;
    private int idProduto = 1;


    public static EstoqueDAO getInstance(){
        if ( instancia == null){
            instancia = new EstoqueDAO();
        }
        return instancia;
    }
    public void adicionar(Produto produto){
        produto.setId(idProduto++);
        ProdutosList.add(produto);
    }

    public ObservableList<Produto> listarProdutos(){
        return ProdutosList;
    }

    public void remover(Produto produto){
        ProdutosList.remove(produto);
    }

    public double calcularTotalEstoque(){
        double valorTotal = ProdutosList.stream().mapToDouble(Produto::getValorTotal).sum();
    }


}