/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula2.ex1;

/**
 *
 * @author uniejoalbuquerque
 */
public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    
    public void setNome(String n){
        nome = n;    
    }
    public String getNome(){
        return nome;
    }
    
    public void setCpf(String n){
        cpf = n;    
    }
    public String getCpf(){
        return cpf;
    }
    
    public void setIdade(int id){
        idade = id;    
    }
    public int getIdade(){
        return idade;
    }
   
}
