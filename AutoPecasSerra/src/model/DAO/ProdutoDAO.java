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
import model.Produto;

/**
 *
 * @author VaiDaNaoEm
 */
public class ProdutoDAO {
    
    public void inserir(Produto p){
        
        Connection conn = new Conexao().getConn();
        
        String sql = "INSERT INTO produto (nome_pro, quantidade_pro, data_cad_pro, desconto_pro, "
                + "Fornecedor_idFornecedor, id_categoria, id_marca) VALUES(?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, p.getNome_pro());
            stmt.setInt(2, p.getQtd_pro());
            stmt.setString(3, p.getDatecad());
            stmt.setDouble(4, p.getDesc_pro());
            stmt.setInt(5, p.getId_forn());
            stmt.setInt(6, p.getId_cat());
            stmt.setInt(7, p.getId_marca());
            
            stmt.execute();
            stmt.close();
            
            conn.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
