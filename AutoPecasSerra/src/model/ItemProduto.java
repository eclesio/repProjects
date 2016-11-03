/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aluno
 */
public class ItemProduto {
    private int iditempro;
    private int quantidade;
    private double valorPro;
    private int idProduto;

    public ItemProduto() {
    }

    public ItemProduto(int iditempro, int quantidade, double valorPro, int idProduto) {
        this.iditempro = iditempro;
        this.quantidade = quantidade;
        this.valorPro = valorPro;
        this.idProduto = idProduto;
    }

    public int getIditempro() {
        return iditempro;
    }

    public void setIditempro(int iditempro) {
        this.iditempro = iditempro;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorPro() {
        return valorPro;
    }

    public void setValorPro(double valorPro) {
        this.valorPro = valorPro;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
    
}
