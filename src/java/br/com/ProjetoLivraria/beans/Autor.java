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
public class Autor {

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    private int idAutor;
    private String Nome; 

    public Autor (int idAutor, String Nome){
        this.idAutor = idAutor;
        this.Nome = Nome;

     }

    public Autor(String Nome) {
        this.Nome = Nome;
    }
    
    public Autor(){
        
    }
}
   
