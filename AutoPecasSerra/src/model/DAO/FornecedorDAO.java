/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import conexaoDAO.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Fornecedor;

/**
 *
 * @author VaiDaNaoEm
 */
public class FornecedorDAO {
    public void Inserir(Fornecedor frn){
        Connection conn = new Conexao().getConn();
        
        String sql = "INSERT INTO fornecedor (Nome_fornecedor, CNPJ, IE_forn, CEP, RuaEmpresa, Representante_fornecedor,"
                + "contato_fornecedor, telefone_fornecedor, data_cad_fornecedor) VALUES (?,?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, frn.getNome_empresa_for());
            stmt.setString(2, frn.getCnpj_for());
            stmt.setString(3, frn.getIe_for());
            stmt.setString(4, frn.getCep_for());
            stmt.setString(5, frn.getRua_empresa_for());
            stmt.setString(6, frn.getRepresentante_for());
            stmt.setString(7, frn.getEmail_emp_for());
            stmt.setString(8, frn.getTelefone_emp_for());
            stmt.setDate(9, new java.sql.Date(Calendar.getInstance().getTime().getTime()));
            
            stmt.execute();
            stmt.close();
            conn.close();
            System.out.println("Inserido");
            
        } catch (SQLException ex) {
            System.out.println("Erro "+ex);
        }
    }
}
