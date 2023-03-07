package BancoDados;


import BancoDados.BancoClient;
import BancoDados.Conecta;
import Classes.Cliente;
import Classes.Cliente;
import Classes.InfoC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class BancoRestaurant{

    private BancoClient cliente;
    private Connection conn;
    private PreparedStatement pstm;
    private ResultSet rs;
    
    
    //BRUNINHO: TEM QUE VERIFICAR SE O PRATO EXISTE E O CPF É CORRESPONDENTE À
    //ALGUÉM JÁ CADASTRADO
    
    public void remover (int cpf){
        Conecta conexao = new Conecta();
        conn = conexao.conectar();
        try{
            String remove = "DELETE FROM AGENDA WHERE CPF = ?";
            pstm = conn.prepareStatement(remove);
            pstm.setInt(1, cpf);
            pstm.execute();
            System.out.println("Removido com Sucesso");
            conexao.desconectar();
        }
        catch (SQLException e){
            conexao.desconectar();
            System.err.println("Falha em remover no DB: " + e.getMessage());
        }
    }
    
    public ResultSet BuscaCPF(String cpf) {
        
        Conecta conexao = new Conecta();
        conn = conexao.conectar();
        try {
            // Instanciando o objeto preparedStatement (pstm)​
            pstm = conn.prepareStatement("SELECT * FROM PEDIDOS WHERE CPF = ?");
            pstm.setString(1, cpf);
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
    
    public String ShowExtrato(InfoC client){
        String cpf = client.getCpf();
        ResultSet rs = BuscaCPF(cpf);
        //ResultSet rs2 = cliente.buscarPorCPF(cpf);
        String ex = "";
        int precototal;
        try{
            ex = ("\nNome: "+client.getNome()+ "    CPF: "+cpf
                    + "\nExtrato: "
                    +"Produto       Quantidade      Preço Unitário      Preço Total");
            String checkex = ex;
            double p = 0;
            while (rs.next()) {
                p += rs.getDouble("Quantidade")*rs.getDouble("Precouni");
                
                ex = ex + ("\n"+rs.getString("Produto") + "    " +rs.getDouble("Quantidade") + "     "+
                        rs.getDouble("Precouni")+
                        "     "+rs.getDouble("Precouni"));
                
            }
            ex = ex+("\n\nValor total:                              R$: "+p);
            if(ex.equals(checkex)){
                ex = "Não há nada no extrato";
            }
            return ex;
            
        }
        
        catch(SQLException e){
            return "Erro: "+e;
        }
    }
    
    public boolean AlterarStatus(String status, int id) {
        // Abrindo a conexão com o banco​
        Conecta conexao = new Conecta();
        conn = conexao.conectar();
        try {
            // Instanciando o objeto preparedStatement (pstm)​
            pstm = conn.prepareStatement("UPDATE PEDIDOS SET STATUS = ? WHERE ID = ?");
            // Setando o valor ao parâmetro​
            pstm.setString(1, status);
            pstm.setInt(2, id);
            // Executando o comando sql do objeto preparedStatement​
            pstm.execute();
            // Fechando a conexão com o banco​
            conexao.desconectar();
            return true;
        }
        catch (SQLException e) {
            // Fechando a conexão com o banco​
            conexao.desconectar();
            return false;
        }
    }
    
    public ResultSet Lista() {
        
        Conecta conexao = new Conecta();
        conn = conexao.conectar();
        try {
            // Instanciando o objeto preparedStatement (pstm)​
            pstm = conn.prepareStatement("SELECT * FROM PEDIDOS ORDER BY ID");
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