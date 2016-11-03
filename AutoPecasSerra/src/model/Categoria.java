/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Eclesio
 */
public class Categoria {
    
    private int id_categoria;
    private String nome_cat;

    public Categoria() {
    }

    public Categoria(int id_categoria, String nome_cat) {
        this.id_categoria = id_categoria;
        this.nome_cat = nome_cat;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNome_cat() {
        return nome_cat;
    }

    public void setNome_cat(String nome_cat) {
        this.nome_cat = nome_cat;
    }
    
    
    
}
