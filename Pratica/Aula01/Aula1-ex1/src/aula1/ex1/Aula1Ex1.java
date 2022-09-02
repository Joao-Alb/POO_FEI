/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula1.ex1;

import java.util.Scanner;

/**
 *
 * @author uniejoalbuquerque
 */
public class Aula1Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o valor de N1: ");
        int n1 = input.nextInt();
        System.out.println("Digite o valor de N2: ");
        int n2 = input.nextInt();
        System.out.println("Digite o valor de N3: ");
        int n3 = input.nextInt();
        
        int m = (n1+2*n2+3*n3)/6;
        
        System.out.println (m >= 5 ? "Aprovado" : "Reprovado");
    }
    
}
