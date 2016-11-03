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
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Marca;

/**
 *
 * @author Eclesio
 */
public class MarcaDAO {
    public void inserir (Marca ma){
        Connection conn = new Conexao().getConn();
        String sql = "INSERT INTO marca (nome_marca) VALUES (?)";
        
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, ma.getNome_marca());
            
            stmt.execute();
            stmt.close();
            
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(MarcaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
