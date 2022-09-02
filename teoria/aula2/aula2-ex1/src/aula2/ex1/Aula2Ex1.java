/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula2.ex1;

import java.util.Scanner;

/**
 *
 * @author uniejoalbuquerque
 */
public class Aula2Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();
        
        //set PESSOA 1
        System.out.printf("Digite o nome da pessoa 1: ");
        String nome = input.next();
        p1.setNome(nome);
        
        System.out.printf("Digite o CPF da pessoa 1: ");
        String cpf = input.next();
        p1.setCpf(cpf);
        
        System.out.printf("Digite a idade da pessoa 1: ");
        int idade = input.nextInt();
        p1.setIdade(idade);
              
        //set PESSOA 2
        System.out.printf("Digite o nome da pessoa 2: ");
        nome = input.next();
        p2.setNome(nome);
        
        System.out.printf("Digite o CPF da pessoa 2: ");
        cpf = input.next();
        p2.setCpf(cpf);
        
        System.out.printf("Digite a idade da pessoa 2: ");
        idade = input.nextInt();
        p2.setIdade(idade);
        
        //set PESSOA 3
        
        System.out.printf("Digite o nome da pessoa 3: ");
        nome = input.next();
        p3.setNome(nome);
        
        System.out.printf("Digite o CPF da pessoa 3: ");
        cpf = input.next();
        p3.setCpf(cpf);
        
        System.out.printf("Digite a idade da pessoa 3: ");
        idade = input.nextInt();
        p3.setIdade(idade);
        
        
        //get PESSOA 1
        
        nome = p1.getNome();
        cpf = p1.getCpf();
        idade = p1.getIdade();
        
        System.out.printf("\nPESSOA 1\nNOME: %s\nCPF: %s\nIDADE: %d\n", nome, cpf, idade);
        
        //get PESSOA 2
        
        nome = p2.getNome();
        cpf = p2.getCpf();
        idade = p2.getIdade();
        
        System.out.printf("\nPESSOA 2\nNOME: %s\nCPF: %s\nIDADE: %d\n", nome, cpf, idade);
        
        //get PESSOA 3
        
        nome = p3.getNome();
        cpf = p3.getCpf();
        idade = p3.getIdade();
        
        System.out.printf("\nPESSOA 3\nNOME: %s\nCPF: %s\nIDADE: %d\n", nome, cpf, idade);
        
    }
    
}
