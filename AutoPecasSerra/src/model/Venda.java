/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Venda {
    private int idVenda;
    private Double vtotal;
    private Date data_venda;
    private int id_cliente;
    private int id_funcionario;
    private int id_itemproduto;

    public Venda() {
    }

    public Venda(int idVenda, Double vtotal, Date data_venda, int id_cliente, int id_funcionario, int id_itemproduto) {
        this.idVenda = idVenda;
        this.vtotal = vtotal;
        this.data_venda = data_venda;
        this.id_cliente = id_cliente;
        this.id_funcionario = id_funcionario;
        this.id_itemproduto = id_itemproduto;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public Double getVtotal() {
        return vtotal;
    }

    public void setVtotal(Double vtotal) {
        this.vtotal = vtotal;
    }

    public Date getData_venda() {
        return data_venda;
    }

    public void setData_venda(Date data_venda) {
        this.data_venda = data_venda;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public int getId_itemproduto() {
        return id_itemproduto;
    }

    public void setId_itemproduto(int id_itemproduto) {
        this.id_itemproduto = id_itemproduto;
    }
    
}