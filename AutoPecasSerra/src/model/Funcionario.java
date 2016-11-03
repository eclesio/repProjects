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
public class Funcionario extends Pessoa {
    private String especializacao_fun;
    private String cargo_fun;
    private float altura_fun;
    private float peso_fun;
    private String carteira_trabalho_fun;
    private Date data_cad_fun;

    public Funcionario() {
    }

    public Funcionario(String especializacao_fun, String cargo_fun, float altura_fun, float peso_fun, String carteira_trabalho_fun, Date data_cad_fun) {
        this.especializacao_fun = especializacao_fun;
        this.cargo_fun = cargo_fun;
        this.altura_fun = altura_fun;
        this.peso_fun = peso_fun;
        this.carteira_trabalho_fun = carteira_trabalho_fun;
        this.data_cad_fun = data_cad_fun;
    }

    public String getEspecializacao_fun() {
        return especializacao_fun;
    }

    public void setEspecializacao_fun(String especializacao_fun) {
        this.especializacao_fun = especializacao_fun;
    }

    public String getCargo_fun() {
        return cargo_fun;
    }

    public void setCargo_fun(String cargo_fun) {
        this.cargo_fun = cargo_fun;
    }

    public float getAltura_fun() {
        return altura_fun;
    }

    public void setAltura_fun(float altura_fun) {
        this.altura_fun = altura_fun;
    }

    public float getPeso_fun() {
        return peso_fun;
    }

    public void setPeso_fun(float peso_fun) {
        this.peso_fun = peso_fun;
    }

    public String getCarteira_trabalho_fun() {
        return carteira_trabalho_fun;
    }

    public void setCarteira_trabalho_fun(String carteira_trabalho_fun) {
        this.carteira_trabalho_fun = carteira_trabalho_fun;
    }

    public Date getData_cad_fun() {
        return data_cad_fun;
    }

    public void setData_cad_fun(Date data_cad_fun) {
        this.data_cad_fun = data_cad_fun;
    }


}
