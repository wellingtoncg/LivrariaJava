/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ProjetoLivraria.DAO;

import br.com.ProjetoLivraria.beans.Autor;
import br.com.ProjetoLivraria.beans.Livro;
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
public class LivroDAO {
    public List<Livro> listaTodos() throws SQLException {
      Connection con = new ConnectionFactory().getConnection();
      
      List<Livro> listaLivros = new ArrayList<>();
      String sql = SQL.SELECT_LIVRO;
      PreparedStatement stmt = null;
      ResultSet rs = null;
      
      try {
          stmt = con.prepareStatement(sql);
          rs = stmt.executeQuery();
          while (rs.next()) {
              Autor autor = new Autor(rs.getString("autor"));
              Livro livro = new Livro(rs.getInt("id"),rs.getString("titulo"),autor);
              listaLivros.add(livro);
          }
          
      } catch (Exception ex) {
          System.out.println("Erro no DAO livro");
      
      }
          
      return listaLivros;
      
    }
}
