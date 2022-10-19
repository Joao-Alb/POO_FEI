/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenda;

/**
 *
 * @author lrossi
 */
import java.sql.SQLException;  
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Agenda {
    private Connection conn;
    private PreparedStatement pstm;
    private ResultSet rs;      

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
    public boolean alterar(int numero, String nomeDepartamento) {
        // Abrindo a conexão com o banco​
        Conecta conexao = new Conecta();
        conn = conexao.conectar();
        try {
            // Instanciando o objeto preparedStatement (pstm)​
            pstm = conn.prepareStatement("UPDATE AGENDA SET NOME = ? WHERE ID = ?");
            // Setando o valor ao parâmetro​
            pstm.setString(1, nomeDepartamento);
            pstm.setInt(2, numero);
            // Executando o comando sql do objeto preparedStatement​
            pstm.execute();
            System.out.println("Alterado com Sucesso");
            // Fechando a conexão com o banco​
            conexao.desconectar();
            return true;
        } catch (SQLException e) {
            // Fechando a conexão com o banco​
            conexao.desconectar();
            return false;
        }
    }
    
      
    public ResultSet buscarPorNome(String nome) {
        // Abrindo a conexão com o banco​
        Conecta conexao = new Conecta();
        conn = conexao.conectar();
        try {
            // Instanciando o objeto preparedStatement (pstm)​
            pstm = conn.prepareStatement("SELECT * FROM AGENDA WHERE NOME = ? ORDER BY ID");
            pstm.setString(1, nome);
            // Executando o comando sql e armazenando no ResultSet
            rs = pstm.executeQuery();
            //Retornando o ResultSet​
             return rs;
        } catch (SQLException e) {
            conexao.desconectar();
            return null;
        }
    
    }

public ResultSet buscar() {
        // Abrindo a conexão com o banco​
        Conecta conexao = new Conecta();
        conn = conexao.conectar();
        try {
            // Instanciando o objeto preparedStatement (pstm)​
            pstm = conn.prepareStatement("SELECT * FROM AGENDA ORDER BY ID");
            // Executando o comando sql e armazenando no ResultSet
            rs = pstm.executeQuery();
            //Retornando o ResultSet​
             return rs;
        } catch (SQLException e) {
            conexao.desconectar();
            return null;
        }
    }    
        
}
