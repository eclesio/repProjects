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
public class Produto {
    private int idproduto;
    private String nome_pro;
    private int qtd_pro;
    private String datecad;
    private double desc_pro;
    private int id_forn;
    private int id_cat;
    private int id_marca;

    public Produto() {
    }

    public Produto(int idproduto, String nome_pro, int qtd_pro, String datecad, double desc_pro, int id_forn, int id_cat, int id_marca) {
        this.idproduto = idproduto;
        this.nome_pro = nome_pro;
        this.qtd_pro = qtd_pro;
        this.datecad = datecad;
        this.desc_pro = desc_pro;
        this.id_forn = id_forn;
        this.id_cat = id_cat;
        this.id_marca = id_marca;
    }

    public int getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(int idproduto) {
        this.idproduto = idproduto;
    }

    public String getNome_pro() {
        return nome_pro;
    }

    public void setNome_pro(String nome_pro) {
        this.nome_pro = nome_pro;
    }

    public int getQtd_pro() {
        return qtd_pro;
    }

    public void setQtd_pro(int qtd_pro) {
        this.qtd_pro = qtd_pro;
    }

    public String getDatecad() {
        return datecad;
    }

    public void setDatecad(String datecad) {
        this.datecad = datecad;
    }

    public double getDesc_pro() {
        return desc_pro;
    }

    public void setDesc_pro(double desc_pro) {
        this.desc_pro = desc_pro;
    }

    public int getId_forn() {
        return id_forn;
    }

    public void setId_forn(int id_forn) {
        this.id_forn = id_forn;
    }

    public int getId_cat() {
        return id_cat;
    }

    public void setId_cat(int id_cat) {
        this.id_cat = id_cat;
    }

    public int getId_marca() {
        return id_marca;
    }

    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }
    
    
}
