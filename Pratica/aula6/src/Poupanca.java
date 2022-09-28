/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author uniejoalbuquerque
 */
public class Poupanca {
    
    public int numConta;
    public double saldo;
    
    public Poupanca(){
        numConta = 0;
        saldo = 0;
    }
    
    public Poupanca(int num){
        numConta = num;
    }
    
    public boolean debitarSaldo(double n){
        
        if (saldo>n){
            saldo -= n;
            return true;
        }
        
        else
            return false;
            
    }
    
    public void creditarSaldo (double n){
        saldo += n;
    } 
    
    
    
    public double GetSaldo(){
        return saldo;
    }
    
    public void SetSaldo(double n){
        saldo = n;
    }
    
    
}
