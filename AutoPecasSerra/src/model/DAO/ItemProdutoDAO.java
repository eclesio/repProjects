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
import model.ItemProduto;

/**
 *
 * @author VaiDaNaoEm
 */
public class ItemProdutoDAO {
    
    public void inserir (ItemProduto ip){
        Connection con = new Conexao().getConn();
        
        String sql = "INSERT INTO itemproduto(quantidade, valorUnitario_pro, idProduto)"
                + "VALUES (?,?,?)";
        
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1,ip.getQuantidade());
            stmt.setDouble(2,ip.getValorPro());
            stmt.setInt(3,ip.getIdProduto());
            
            stmt.execute();
            stmt.close();
            
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ItemProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
