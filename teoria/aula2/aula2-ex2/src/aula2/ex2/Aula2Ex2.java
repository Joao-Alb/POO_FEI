/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula2.ex2;

import java.util.Scanner;

/**
 *
 * @author uniejoalbuquerque
 */
public class Aula2Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        Swapper troca = new Swapper();
        
        System.out.printf("Digite o valor de x: ");
        float x = input.nextFloat();
        troca.setX(x);
        
        System.out.printf("Digite o valor de y: ");
        float y = input.nextFloat();
        troca.setY(y);
        
        System.out.printf("Você setou os seguintes valores:\nx = "+troca.getX()+"\ny = "+troca.getY());
        System.out.printf("\nUsando função Swapper:\n");
        troca.swap();
        System.out.printf("x = "+troca.getX()+"\ny = "+troca.getY()+"\n");
        
        
        
        
    }
    
}
