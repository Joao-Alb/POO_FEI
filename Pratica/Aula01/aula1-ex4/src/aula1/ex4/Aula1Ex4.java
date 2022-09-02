/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula1.ex4;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author uniejoalbuquerque
 */
public class Aula1Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random ran = new Random();
        Scanner input = new Scanner(System.in);
        int num[] = new int[100];
        int cont = 0;
        int maior = 0;
        
        for (int i = 0; i < 100; i++){
            num[i] = ran.nextInt(101);
            if (num[i]>maior)
                maior = num[i];
            else if (num[i] == maior)
                cont++;
        }
        
        System.out.printf("Maior número: %d\n", maior);
        System.out.printf("Quantidade de vezes que apareceu: %d\n", (cont+1));
        
    }
    
}
