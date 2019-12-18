/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ProjetoLivraria.teste;

import br.com.ProjetoLivraria.DAO.AutorDAO;
import br.com.ProjetoLivraria.DAO.LivroDAO;
import br.com.ProjetoLivraria.beans.Autor;
import br.com.ProjetoLivraria.beans.Livro;
import br.com.ProjetoLivraria.util.ConnectionFactory;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Wellington César
 */
public class TestaConexao {
    
    public static void main(String[] args) throws SQLException {
       // ConnectionFactory conexao = new ConnectionFactory();
        //conexao.getConnection();
        
//        AutorDAO autorDAO = new AutorDAO();
//        
//        List<Autor> listaAutores = new ArrayList<>();
//        
//        listaAutores = autorDAO.listaTodos();
//        
//        System.out.println("ID - Nome");
//        for (Autor meuAutores : listaAutores) {
//            
//            System.out.println( meuAutores.getIdAutor() + " - " +meuAutores.getNome());
//        }
        
        LivroDAO livroDAO = new LivroDAO();
        
        List<Livro> listaLivros = new ArrayList<>();
        
        System.out.println("ID - TITULO - AUTOR");
        listaLivros = livroDAO.listaTodos();
        for (Livro meuLivro : listaLivros) {
            
            System.out.println( meuLivro.getIdLivro()+ " - " +meuLivro.getTitulo() + " - "+meuLivro.getAutor().getNome());
        }
        
    }
 
    
}
