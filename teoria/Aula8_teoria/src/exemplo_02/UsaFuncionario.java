/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo_02;

import javax.swing.JOptionPane;

/**
 *
 * @author uniejoalbuquerque
 */
public class UsaFuncionario {
    
    public static void main(String[] args){
        Funcionario f1 = new Funcionario(
                   new Data (27, 9 ,2022), 2000, "Josenildo", "124134512-4", new Data(12,8,1994)
        );
        JOptionPane.showMessageDialog(null, f1, "Dados do funcionário: ", JOptionPane.INFORMATION_MESSAGE);
    
}
