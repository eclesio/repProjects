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
import javax.swing.JOptionPane;
import model.Venda;

/**
 *
 * @author VaiDaNaoEm
 */
public class VendaDAO {
    
        public void Inserir(Venda ve){
            Connection con = new Conexao().getConn();
            
            String sql = "INSERT INTO VENDA (VALOR_TOTAL_VENDA,DATA_VENDA,CLIENTE_IDCLIENTE,"
                    + "FUNCIONARIO_IDFUNCIONARIO,ITEMPRODUTO_IDPRODUTO) VALUES (?,?,?,?,?)";
            
            try (PreparedStatement stmt = con.prepareStatement(sql)) {
               
                stmt.setDouble(1, ve.getVtotal());
                stmt.setDate(2, new java.sql.Date(Calendar.getInstance().getTime().getTime()));
                stmt.setInt(3, 1);
                stmt.setInt(4, 1);
                stmt.setInt(5, 1);
                
                stmt.execute();
                stmt.close();
                con.close();
                
                JOptionPane.showMessageDialog(null,"Cadastrado com sucesso");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro ao cadastrar" + ex);
            }
        }
}
