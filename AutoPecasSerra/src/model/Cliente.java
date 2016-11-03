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
public class Cliente extends Pessoa{
    private String cli_usuario;
    private String cli_senha;
    private Date cli_data_cadastro;
    private int pessoa_idpessoa;

    public Cliente() {
    }

    public Cliente(String cli_usuario, String cli_senha, Date cli_data_cadastro, int pessoa_idpessoa) {
        this.cli_usuario = cli_usuario;
        this.cli_senha = cli_senha;
        this.cli_data_cadastro = cli_data_cadastro;
        this.pessoa_idpessoa = pessoa_idpessoa;
    }

    public String getCli_usuario() {
        return cli_usuario;
    }

    public void setCli_usuario(String cli_usuario) {
        this.cli_usuario = cli_usuario;
    }

    public String getCli_senha() {
        return cli_senha;
    }

    public void setCli_senha(String cli_senha) {
        this.cli_senha = cli_senha;
    }

    public Date getCli_data_cadastro() {
        return cli_data_cadastro;
    }

    public void setCli_data_cadastro(Date cli_data_cadastro) {
        this.cli_data_cadastro = cli_data_cadastro;
    }

    public int getPessoa_idpessoa() {
        return pessoa_idpessoa;
    }

    public void setPessoa_idpessoa(int pessoa_idpessoa) {
        this.pessoa_idpessoa = pessoa_idpessoa;
    }
    
    
    
}
