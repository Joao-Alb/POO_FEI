/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula02.ex1;

import java.util.Scanner;

/**
 *
 * @author uniejoalbuquerque
 */
public class Aula02Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        Conta v[];
        v = new Conta[10];
        
        for (int i = 0; i <3; i++){
            v[i] = new Conta();
        }
        //CONTA de v[0] SETUP
        System.out.printf("Numero da conta de v[0]: ");
        int n = input.nextInt();
        v[0].SetNumero(n);
        System.out.printf("\nNome da conta de v[0]: ");
        String s = input.next();
        v[0].SetNome(s);
        System.out.printf("\nSaldo da conta de v[0]: ");
        double a = input.nextDouble();
        v[0].SetSaldo(a);
        System.out.printf("\nLimite da conta de v[0]: ");
        a = input.nextDouble();
        v[0].SetLimite(a);
        
        //conta de v[1] SETUP
        System.out.printf("\nNumero da conta de v[1]: ");
        n = input.nextInt();
        v[1].SetNumero(n);
        System.out.printf("\nNome da conta de v[1]: ");
        s = input.next();
        v[1].SetNome(s);
        System.out.printf("\nSaldo da conta de v[1]: ");
        a = input.nextDouble();
        v[1].SetSaldo(a);
        System.out.printf("\nLimite da conta de v[1]: ");
        a = input.nextDouble();
        v[1].SetLimite(a);
        
        //conta v[2] SETUP
        System.out.printf("\nNumero da conta v[2]: ");
        n = input.nextInt();
        v[2].SetNumero(n);
        System.out.printf("\nNome da conta v[2]: ");
        s = input.next();
        v[2].SetNome(s);
        System.out.printf("\nSaldo da conta v[2]: ");
        a = input.nextDouble();
        v[2].SetSaldo(a);
        System.out.printf("\nLimite da conta v[2]: ");
        a = input.nextDouble();
        v[2].SetLimite(a);
        
        
        s = v[0].toString();
        System.out.printf("s");
        s = v[1].toString();
        System.out.printf("s");
        s = v[2].toString();
        System.out.printf("s");
        
        if (v[0].debitarSaldo(2000)){
            System.out.printf("Debito realizado de 2000 reais na conta 1 com sucesso, conta agora com %.2f reais\n", v[0].GetSaldo());
        }
        else
            System.out.println("Saldo indisponivel para debitar 2000 na conta de v[0]\n");
        
        v[0].creditarSaldo(2000);
        System.out.println("Creditado 2000 reais na v[0]");
        
        if (v[0].debitarSaldo(2000)){
            System.out.printf("Debito realizado de 2000 reais na conta 1 com sucesso, conta agora com %.2f reais\n", v[0].GetSaldo());
        }
        else
            System.out.println("Saldo indisponivel para debitar 2000 na conta 1\n");
        
        if (v[1].debitarSaldo(2000)){
            System.out.printf("Debito realizado de 2000 reais na conta 2 com sucesso, conta agora com %.2f reais\n", v[1].GetSaldo());
        }
        else
            System.out.println("Saldo indisponivel para debitar 2000 na conta 2\n");
        
        
        if (v[2].debitarSaldo(5100)){
            System.out.printf("Debito realizado de 5100 reais na conta 3 com sucesso, conta agora com %.2f reais\n", v[2].GetSaldo());
        }
        else
            System.out.println("Saldo indisponivel para debitar 5100 na conta 3\n");
        
    }
    
}
