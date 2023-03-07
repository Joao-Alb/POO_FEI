/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BancoDados;

import BancoDados.Conecta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author uniejoalbuquerque
 */
public class Produto {
    private Connection conn;
    private PreparedStatement pstm;
    private ResultSet rs;
    
    
    public void remover (String nome){
        Conecta conexao = new Conecta();
        conn = conexao.conectar();
        try{
            String remove = "DELETE FROM CARDAPIO WHERE NOME = ?";
            pstm = conn.prepareStatement(remove);
            pstm.setString(1, nome);
            pstm.execute();
            System.out.println("Removido com Sucesso");
            conexao.desconectar();
        }
        catch (SQLException e){
            conexao.desconectar();
            System.err.println("Falha em remover no DB: " + e.getMessage());
        }
    }
    
    public ResultSet buscarCardapio(String prato) {
        Conecta conexao = new Conecta () ;
        conn = conexao.conectar () ;
        try {
            pstm = conn.prepareStatement ("SELECT * FROM CARDAPIO WHERE PRODUTO = ? ORDER BY PRODUTO");
            pstm.setString(1, prato);
            rs = pstm.executeQuery();
            return rs ;
        } catch (SQLException e) {
            conexao.desconectar () ;
            return null ;
        }
    }
    
    
    public double BuscaPrato(String prato) {
        
        Conecta conexao = new Conecta();
        conn = conexao.conectar();
        try {
            System.out.println("cheguei");
            // Instanciando o objeto preparedStatement (pstm)​
            pstm = conn.prepareStatement("SELECT * FROM CARDAPIO WHERE PRODUTO = ?");
            pstm.setString(1, prato);
            // Executando o comando sql e armazenando no ResultSet
            rs = pstm.executeQuery();
            conexao.desconectar();
            //Retornando o ResultSet​
            
            //ResultSet rs = buscarCardapio(prato);
            double listar = 0;
            while (rs.next()) {
                 listar = listar + rs.getDouble("PRECO");
                 System.out.println(listar);
            }
             return listar;
        } 
        catch (SQLException e) {
            conexao.desconectar();
            return 0;
        }    
    }
    
    
    public ResultSet Lista() {
        
        Conecta conexao = new Conecta();
        conn = conexao.conectar();
        try {
            // Instanciando o objeto preparedStatement (pstm)​
            pstm = conn.prepareStatement("SELECT * FROM CARDAPIO ORDER BY ID");
            // Executando o comando sql e armazenando no ResultSet
            rs = pstm.executeQuery();
            conexao.desconectar();
            //Retornando o ResultSet​
             return rs;
        } 
        catch (SQLException e) {
            conexao.desconectar();
            return null;
        }
    }
    
    
    
}
