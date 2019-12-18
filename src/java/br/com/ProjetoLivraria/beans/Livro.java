/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ProjetoLivraria.beans;

/**
 *
 * @author Wellington César
 */
public class Livro {

    public Livro(int idLivro, String titulo, Autor autor) {
        this.idLivro = idLivro;
        this.titulo = titulo;
        this.autor = autor;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getLancamento() {
        return lancamento;
    }

    public void setLancamento(String lancamento) {
        this.lancamento = lancamento;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    private int idLivro;
    private String titulo;
    private String isbn;
    private double preco;
    private String lancamento;
    private Autor autor;
    
     public Livro(int idLivro, String titulo) {
        this.idLivro = idLivro;
        this.titulo = titulo;
}

    public Livro(int idLivro, String titulo, String isbn, double preco, String lancamento, Autor autor) {
        this.idLivro = idLivro;
        this.titulo = titulo;
        this.isbn = isbn;
        this.preco = preco;
        this.lancamento = lancamento;
        this.autor = autor;
    }

    
     

   
    }
