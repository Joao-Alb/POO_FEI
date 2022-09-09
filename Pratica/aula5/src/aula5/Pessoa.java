/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula5;

/**
 *
 * @author uniejoalbuquerque
 */
public class Pessoa {
    private String nome;
    private int telefone;
    
    public Pessoa(String nm, int telef){
        this.nome = nm;
        this.telefone = telef;
    }
    
    public String print(){
        return "Nome do contato: "+nome+"\nTelefone: "+telefone+"\n\n";
    }   
    
    public String getNome(){
        return nome;
    }
}
