/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexaoDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VaiDaNaoEm
 */
public class Conexao {
    
    String url =  "jdbc:mysql://localhost:3306/autopecas";
    String user = "root";
    String pass = "";
    
    public Connection getConn(){
        try {
            Connection conexao = DriverManager.getConnection(url, user, pass);
            System.out.println("OK");
            return conexao;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
