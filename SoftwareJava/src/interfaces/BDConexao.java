/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Mauricio
 */
public class BDConexao {
    private Connection BDConexao;
    public Connection connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Conexão efetuada com sucesso!");
        }
        catch(ClassNotFoundException cnfe) {
            System.out.println("Falha na conexão:" + cnfe);
        }
        String url = "jdbc:mysql://localhost:3306/ebella";
        try {
            BDConexao = DriverManager.getConnection(url, "root", "");
            System.out.println("Banco de Dados Conectado");
        }
        catch (SQLException se) {
            System.out.println("Sem Banco de Dados:" + se);  
        }
        return BDConexao;
    }
    
}
