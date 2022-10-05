package aula6;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author uniejoalbuquerque
 */
public class Conta {
    private int numConta;
    private double saldo;

    public Conta() {
        this.numConta = 0;
        this.saldo = 0;
    }
    
    public Conta(int numConta) {
        this.numConta = numConta;
        saldo = 0;
    }
    
    public Conta(int numConta, double saldo) {
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public boolean debitarSaldo(double n){
        
        if (this.saldo>n){
            this.saldo -= n;
            return true;
        }
        
        else
            return false;
            
    }
    
    public void creditarSaldo (double n){
        this.saldo += n;
    } 
    
    
    
    public double GetSaldo(){
        return this.saldo;
    }
    
    public void SetSaldo(double n){
        this.saldo = n;
    }
    
    
    @Override
    public String toString() {
        return "\nNumero da conta: "+this.numConta+"\nSaldo: "+this.saldo; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
    
    
}
