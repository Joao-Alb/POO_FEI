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
    public int numero;
    public String nome;
    public double saldo;
    public double limite;
    
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
    
    
            
}
