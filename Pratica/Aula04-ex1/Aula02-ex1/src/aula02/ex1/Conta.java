/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02.ex1;

/**
 *
 * @author uniejoalbuquerque
 */
public class Conta {
    private int numero;
    private String nome;
    private double saldo;
    private double limite;
    
    public boolean debitarSaldo(double n){
        
        if ((saldo-n)>(limite*-1)){
            saldo -= n;
            return true;
        }
        
        else
            return false;
            
    }
    
    public void creditarSaldo (double n){
        saldo += n;
    }
    
    public int GetNumero(){
        return numero;
    }
    
    public String GetNome(){
        return nome;
    }
    
    public double GetSaldo(){
        return saldo;
    }
    
    public double GetLimite(){
        return limite;
    }
    
    public void SetNumero(int n){
        numero = n;
    }
    
    public void SetNome(String n){
        nome = n;
    }
    
    public void SetSaldo(double n){
        saldo = n;
    }
    
    public void SetLimite(double n){
        limite = n;
    }
    
    public void Conta(){
        numero = 0;
        nome = " ";
        saldo = 0;
        limite = 0;
    }
    
    public void Conta(int n, String nom, double sl, double lm){
        numero = n;
        nome = nom;
        saldo = sl;
        limite = lm;
    }
    
    public String toString(){
        return "Número da conta: " +numero+"\nNome: "+nome+"\nSaldo: "+saldo+"\nLimite: "+limite+"\n\n";
    }
            
}
