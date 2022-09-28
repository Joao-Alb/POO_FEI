
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author uniejoalbuquerque
 */



public class ClienteBanco {
    
    Scanner input = new Scanner (System.in);
    
    private String nome;
    private String cpf;
    private Data ClienteDesde;
    private ContaCC contaCC;
    private ArrayList<Poupanca> contaPoupanca =  new ArrayList<>();
    
    private int flagCC;
    private int a;
    private int num;
    private String s1;
    double x, y, z;
    
    ClienteBanco(String n, String c, Data d){
        ClienteDesde = d;
        nome = n;
        cpf = c;
    }
    
    //FUNÇÕES PARA CONTA CC
    
    public void creditarCC(double n){
        contaCC.creditarSaldo(n);
    }
    
    public void limiteCC(double n){
        contaCC.SetLimite(n);
    }
    
    public boolean debitarCC(double n){
        n = n*1.01;
        return contaCC.debitarSaldo(n);
    }
    
    //FUNÇÕES PARA CONTA POUPANÇA
    
    public boolean creditarPoupanca(double n, int c){
        a = contaPoupanca.size();
        if (c<=a){
            contaPoupanca.get(c-1).creditarSaldo(n);
            return true;
        }
        
        return false;
    }
    
    
    public boolean debitarPoupanca(double n, int c){
        a = contaPoupanca.size();
        if (c<=a){
            
            return contaPoupanca.get(c-1).debitarSaldo(n);
        }
        
        return false;
    }
    
    public boolean abreConta(tipoConta tc){
        
        switch (tc){
        
            case POUPANCA:
                a = contaPoupanca.size();
                if (a < 2){
                    
                    System.out.println("Digite o numero da nova conta: ");
                    num = input.nextInt();
                      //pessoa.add(new Pessoa(nm, telef));
                    contaPoupanca.add(new Poupanca(num));
                    
                    return true;
                }

                else
                    return false;
            
            case CORRENTE:
                if (flagCC !=0){
                    flagCC++;
                    System.out.println("Digite o numero da nova conta: ");
                    num = input.nextInt();
                    contaCC.ContaCC(num);
                    return true;
                }
                else
                    return false;
            
            default:
                    return false;
        }  
                
    }
    
    public String toString(){
        s1 = ClienteDesde.toString();
        x = contaCC.limite;
        y = contaCC.saldo;
        
        
        return "Nome da conta: "+nome+"\nCPF: "+cpf+"\nCliente desde: "+s1+"\nSaldo da conta corrente: "+y
                +"\nLimite da conta corrente: "+x+"\nSaldo da Poupanca0: "+contaPoupanca.get(0).GetSaldo()
                +"\nSaldo da Poupanca1: "+contaPoupanca.get(1).GetSaldo()+"\n\n";
    }
   
    
}
