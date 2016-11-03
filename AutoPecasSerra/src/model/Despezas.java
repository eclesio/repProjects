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
public class Despezas {
    private float contas_pagar_des;
    private float contas_receber_des;
    private float outros_des;

    public Despezas() {
    }

    public Despezas(float contas_pagar_des, float contas_receber_des, float outros_des, float valor_produto_des) {
        this.contas_pagar_des = contas_pagar_des;
        this.contas_receber_des = contas_receber_des;
        this.outros_des = outros_des;
    }

    public float getContas_pagar_des() {
        return contas_pagar_des;
    }

    public void setContas_pagar_des(float contas_pagar_des) {
        this.contas_pagar_des = contas_pagar_des;
    }

    public float getContas_receber_des() {
        return contas_receber_des;
    }

    public void setContas_receber_des(float contas_receber_des) {
        this.contas_receber_des = contas_receber_des;
    }

    public float getOutros_des() {
        return outros_des;
    }

    public void setOutros_des(float outros_des) {
        this.outros_des = outros_des;
    }    
}
