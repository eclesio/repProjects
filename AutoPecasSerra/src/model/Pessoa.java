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
public class Pessoa {
    private int id_pessoa;
    private String nome_pessoa;
    private String contato_pessoa;
    private String email_pessoa;
    private String end_logradouro_pessoa;
    private String end_numero_pessoa;
    private String end_cidade_pessoa;
    private String end_estado_pessoa;
    private String cpf_pessoa; 

    public Pessoa() {
    }

    public Pessoa(int id_pessoa, String nome_pessoa, String contato_pessoa, String email_pessoa, String end_logradouro_pessoa, String end_numero_pessoa, String end_cidade_pessoa, String end_estado_pessoa, String cpf_pessoa) {
        this.id_pessoa = id_pessoa;
        this.nome_pessoa = nome_pessoa;
        this.contato_pessoa = contato_pessoa;
        this.email_pessoa = email_pessoa;
        this.end_logradouro_pessoa = end_logradouro_pessoa;
        this.end_numero_pessoa = end_numero_pessoa;
        this.end_cidade_pessoa = end_cidade_pessoa;
        this.end_estado_pessoa = end_estado_pessoa;
        this.cpf_pessoa = cpf_pessoa;
    }

    public int getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(int id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    public String getNome_pessoa() {
        return nome_pessoa;
    }

    public void setNome_pessoa(String nome_pessoa) {
        this.nome_pessoa = nome_pessoa;
    }

    public String getContato_pessoa() {
        return contato_pessoa;
    }

    public void setContato_pessoa(String contato_pessoa) {
        this.contato_pessoa = contato_pessoa;
    }

    public String getEmail_pessoa() {
        return email_pessoa;
    }

    public void setEmail_pessoa(String email_pessoa) {
        this.email_pessoa = email_pessoa;
    }

    public String getEnd_logradouro_pessoa() {
        return end_logradouro_pessoa;
    }

    public void setEnd_logradouro_pessoa(String end_logradouro_pessoa) {
        this.end_logradouro_pessoa = end_logradouro_pessoa;
    }

    public String getEnd_numero_pessoa() {
        return end_numero_pessoa;
    }

    public void setEnd_numero_pessoa(String end_numero_pessoa) {
        this.end_numero_pessoa = end_numero_pessoa;
    }

    public String getEnd_cidade_pessoa() {
        return end_cidade_pessoa;
    }

    public void setEnd_cidade_pessoa(String end_cidade_pessoa) {
        this.end_cidade_pessoa = end_cidade_pessoa;
    }

    public String getEnd_estado_pessoa() {
        return end_estado_pessoa;
    }

    public void setEnd_estado_pessoa(String end_estado_pessoa) {
        this.end_estado_pessoa = end_estado_pessoa;
    }
    
    public String getCpf_pessoa() {
        return cpf_pessoa;
    }

    public void setCpf_pessoa(String cpf_pessoa) {
        this.cpf_pessoa = cpf_pessoa;
    }
    
    
    
}
