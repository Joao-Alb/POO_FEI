/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo_01;

import javax.swing.JOptionPane;

/**
 *
 * @author uniejoalbuquerque
 */
public class UsaPessoa {
    public static void main(String[] args){
        Aluno a1 = new Aluno("Eng","Joao", "Lima", 12);
        Professor p1 = new Professor("Computação", "Jose", "Filho", 45);
        Pessoa pe = new Pessoa("Fulano", "Souza", 234);
        
        JOptionPane.showMessageDialog(null,a1,"Dados do aluno", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null,p1,"Dados do professor", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null,pe,"Dados da pessoa", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
