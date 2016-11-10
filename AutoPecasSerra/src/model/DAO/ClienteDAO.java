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
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
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
                + ",CPF) VALUES(?,?,?,?,?,?,?,?);";

        try (PreparedStatement stmtPessoa = con.prepareStatement(sqlPessoa)) {

            stmtPessoa.setString(1, pe.getNome_pessoa());
            stmtPessoa.setString(2, pe.getContato_pessoa());
            stmtPessoa.setString(3, pe.getEmail_pessoa());
            stmtPessoa.setString(4, pe.getEnd_numero_pessoa());
            stmtPessoa.setString(5, pe.getEnd_cidade_pessoa());
            stmtPessoa.setString(6, pe.getEnd_estado_pessoa());
            stmtPessoa.setString(8, pe.getCpf_pessoa());

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

        stmtCli.setString(1, cli.getCli_senha());
        stmtCli.setString(2, cli.getCli_usuario());
        stmtCli.setDate(3, new java.sql.Date(Calendar.getInstance().getTime().getTime()));
        stmtCli.setInt(4, obj);

        stmtCli.execute();
        stmtCli.close();
        con.close();

    }

    public List<Cliente> Consultar() throws SQLException {
        Connection con = new Conexao().getConn();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Cliente> arrcli = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * from cliente inner join pessoa on cliente.pessoa_idpessoa = pessoa.idpessoa;");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente cli = new Cliente();

                cli.setId_cliente(rs.getInt("idcliente"));
                cli.setCli_senha(rs.getString("cli_senha"));
                cli.setCli_usuario(rs.getString("cli_usuario"));
                cli.setCli_data_cadastro(rs.getDate("data"));
                cli.setId_pessoa(rs.getInt("pessoa_idpessoa"));
                cli.setId_pessoa(rs.getInt("idpessoa"));
                cli.setNome_pessoa(rs.getString("nome"));
                cli.setContato_pessoa(rs.getString("contato"));
                cli.setEmail_pessoa(rs.getString("email"));
                cli.setEnd_numero_pessoa(rs.getString("end_numero"));
                cli.setEnd_cidade_pessoa(rs.getString("end_cidade"));
                cli.setEnd_estado_pessoa(rs.getString("end_estado"));
                cli.setCpf_pessoa(rs.getString("cpf"));

                arrcli.add(cli);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
        }

        return arrcli;
    }

    public void Atualizar(Cliente cli) throws SQLException {
        Connection con = new Conexao().getConn();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE cliente SET cli_senha = ? , cli_usuario = ? where idcliente = ?");
            stmt.setString(1, cli.getCli_senha());
            stmt.setString(2, cli.getCli_usuario());
            stmt.setInt(3,cli.getId_cliente());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
        }
    }

    public void Deletar(Cliente cli) throws SQLException {
        Connection con = new Conexao().getConn();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM cliente where id_produto = ?");
            stmt.setInt(1, cli.getId_cliente());
            
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO DELETAR");
        }finally{
            con.close();
        }
    }

}
