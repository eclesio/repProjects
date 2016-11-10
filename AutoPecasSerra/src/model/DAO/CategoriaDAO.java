/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import conexaoDAO.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Categoria;

/**
 *
 * @author Eclesio
 */
public class CategoriaDAO {
    public void inserir(Categoria cat){
        Connection conn = new Conexao().getConn();
        
        String sql = "INSERT INTO categoria (nome_cate) VALUES (?)";
        
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, cat.getNome_cat());
            
            stmt.execute();
            stmt.close();
            
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public List<Categoria> Consultar() throws SQLException{
        Connection conn = new Conexao().getConn();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        Categoria ct = new Categoria();
        
        List<Categoria> ArrCat  = new ArrayList<>();
        
        try {
            stmt = conn.prepareStatement("SELECT * FROM CATEGORIA");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Categoria ctg = new Categoria();
                
                ctg.setId_categoria(rs.getInt("id_categoria"));
                ctg.setNome_cat(rs.getString("nome_cate"));
                
                ArrCat.add(ctg);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            conn.close();
        }
        
        return ArrCat;
    }
    
    public void Atualiza(Categoria ct){
        Connection con = new Conexao().getConn();
        PreparedStatement stmt = null;
        
        try {
            stmt = con. prepareStatement("UPDATE categoria SET nome_cate = ? WHERE id_categoria = ?");
            stmt.setString(1, ct.getNome_cat());
            stmt.setInt(2, ct.getId_categoria());
            
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void Deleta(Categoria ct){
        Connection con = new Conexao().getConn();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM categoria WHERE id_categoria = ?");
            stmt.setInt(1, ct.getId_categoria());
            
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
