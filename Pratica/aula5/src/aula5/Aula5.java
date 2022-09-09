/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula5;

/**
 *
 * @author uniejoalbuquerque
 */

import java.util.Scanner;
import java.util.ArrayList;



public class Aula5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        ArrayList<Pessoa> pessoa =  new ArrayList<>();
        
        String x = "";
        String y = "q";
        String nm;
        int a = 0;
        int telef;
        
        System.out.println("Seja bem vindo ao programa!");
        do{
            System.out.println("Segue a lista de comandos:");
            System.out.println("n: Cria uma pessoa na agenda");
            System.out.println("d: Deleta uma pessoa na agenda");
            System.out.println("p: Imprime toda a agenda");
            System.out.println("S: Imprime uma pessoa da agenda");
            System.out.println("Q: sai do progama");
            System.out.println("Digite o comando desejado: ");
            x = input.next();
            
            switch(x){
                case "n":
                    System.out.println("Insira o nome desejado: ");
                    nm = input.next();
                    System.out.println("Insira o telefone do contato: ");
                    telef = input.nextInt();
                    pessoa.add(new Pessoa(nm, telef));
                    break;
                
                case "d":
                    System.out.println("Insira nome do contato para deletar: ");
                    nm = input.next();
                    
                    for (int i = 0; i < pessoa.size(); i++){
                        if (nm.equals((pessoa.get(i).getNome()))){
                            pessoa.remove(i);
                            System.out.println("Contato"+nm+"Removido");
                            a = 1;
                            break;
                        }
                        a = 0;
                    }
                    if (a == 0)
                        System.out.println("Ninguém com este nome na lista!");
                    break;
                
                case "p":
                    System.out.println("Imprimindo agenda inteira\n");
                    for (int i = 0; i < pessoa.size(); i++){
                        System.out.println(pessoa.get(i).print());   
                    }
                    break;
                case "S":
                    System.out.println("Insira o nome que deseja procurar: ");
                    nm = input.next();
                    
                    for (int i = 0; i < pessoa.size(); i++){
                        if (nm.equals((pessoa.get(i).getNome()))){
                            System.out.println(pessoa.get(i).print());
                            a = 1;
                            break;
                        }
                        a = 0;
                    }
                    if (a == 0)
                        System.out.println("Não tem este nome na lista\n");
                    break;
                    
                case "q":
                    break;
                default:
                    System.out.println("Comando incorreto\n");
                                     
            } 
            
            
        }while(x.equals(y)== false);       
            
    }
    
}
