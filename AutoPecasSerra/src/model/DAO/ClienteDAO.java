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
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cliente;
import model.Pessoa;

/**
 *
 * @author VaiDaNaoEm
 */
public class ClienteDAO {

    public void InserirPessoa(Pessoa pe) {
        Connection con = new Conexao().getConn();

        String sqlPessoa = "INSERT INTO PESSOA (NOME,CONTATO,EMAIL,END_NUMERO,END_CIDADE,END_ESTADO"
                + ",END_PAIS,CPF) VALUES(?,?,?,?,?,?,?,?);";

        try (PreparedStatement stmtPessoa = con.prepareStatement(sqlPessoa)) {

            stmtPessoa.setString(1, "Igor");
            stmtPessoa.setString(2, "333333");
            stmtPessoa.setString(3, "eclesio@hotmail");
            stmtPessoa.setString(4, "endereco");
            stmtPessoa.setString(5, "Edereco");
            stmtPessoa.setString(6, "ENDERECO");
            stmtPessoa.setString(7, "ENDERECO");
            stmtPessoa.setString(8, "ENDERECO");

            stmtPessoa.execute();
            stmtPessoa.close();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

    }

    public void InserirCliente(Cliente cli) throws SQLException {

        Connection con = new Conexao().getConn();

        String sqlBuscaID = "select MAX(idPessoa) from autopecas.pessoa";

        PreparedStatement stmtbuscaid = con.prepareStatement(sqlBuscaID);

        ResultSet rs = stmtbuscaid.executeQuery();
        rs.next();
        Integer obj = (rs.getInt(1));

        String sqlCliente = "INSERT INTO CLIENTE (CLI_SENHA, CLI_USUARIO, DATA, PESSOA_IDPESSOA) VALUES (?,?,?,?) ";
        
        PreparedStatement stmtCli = con.prepareStatement(sqlCliente);
        
        stmtCli.setString(1, "IFGOR USER");
        stmtCli.setString(2, "IGORINHO");
        stmtCli.setDate (3, new java.sql.Date(Calendar.getInstance().getTime().getTime()));
        stmtCli.setInt (4, obj);
        
        stmtCli.execute();
        stmtCli.close();
        con.close();

    }

}
