package aula6;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author uniejoalbuquerque
 */
public class Poupanca extends Conta{

    public Poupanca(int numConta) {
        super(numConta);
    }

    public Poupanca() {
        super();
    }

    @Override
    public String toString() {
        return "\nPoupanca: \n"+super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
    
}
