/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import conexaoDAO.Conexao;
import model.Cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Funcionario;
import model.Pessoa;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author VaiDaNaoEm
 */
public class FuncionarioDAO {
    
    public void InserirPessoa(Pessoa pe){
        
        Connection con = new Conexao().getConn();
        
        String sqlPessoa = "INSERT INTO PESSOA (NOME,CONTATO,EMAIL,END_NUMERO,END_CIDADE,END_ESTADO"
                + ",END_PAIS,CPF) VALUES(?,?,?,?,?,?,?,?);";
        
        try (PreparedStatement stmtPessoa = con.prepareStatement(sqlPessoa)){
                    stmtPessoa.setString(1, "Teste");
                    stmtPessoa.setString(2, "Contato");
                    stmtPessoa.setString(3, "e-mail");
                    stmtPessoa.setString(4, "474");
                    stmtPessoa.setString(5, "Vilhena");
                    stmtPessoa.setString(6, "Rondônia");
                    stmtPessoa.setString(7, "Brasil");
                    stmtPessoa.setString(8, "00000000000");
                    
                    stmtPessoa.execute();
                    stmtPessoa.close();
                    
                    } catch (SQLException ex) {
            throw new RuntimeException(ex + "Erro ao cadastrar pessoa");
        }
    }
    public void InserirFuncionario(Funcionario fun) throws SQLException{
        Connection con = new Conexao().getConn();
           String sqlBuscaID = "select MAX(idPessoa) from autopecas.pessoa";

        PreparedStatement stmtbuscaid = con.prepareStatement(sqlBuscaID);

        ResultSet rs = stmtbuscaid.executeQuery();
        rs.next();
        Integer obj = (rs.getInt(1));
        
        String sql = "INSERT INTO FUNCIONARIO (FUNC_CARGO,FUNC_ESPECIALIZACAO,FUNC_ALTURA, FUNC_PESO,"
                + "FUNC_CARTEIRADETRABALHO,FUNC_DATA_CAD,PESSOA_IDPESSOA) VALUES (?,?,?,?,?,?,?);";
        
        try (PreparedStatement stmtFuncionario = con.prepareStatement(sql)){
            stmtFuncionario.setString(1, "funcionario");
            stmtFuncionario.setString(2, "funcionario");
            stmtFuncionario.setDouble(3, 1.80);
            stmtFuncionario.setDouble(4, 65.0);
            stmtFuncionario.setDate(1, new java.sql.Date(Calendar.getInstance().getTime().getTime()));
            stmtFuncionario.setInt(1, obj);
            
            stmtFuncionario.execute();
            stmtFuncionario.close();
            
            con.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex + "Erro ao cadastrar pessoa");
        }
        
    }
}
