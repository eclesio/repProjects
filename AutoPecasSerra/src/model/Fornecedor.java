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
public class Fornecedor {
    private String nome_empresa_for;
    private String cnpj_for;
    private String ie_for;
    private String cep_for;
    private String rua_empresa_for;
    private String representante_for;
    private String email_emp_for;
    private String telefone_emp_for;
    private Date data_cad_for;

    public Fornecedor() {
    }

    public Fornecedor(String nome_empresa_for, String cnpj_for, String ie_for, String cep_for, String reua_empresa_for, String representante_for, String email_emp_for, String telefone_emp_for, Date data_cad_for) {
        this.nome_empresa_for = nome_empresa_for;
        this.cnpj_for = cnpj_for;
        this.ie_for = ie_for;
        this.cep_for = cep_for;
        this.rua_empresa_for = reua_empresa_for;
        this.representante_for = representante_for;
        this.email_emp_for = email_emp_for;
        this.telefone_emp_for = telefone_emp_for;
        this.data_cad_for = data_cad_for;
    }

    public String getNome_empresa_for() {
        return nome_empresa_for;
    }

    public void setNome_empresa_for(String nome_empresa_for) {
        this.nome_empresa_for = nome_empresa_for;
    }

    public String getCnpj_for() {
        return cnpj_for;
    }

    public void setCnpj_for(String cnpj_for) {
        this.cnpj_for = cnpj_for;
    }

    public String getIe_for() {
        return ie_for;
    }

    public void setIe_for(String ie_for) {
        this.ie_for = ie_for;
    }

    public String getCep_for() {
        return cep_for;
    }

    public void setCep_for(String cep_for) {
        this.cep_for = cep_for;
    }

    public String getRua_empresa_for() {
        return rua_empresa_for;
    }

    public void setRua_empresa_for(String reua_empresa_for) {
        this.rua_empresa_for = reua_empresa_for;
    }

    public String getRepresentante_for() {
        return representante_for;
    }

    public void setRepresentante_for(String representante_for) {
        this.representante_for = representante_for;
    }

    public String getEmail_emp_for() {
        return email_emp_for;
    }

    public void setEmail_emp_for(String email_emp_for) {
        this.email_emp_for = email_emp_for;
    }

    public String getTelefone_emp_for() {
        return telefone_emp_for;
    }

    public void setTelefone_emp_for(String telefone_emp_for) {
        this.telefone_emp_for = telefone_emp_for;
    }

    public Date getData_cad_for() {
        return data_cad_for;
    }

    public void setData_cad_for(Date data_cad_for) {
        this.data_cad_for = data_cad_for;
    }
    
}
