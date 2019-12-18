/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ProjetoLivraria.util;

/**
 *
 * @author Wellington César
 */
public class SQL {
    
    public static final String SELECT_AUTOR =  "SELECT * FROM AUTOR";
    public static final String DELETE_AUTOR =  "DELETE FROM AUTOR";
    public static final String INSERT_AUTOR =  "INSERT INTO livraria.autor (NOME) VALUES (?)";
    public static final String SELECT_LIVRO =  "SELECT livro.id, livro.titulo, autor.nome as autor FROM livraria.livro,livraria.autor WHERE livro.autor = autor.id";
    
    
}
