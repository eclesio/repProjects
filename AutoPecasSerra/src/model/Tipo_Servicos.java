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
public class Tipo_Servicos {
    
    private int id_tipser;
    private String nome_tipserv;

    public Tipo_Servicos() {
    }

    public Tipo_Servicos(int id_tipser, String nome_tipserv) {
        this.id_tipser = id_tipser;
        this.nome_tipserv = nome_tipserv;
    }

    public int getId_tipser() {
        return id_tipser;
    }

    public void setId_tipser(int id_tipser) {
        this.id_tipser = id_tipser;
    }

    public String getNome_tipserv() {
        return nome_tipserv;
    }

    public void setNome_tipserv(String nome_tipserv) {
        this.nome_tipserv = nome_tipserv;
    }
    
    
}
