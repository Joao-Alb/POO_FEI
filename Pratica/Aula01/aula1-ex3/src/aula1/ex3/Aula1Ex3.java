/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula1.ex3;

import java.util.Scanner;

/**
 *
 * @author uniejoalbuquerque
 */
public class Aula1Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de números desejada, 0 para parar: ");
        
        int num[] = new int[20];
        int i = 0;
        int m = 0;
        
        while (i>=0){
            num[i] = input.nextInt();
            if (num[i] == 0)
                break;
            i++;     
        }
        int n = i;
        while (i !=-1){
            m += num[i];
            i--;
        }
        int media = m/n;
        
        System.out.printf("Valor da média: %d\n", media);
  
        
    }
    
}
