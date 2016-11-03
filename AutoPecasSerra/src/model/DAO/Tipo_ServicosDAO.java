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
import model.Tipo_Servicos;

/**
 *
 * @author Eclesio
 */
public class Tipo_ServicosDAO {
    public void inserir(Tipo_Servicos ts){
        Connection conn = new Conexao().getConn();
        
        String sql = "INSERT INTO tipo_servicos (nome_tipserv) VALUES (?)";
        
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, ts.getNome_tipserv());
            
            stmt.execute();
            
            stmt.close();
            
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Tipo_ServicosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
