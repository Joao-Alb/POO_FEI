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
    private BancoRestaurant resta = new BancoRestaurant();

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
    
    public void inserirProdHist(PedidoCliente pedido){
        
        Conecta conexao = new Conecta();
        this.conn = conexao.conectar();
        if (conn==null)
            System.out.println("Erro na conexão");
        else
            System.out.println("Conectado com sucesso");
        
        try {
            pstm = conn.prepareStatement("INSERT INTO HISTORICODEPEDIDOS (CPF, PRODUTO, QUANTIDADE, PRECOUNI, VPEDIDO, STATUS) VALUES (?, ?, ?, ?, ?,?)");
//            pstm.setString(1, pedido.getDateTime());
            pstm.setString(1, pedido.getCpf());
            pstm.setString(2, pedido.getProduto());
            pstm.setInt(3, pedido.getQuantidade());
            pstm.setDouble(4, pedido.getPrecoUnitario());
            pstm.setDouble(5, pedido.getValorPedido());
            pstm.setString(6, "-");
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
            pstm = conn.prepareStatement("INSERT INTO FILADEPEDIDOS (CPF, PRODUTO, QUANTIDADE, PRECOUNI, VPEDIDO, STATUS) VALUES (?, ?, ?, ?, ?,?)");
//            pstm.setString(1, pedido.getDateTime());
            pstm.setString(1, pedido.getCpf());
            pstm.setString(2, pedido.getProduto());
            pstm.setInt(3, pedido.getQuantidade());
            pstm.setDouble(4, pedido.getPrecoUnitario());
            pstm.setDouble(5, pedido.getValorPedido());
            pstm.setString(6, pedido.getStatus());
            pstm.execute();
            System.out.println("Inserido com sucesso");
            conexao.desconectar();
            inserirProdHist(pedido);
        } 
        catch (SQLException ex) {
            System.out.println("Falha ao inserir no DB: " + ex.getMessage());
        }
    }
    
    public void inserirRest(String cpf, String produto, int quantidade, double precouni, double vpedido){
        Conecta conexao = new Conecta();
        this.conn = conexao.conectar();
        if (conn==null)
            System.out.println("Erro na conexão");
        else
            System.out.println("Conectado com sucesso");
        
        try {
            buscarPedidos();
            pstm = conn.prepareStatement("INSERT INTO FILADEPEDIDOS (CPF, PRODUTO, QUANTIDADE, PRECOUNI, VPEDIDO, STATUS) VALUES (?, ?, ?, ?, ?, ?)");
//            pstm.setString(1, pedido.getDateTime());
            pstm.setString(1, cpf);
            pstm.setString(2, produto);
            pstm.setInt(3, quantidade);
            pstm.setDouble(4, precouni);
            pstm.setDouble(5, vpedido);
            pstm.setString(6, "Preparando...");
            pstm.execute();
            System.out.println("Inserido com sucesso");
            conexao.desconectar();
        } catch (SQLException ex) {
            System.out.println("Falha ao inserir no DB: " + ex.getMessage());
        }
    }
    
    
    public void remover (String cpf){
        Conecta conexao = new Conecta();
        conn = conexao.conectar();
        try{
            String remove = "DELETE FROM  FILADEPEDIDOS WHERE CPF = ?";
            pstm = conn.prepareStatement(remove);
            pstm.setString(1, cpf);
            pstm.execute();
            System.out.println("Pedido Cancelado!");
            conexao.desconectar();
            resta.AlterarStatusHistAll("Cancelado", cpf);
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
            String remove = "DELETE FROM FILADEPEDIDOS WHERE CPF = ? AND PRODUTO = ?";
            pstm = conn.prepareStatement(remove);
            pstm.setString(1, cpf);
            pstm.setString(2, produto);
            pstm.execute();
            
            conexao.desconectar();
            
            resta.AlterarStatusHist("Cancelado", cpf, produto);
            return "Removido com Sucesso";
        }
        catch (SQLException e){
            conexao.desconectar();
            return "Falha em remover no DB: " + e.getMessage();
        }
    }
    
    public ResultSet buscarQuantidade(String produto, String cpf){
        Conecta conexao = new Conecta() ;
        conn = conexao.conectar() ;
        try {
//            ResultSet rs2 = buscarPedidos();
            // Instanciando o objeto preparedStatement ( pstmt )?
            pstm = conn.prepareStatement("SELECT * FROM FILADEPEDIDOS WHERE CPF = ? AND PRODUTO = ?");
            pstm.setString (1, cpf);
            pstm.setString (2, produto);
            // Executando o comando sql e armazenando no ResultSet
            rs = pstm.executeQuery();
            // Retornando o ResultSet ?
            return rs;
        } catch ( SQLException e){
            conexao.desconectar();
            return null;
        }
        
    }
    
    
    public String alterarQuant ( String cpf , String produto, int quant, double vpedido) {
        Conecta conexao = new Conecta();
        conn = conexao.conectar ();
        try {
            pstm = conn.prepareStatement (" UPDATE FILADEPEDIDOS SET QUANTIDADE = ?,  VPEDIDO = ? WHERE CPF = ? AND PRODUTO = ?") ;
            pstm.setInt (1 , quant);
            pstm.setString (4 , produto);
            pstm.setDouble (2 , vpedido);
            pstm.setString (3 , cpf);
            pstm.execute () ;
            conexao.desconectar () ;
            resta.AlterarStatusHist("Cancelado", cpf, produto);
            PedidoCliente pedido = new PedidoCliente(cpf, produto, quant, vpedido/quant, vpedido, "");
            inserirProdHist(pedido);
            return "Alterado com sucesso";
        } catch ( SQLException e) {
            conexao.desconectar () ;
            return "Erro";
        }
    }
    
    
    public ResultSet buscarPorCPFpedidos (String cpf){
        // Abrindo a conexão com o banco ?
        Conecta conexao = new Conecta() ;
        conn = conexao.conectar() ;
        try {
            // Instanciando o objeto preparedStatement ( pstmt )?
           pstm = conn.prepareStatement("SELECT * FROM FILADEPEDIDOS WHERE CPF = ? ORDER BY CPF");
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
            pstm = conn.prepareStatement (" SELECT * FROM FILADEPEDIDOS ORDER BY CPF ");
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
