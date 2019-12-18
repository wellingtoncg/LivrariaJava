/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ProjetoLivraria.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Wellington César
 */
public class ConnectionFactory {
    public Connection getConnection(){
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance(); 
            con = DriverManager.getConnection("jdbc:mysql://localhost/livraria","root","");
        } catch (SQLException e) {
            System.err.println("FALHA AO SE CONECTAR " + e.getMessage());
           
        } catch (Exception ex){
            System.err.println("ERRO NA APLICAÇÃO " + ex.getMessage());      
        }
        
        return con;
    }
}
