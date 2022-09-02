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
        
        //CONTA 01 SETUP
        System.out.printf("Número da conta 01: ");
        int n = input.nextInt();
        conta01.SetNumero(n);
        System.out.printf("\nNome da conta 01: ");
        String s = input.next();
        conta01.SetNome(s);
        System.out.printf("\nSaldo da conta 01: ");
        double a = input.nextDouble();
        conta01.SetSaldo(a);
        System.out.printf("\nLimite da conta 01: ");
        a = input.nextDouble();
        conta01.SetLimite(a);
        
        //CONTA 02 SETUP
        System.out.printf("\nNúmero da conta 02: ");
        n = input.nextInt();
        conta02.SetNumero(n);
        System.out.printf("\nNome da conta 02: ");
        s = input.next();
        conta02.SetNome(s);
        System.out.printf("\nSaldo da conta 02: ");
        a = input.nextDouble();
        conta02.SetSaldo(a);
        System.out.printf("\nLimite da conta 02: ");
        a = input.nextDouble();
        conta02.SetLimite(a);
        
        //CONTA 03 SETUP
        System.out.printf("\nNúmero da conta 03: ");
        n = input.nextInt();
        conta03.SetNumero(n);
        System.out.printf("\nNome da conta 03: ");
        s = input.next();
        conta03.SetNome(s);
        System.out.printf("\nSaldo da conta 03: ");
        a = input.nextDouble();
        conta03.SetSaldo(a);
        System.out.printf("\nLimite da conta 03: ");
        a = input.nextDouble();
        conta03.SetLimite(a);
        
        
        System.out.printf("\nDados da conta 1:\nNúmero: %d\nNome: %s\nSaldo: %.2f\nLimite: %.2f\n\n", conta01.GetNumero(), conta01.GetNome(), conta01.GetSaldo(), conta01.GetLimite() );
        System.out.printf("Dados da conta 2:\nNúmero: %d\nNome: %s\nSaldo: %.2f\nLimite: %.2f\n\n", conta02.GetNumero(), conta02.GetNome(), conta02.GetSaldo(), conta02.GetLimite() );
        System.out.printf("Dados da conta 3:\nNúmero: %d\nNome: %s\nSaldo: %.2f\nLimite: %.2f\n\n", conta03.GetNumero(), conta03.GetNome(), conta03.GetSaldo(), conta03.GetLimite() );
        
        if (conta01.debitarSaldo(2000)){
            System.out.printf("Debito realizado de 2000 reais na conta 1 com sucesso, conta agora com %.2f reais\n", conta01.GetSaldo());
        }
        else
            System.out.println("Saldo indisponivel para debitar 2000 na conta 01\n");
        
        conta01.creditarSaldo(2000);
        System.out.println("Creditado 2000 reais na conta01");
        
        if (conta01.debitarSaldo(2000)){
            System.out.printf("Debito realizado de 2000 reais na conta 1 com sucesso, conta agora com %.2f reais\n", conta01.GetSaldo());
        }
        else
            System.out.println("Saldo indisponivel para debitar 2000 na conta 1\n");
        
        if (conta02.debitarSaldo(2000)){
            System.out.printf("Debito realizado de 2000 reais na conta 2 com sucesso, conta agora com %.2f reais\n", conta02.GetSaldo());
        }
        else
            System.out.println("Saldo indisponivel para debitar 2000 na conta 2\n");
        
        
        if (conta03.debitarSaldo(5100)){
            System.out.printf("Debito realizado de 5100 reais na conta 3 com sucesso, conta agora com %.2f reais\n", conta03.GetSaldo());
        }
        else
            System.out.println("Saldo indisponivel para debitar 5100 na conta 3\n");
        
    }
    
}
