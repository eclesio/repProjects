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
import model.Servicos;

/**
 *
 * @author VaiDaNaoEm
 */
public class ServicosDAO {
    
    public void Inserir(Servicos ser){
        Connection con  = new Conexao().getConn();
        
        String sql = "INSERT INTO SERVICOS (DESCRICAO,DATA_SERVICO,IDITEMSERVICO,"
                + "FUNCIONARIO_IDFUNCIONARIO,ID_TIPSERV) VALUES (?,?,?,?,?);";
        
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            
            stmt.setString(1, ser.getDescricao());
            stmt.setDate(2, new java.sql.Date(Calendar.getInstance().getTime().getTime()));
            stmt.setInt(3, ser.getIdItemServico());
            stmt.setInt(4, ser.getFuncionario_idFuncionario());
            stmt.setInt(1, ser.getId_tipserv());
            
            stmt.execute();
            stmt.close();
            
            con.close();
            
            JOptionPane.showMessageDialog(null,"Cadastrado com sucesso" );
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar" + ex);
        }
    }
}
