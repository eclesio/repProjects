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
import model.Despezas;

/**
 *
 * @author VaiDaNaoEm
 */
public class DespezasDAO {
    
    public void Inserir(Despezas desp){
        Connection conn = new Conexao().getConn();
        
        String sql = "INSERT INTO despezas (contas_pagar, contas_receber, outras_desp, data_cad_desp) VALUES (?,?,?,?)"; 
        
        try (PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setFloat(1, desp.getContas_pagar_des());
            stmt.setFloat(2, desp.getContas_receber_des()); 
            stmt.setFloat(3, desp.getOutros_des()); 
            stmt.setDate(4,  new java.sql.Date(Calendar.getInstance().getTime().getTime())); 
            
            stmt.execute();
            stmt.close();            
            conn.close();
            
            System.out.println("Inserido");
            
        } catch (SQLException ex) {
            System.out.println("Erro "+ex);
        }
    }
}
