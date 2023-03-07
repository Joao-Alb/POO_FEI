/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.sql.SQLException;

/**
 *
 * @author uniebspindola
 */
abstract class Cliente {
    private String nome;
    private String cpf;


    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "\nNome: " + this.nome + "\nCPF: " + this.cpf + "";
    }
    
//    public boolean verificaLogin(Cliente usuario){
//        String sql = "select * from usuarios where usuario = '" + usuario.getLogin() 
//                   + "' and senha = '" + usuario.getSenha() + "'";
//        try {
//            pstmt = conn.prepareStatement(sql);
//            // Executando o comando sql e armazenando no ResultSet
//            rs = pstmt.executeQuery();
//            //Retornando o ResultSet​
//            while(rs.next()){
//                return true;
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
//        return false;
//    }
    
    
}
