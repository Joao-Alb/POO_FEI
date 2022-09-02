/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula3.ex1;

import java.util.Scanner;

/**
 *
 * @author uniejoalbuquerque
 */
public class Aula3Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Televisao tv = new Televisao();
        
        String pt = tv.toString();
        System.out.printf(pt);
        
        tv.LigaouDesligaTV();
        
        tv.aumentarVolume();
        pt = tv.toString();
        System.out.printf(pt);
        
        tv.reduzirVolume();
        int s = tv.getSom();
        System.out.printf("\nSom: "+s+"\n\n");
        
        tv.reduzirVolume();
        s = tv.getSom();
        System.out.printf("\nSom: "+s+"\n\n");
        
        tv.setCanal(64);
        int c = tv.getCanal();
        System.out.printf("Canal: " +c+"\n\n");
        
        tv.subirCanal();
        c = tv.getCanal();
        System.out.printf("Canal: " +c+"\n\n");
        
        tv.descerCanal();
        c = tv.getCanal();
        System.out.printf("Canal: " +c+"\n\n");
        
        for (int i = 0; i < 33; i++){
            tv.aumentarVolume();
        }
        tv.LigaouDesligaTV();
        tv.setCanal(4);
        pt = tv.toString();
        System.out.printf(pt);
        
        
        
    }
    
}
