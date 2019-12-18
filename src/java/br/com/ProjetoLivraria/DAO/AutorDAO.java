/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ProjetoLivraria.DAO;

import br.com.ProjetoLivraria.beans.Autor;
import br.com.ProjetoLivraria.util.ConnectionFactory;
import br.com.ProjetoLivraria.util.SQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Wellington César
 */
public class AutorDAO {
  //  private final Util util = new Util();
  public List<Autor> listaTodos() throws SQLException {
      Connection con = new ConnectionFactory().getConnection();
      
      List<Autor> listaAutores = new ArrayList<>();
      String sql = SQL.SELECT_AUTOR;
      PreparedStatement stmt = null;
      ResultSet rs = null;
      
      try {
          stmt = con.prepareStatement(sql);
          rs = stmt.executeQuery();
          while (rs.next()) {
              Autor autor = new Autor(rs.getInt("ID"),rs.getString("NOME"));
              listaAutores.add(autor);
          }
          
      } catch (Exception ex) {
          
      
      
      }
          
      return listaAutores;
          
    /**
     *
     * @param autor
     */
//    public void InsereAutor(Autor autor){
//      Connection con = new ConnectionFactory().getConnection();
//      String sql = SQL.INSERT_AUTOR;
//      PreparedStatement stmt = null;
//      
//      try {
//          stmt = con.prepareStatement(sql);
//  
//          stmt.setString(1, autor.getNome());
//          
//          stmt.execute();
//          stmt.close();
//
//       } catch (SQLException u) {
//            throw new RuntimeException(u);
//        }
//    }    
  
  }
  
  
    
    
}
