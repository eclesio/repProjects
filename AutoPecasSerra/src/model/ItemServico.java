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
public class ItemServico {
    private int iditemserv;
    private int quantidade;
    private double vpro;
    private int idpro;

    public ItemServico() {
    }

    public ItemServico(int iditemserv, int quantidade, double vpro, int idpro) {
        this.iditemserv = iditemserv;
        this.quantidade = quantidade;
        this.vpro = vpro;
        this.idpro = idpro;
    }

    public int getIditemserv() {
        return iditemserv;
    }

    public void setIditemserv(int iditemserv) {
        this.iditemserv = iditemserv;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getVpro() {
        return vpro;
    }

    public void setVpro(double vpro) {
        this.vpro = vpro;
    }

    public int getIdpro() {
        return idpro;
    }

    public void setIdpro(int idpro) {
        this.idpro = idpro;
    }
    
}
