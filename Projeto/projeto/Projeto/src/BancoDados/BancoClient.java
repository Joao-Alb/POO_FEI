/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BancoDados;

import Classes.InfoC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Classes.PedidoCliente;

public class BancoClient {
    private Connection conn;
    private PreparedStatement pstm;
    private ResultSet rs;

    public void inserir(InfoC cliente){
        Conecta conexao = new Conecta();
        this.conn = conexao.conectar();
        if (conn==null)
            System.out.println("Erro na conexão");
        else
            System.out.println("Conectado com sucesso");
        
        try {
            pstm = conn.prepareStatement("INSERT INTO CLIENTES (CPF, NOME, SENHA) VALUES (?, ?, ?)");
            pstm.setString(1, cliente.getCpf());
            pstm.setString(2, cliente.getNome());
            pstm.setString(3, cliente.getSenha());
            pstm.execute();
            System.out.println("Inserido com sucesso");
            conexao.desconectar();
        } catch (SQLException ex) {
            System.out.println("Falha ao inserir no DB: " + ex.getMessage());
        }
    }
    
    public void inserirProd(PedidoCliente pedido){
        Conecta conexao = new Conecta();
        this.conn = conexao.conectar();
        if (conn==null)
            System.out.println("Erro na conexão");
        else
            System.out.println("Conectado com sucesso");
        
        try {
            pstm = conn.prepareStatement("INSERT INTO PEDIDOS (CPF, PRODUTO, QUANTIDADE, PRECOUNI, VPEDIDO) VALUES (?, ?, ?, ?, ?)");
//            pstm.setString(1, pedido.getDateTime());
            pstm.setString(1, pedido.getCpf());
            pstm.setString(2, pedido.getProduto());
            pstm.setInt(3, pedido.getQuantidade());
            pstm.setDouble(4, pedido.getPrecoUnitario());
            pstm.setDouble(5, pedido.getValorPedido());
            pstm.execute();
            System.out.println("Inserido com sucesso");
            conexao.desconectar();
        } catch (SQLException ex) {
            System.out.println("Falha ao inserir no DB: " + ex.getMessage());
        }
    }
    
    public void remover (String nome){
        Conecta conexao = new Conecta();
        conn = conexao.conectar();
        try{
            String remove = "DELETE FROM AGENDA WHERE NOME = ?";
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
    
    public String removerProd (String cpf, String produto){
        Conecta conexao = new Conecta();
        conn = conexao.conectar();
        try{
            String remove = "DELETE FROM PEDIDOS WHERE CPF = ? AND PRODUTO = ?";
            pstm = conn.prepareStatement(remove);
            pstm.setString(1, cpf);
            pstm.setString(2, produto);
            pstm.execute();
            
            conexao.desconectar();
            return "Removido com Sucesso";
        }
        catch (SQLException e){
            conexao.desconectar();
            return "Falha em remover no DB: " + e.getMessage();
        }
    }
    
    public int buscarQuantidade(String produto, String cpf){
        Conecta conexao = new Conecta() ;
        conn = conexao.conectar() ;
        try {
            // Instanciando o objeto preparedStatement ( pstmt )?
           pstm = conn.prepareStatement("SELECT * FROM PEDIDOS WHERE CPF = ? AND PRODUTO = ?");
            pstm.setString (1, cpf);
            pstm.setString (2, produto);
            // Executando o comando sql e armazenando no ResultSet
            rs = pstm.executeQuery() ;
            // Retornando o ResultSet ?
            return rs.getInt("Quantidade");
        } catch ( SQLException e){
            conexao.desconectar();
            return 0 ;
        }
    }
    
    public String alterarQuant ( String cpf , String produto, int q ) {
        Conecta conexao = new Conecta();
        conn = conexao.conectar ();
        try {
            int qatual = buscarQuantidade(produto, cpf);
            if (q>qatual){
                return "Quantidade insuficiente";
            }
            if (qatual==0){
                return "Este produto não está na sua lista";
            }
            if (qatual == q){
                String a = removerProd(cpf, produto);
                return a;
            }
            pstm = conn.prepareStatement (" UPDATE PEDIDOS SET QUANTIDADE = ? WHERE CPF = ?") ;
            pstm.setInt (1 , q );
            pstm.setString (2 , cpf);
            pstm.execute () ;
            conexao.desconectar () ;
            return "Alterado com sucesso";
        } catch ( SQLException e) {
            conexao.desconectar () ;
            return "Erro";
        }
    }
    
    public ResultSet buscarPorCPF (String cpf){
        // Abrindo a conexão com o banco ?
        Conecta conexao = new Conecta() ;
        conn = conexao.conectar() ;
        try {
            // Instanciando o objeto preparedStatement ( pstmt )?
           pstm = conn.prepareStatement("SELECT * FROM CLIENTES WHERE CPF = ? ORDER BY CPF");
            pstm.setString (1, cpf);
            // Executando o comando sql e armazenando no ResultSet
            rs = pstm.executeQuery() ;
            // Retornando o ResultSet ?
            return rs;
        } catch ( SQLException e){
            conexao.desconectar();
            return null ;
        }
    }
    
    public ResultSet buscar() {
        Conecta conexao = new Conecta () ;
        conn = conexao.conectar () ;
        try {
            pstm = conn.prepareStatement (" SELECT * FROM CLIENTES ORDER BY CPF ");
            rs = pstm.executeQuery () ;
            return rs ;
        } catch (SQLException e) {
            conexao.desconectar () ;
            return null ;
        }
    }
    
    public ResultSet buscarPedidos() {
        Conecta conexao = new Conecta () ;
        conn = conexao.conectar () ;
        try {
            pstm = conn.prepareStatement (" SELECT * FROM PEDIDOS ORDER BY CPF ");
            rs = pstm.executeQuery();
            return rs ;
        } catch (SQLException e) {
            conexao.desconectar () ;
            return null ;
        }
    }
    
    public boolean verificaLogin(String cpf, String senha){
        Conecta conexao = new Conecta();
        conn = conexao.conectar();
        String sql = "select * from clientes where cpf = '" + cpf
                   + "' and senha = '" + senha + "'";
        try {
            pstm = conn.prepareStatement(sql);
            // Executando o comando sql e armazenando no ResultSet
            rs = pstm.executeQuery();
            //Retornando o ResultSet​
            while(rs.next()){
                return true;
            }
        } catch (SQLException ex) {
            conexao.desconectar();
            System.out.println(ex.getMessage());
        }
        return false;
    }
    
    public String listar(){
        Conecta conexao = new Conecta();
        conn = conexao.conectar();
        try {
            ResultSet rs = buscar();
            String listar = "";
            while (rs.next()) {
                 listar = listar + ("\nNome: " + rs.getInt("NOME") + " - " + "\nCPF: "
                + rs.getString ("CPF") + "\n\n");
            }
        } 
        catch (SQLException e){
            System.out.println ("Consulta não foi possível " + e.getMessage());
        }
        return null;
    }
    
//    public ResultSet precoTotal(){
//        Conecta conexao = new Conecta();
//        conn = conexao.conectar();
//        try{
//            pstm = conn.prepareStatement ("SELECT SUM(TOTAL) FROM PEDIDOS GROUP BY CPF");
//            rs = pstm.executeQuery();
//            return rs;
//        }catch (SQLException e){
//            conexao.desconectar();
//        }
//        return null;
//    }
    
    public double precoTotal(){
        Conecta conexao = new Conecta();
        conn = conexao.conectar();
        try{
            ResultSet rs = buscarPedidos();
            double ptotal = 0;
            while(rs.next()){                        
                ptotal += rs.getInt("QUANTIDADE") * rs.getDouble("PRECO");
            }
            return (ptotal);
        }catch (SQLException e){
            System.out.println("Não é possível retornar o valor total!");
        }
        return 0;
    }
    
    
    public String listarPedidos(){
        Conecta conexao = new Conecta();
        conn = conexao.conectar();
        try {
            ResultSet rs = buscarPedidos();
            String listar = "";
            while (rs.next()) {
                 listar = listar + ("\nData: " + rs.getString("DATA") + "");
            }
        } 
        catch (SQLException e){
            System.out.println ("Consulta não foi possível " + e.getMessage());
        }
        return null;
    }
}
