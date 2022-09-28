/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author uniejoalbuquerque
 */
public class ContaCC {
    
    public int numConta;
    public double saldo;
    public double limite;
    
    public ContaCC(){
        numConta = 0;
        saldo = 0;
        limite = 0;
    }
    
    public void ContaCC(int n){
        numConta = n;
    }
    
    
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
    
    public double GetSaldo(){
        return saldo;
    }
    
    public double GetLimite(){
        return limite;
    }
    
   
    public void SetSaldo(double n){
        saldo = n;
    }
    
    public void SetLimite(double n){
        limite = n;
    }
    
}
