package aula6;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author uniejoalbuquerque
 */
public class ContaCC extends Conta{
   
    
    private double limite;

    public ContaCC() {
        super();
        this.limite = 0;
    }
    
    public ContaCC(int numConta) {
        super(numConta);
    }

    public ContaCC(double limite, int numConta) {
        super(numConta);
        this.limite = limite;
    }

    public ContaCC(double limite, int numConta, double saldo) {
        super(numConta, saldo);
        this.limite = limite;
    }
    
    
    @Override
    public boolean debitarSaldo(double n) {
        if ((super.GetSaldo()-n)<(limite+super.GetSaldo())){
            super.SetSaldo(super.GetSaldo()-n);
            return true;
        }
        
        else
            return false;
    }
    
    public double GetLimite(){
        return limite;
    }
    
    public void SetLimite(double n){
        limite = n;
    }

    @Override
    public String toString() {
        return "\nConta corrente: "+super.toString()+"\nLimite: "+this.limite; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
