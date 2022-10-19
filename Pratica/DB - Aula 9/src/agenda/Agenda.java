/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenda;

/**
 *
 * @author lrossi
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Agenda {
    private Connection conn;
    private PreparedStatement pstm;

    public String inserir(Pessoa pessoa){
        Conecta conexao = new Conecta();
        this.conn = conexao.conectar();
        if (conn==null)
            System.out.println("Erro na conexão");
        else
            System.out.println("Conectado com sucesso");
        
        try {
            pstm = conn.prepareStatement("INSERT INTO AGENDA (ID,NOME, TELEFONE) VALUES (?, ?, ?)");
            pstm.setInt(1, pessoa.getId());
            pstm.setString(2, pessoa.getNome());
            pstm.setString(3, pessoa.getTelefone());            
            pstm.execute();
            conexao.desconectar();
            return "Inserido com sucesso";
        } catch (SQLException ex) {
            return "Falha ao inserir no DB: " + ex.getMessage();
        }
    }
    
    public String deletar(String name){
        Conecta conexao = new Conecta();
        this.conn = conexao.conectar();
        if (conn==null)
            System.out.println("Erro na conexão");
        else
            System.out.println("Conectado com sucesso");
        try{
            String remove = "DELETE FROM AGENDA WHERE NOME = ?;";
            pstm = conn.prepareStatement(remove);
            pstm.setString(1, name);
            pstm.execute();
            conexao.desconectar();
            return "Deletado com sucesso";
        }
        catch (SQLException ex) {
            conexao.desconectar();
            return "Falha ao deletar no DB: " + ex.getMessage();
        }
        
        
    }
}
