/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agenda;

/**
 *
 * @author lrossi
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Pessoa p = new Pessoa(3, "Maria", "(11) 00000000");
        //agenda.inserir(p);
        String a = agenda.deletar("Maria");
        System.out.println(a);
    }
    
}
