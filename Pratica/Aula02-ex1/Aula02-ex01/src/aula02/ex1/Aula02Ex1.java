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
        Conta conta01 = new Conta();
        Conta conta02 = new Conta();
        Conta conta03 = new Conta();
        Scanner input = new Scanner(System.in);
        
        conta01.numero = 123;
        conta01.nome = "João Albuquerque";
        conta01.saldo = 1000;
        conta01.limite = 250;
        
        conta02.numero = 124;
        conta02.nome = "Bruno Spindola";
        conta02.saldo = 1000000000;
        conta02.limite = 25000000;
        
        conta03.numero = 125;
        conta03.nome = "Gabriel Calvo";
        conta03.saldo = 5000;
        conta03.limite = 350;
        
        System.out.printf("Dados da conta 1:\nNúmero: %d\nNome: %s\nSaldo: %.2f\nLimite: %.2f\n\n", conta01.numero, conta01.nome, conta01.saldo, conta01.limite );
        System.out.printf("Dados da conta 2:\nNúmero: %d\nNome: %s\nSaldo: %.2f\nLimite: %.2f\n\n", conta02.numero, conta02.nome, conta02.saldo, conta02.limite );
        System.out.printf("Dados da conta 3:\nNúmero: %d\nNome: %s\nSaldo: %.2f\nLimite: %.2f\n\n", conta03.numero, conta03.nome, conta03.saldo, conta03.limite );
        
        if (conta01.debitarSaldo(2000)){
            System.out.printf("Debito realizado de 2000 reais na conta 1 com sucesso, conta agora com %.2f reais\n", conta01.saldo);
        }
        else
            System.out.println("Saldo indisponivel para debitar 2000 na conta 01\n");
        
        conta01.creditarSaldo(2000);
        System.out.println("Creditado 2000 reais na conta01");
        
        if (conta01.debitarSaldo(2000)){
            System.out.printf("Debito realizado de 2000 reais na conta 1 com sucesso, conta agora com %.2f reais\n", conta01.saldo);
        }
        else
            System.out.println("Saldo indisponivel para debitar 2000 na conta 1\n");
        
        if (conta02.debitarSaldo(2000)){
            System.out.printf("Debito realizado de 2000 reais na conta 2 com sucesso, conta agora com %.2f reais\n", conta02.saldo);
        }
        else
            System.out.println("Saldo indisponivel para debitar 2000 na conta 2\n");
        
        
        if (conta03.debitarSaldo(5100)){
            System.out.printf("Debito realizado de 5100 reais na conta 3 com sucesso, conta agora com %.2f reais\n", conta03.saldo);
        }
        else
            System.out.println("Saldo indisponivel para debitar 5100 na conta 3\n");
        
    }
    
}
