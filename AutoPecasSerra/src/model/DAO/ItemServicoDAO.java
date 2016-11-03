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
import model.ItemServico;

/**
 *
 * @author VaiDaNaoEm
 */
public class ItemServicoDAO {
    
    public void inserir(ItemServico is){
        Connection con = new Conexao().getConn();
        
        String sql = "INSERT INTO itemservico (quantidade, valorUnitario_pro, idProduto)"
                + "VALUES (?,?,?)";
        
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, is.getQuantidade());
            stmt.setDouble(2, is.getVpro());
            stmt.setInt(3, is.getIdpro());
            
            stmt.execute();
            stmt.close();
            
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ItemServicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
