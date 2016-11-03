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
public class Servicos {
    private int idServicos;
    private String responsavel_ser;
    private String nome_cliente_ser;
    private String id_tipo_ser;
    private String descricao;
    private Date data_ser; 
    private int idItemServico;
    private int Funcionario_idFuncionario;
    private int id_tipserv;

    public Servicos() {
    }

    public Servicos(int idServicos, String responsavel_ser, String nome_cliente_ser, String id_tipo_ser, String descricao, Date data_ser, int idItemServico, int Funcionario_idFuncionario, int id_tipserv) {
        this.idServicos = idServicos;
        this.responsavel_ser = responsavel_ser;
        this.nome_cliente_ser = nome_cliente_ser;
        this.id_tipo_ser = id_tipo_ser;
        this.descricao = descricao;
        this.data_ser = data_ser;
        this.idItemServico = idItemServico;
        this.Funcionario_idFuncionario = Funcionario_idFuncionario;
        this.id_tipserv = id_tipserv;
    }

    public int getIdServicos() {
        return idServicos;
    }

    public void setIdServicos(int idServicos) {
        this.idServicos = idServicos;
    }

    public String getResponsavel_ser() {
        return responsavel_ser;
    }

    public void setResponsavel_ser(String responsavel_ser) {
        this.responsavel_ser = responsavel_ser;
    }

    public String getNome_cliente_ser() {
        return nome_cliente_ser;
    }

    public void setNome_cliente_ser(String nome_cliente_ser) {
        this.nome_cliente_ser = nome_cliente_ser;
    }

    public String getId_tipo_ser() {
        return id_tipo_ser;
    }

    public void setId_tipo_ser(String id_tipo_ser) {
        this.id_tipo_ser = id_tipo_ser;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData_ser() {
        return data_ser;
    }

    public void setData_ser(Date data_ser) {
        this.data_ser = data_ser;
    }

    public int getIdItemServico() {
        return idItemServico;
    }

    public void setIdItemServico(int idItemServico) {
        this.idItemServico = idItemServico;
    }

    public int getFuncionario_idFuncionario() {
        return Funcionario_idFuncionario;
    }

    public void setFuncionario_idFuncionario(int Funcionario_idFuncionario) {
        this.Funcionario_idFuncionario = Funcionario_idFuncionario;
    }

    public int getId_tipserv() {
        return id_tipserv;
    }

    public void setId_tipserv(int id_tipserv) {
        this.id_tipserv = id_tipserv;
    }

}