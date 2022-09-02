/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula1.ex2;

import java.util.Scanner;

/**
 *
 * @author uniejoalbuquerque
 */
public class Aula1Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor de reais por hora: ");
        double r = input.nextDouble();
        System.out.println("Digite o valor de horas por mês: ");
        double h = input.nextDouble();
        
        double sb = h*r;
        double inss = 0.08*sb;
        double sc = sb*0.05;
        double sl = (1-0.24)*sb;
        
        System.out.printf("Salário bruto: %.2f\n", sb);
        System.out.printf("Valor do seu salário destinado ao INSS: %.2f\n", inss);
        System.out.printf("Valor do seu salário destinado ao sindicato: %.2f\n", sc);
        System.out.printf("Valor do seu salário líquido: %.2f\n", sl);
        
    }
    
}
