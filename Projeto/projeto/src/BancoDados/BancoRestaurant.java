package BancoDados;


import BancoDados.BancoClient;
import BancoDados.Conecta;
import Classes.InfoC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.NumberFormat;


public class BancoRestaurant{

    private BancoClient cliente;
    private Connection conn;
    private PreparedStatement pstm;
    private ResultSet rs;
    
    
    //BRUNINHO: TEM QUE VERIFICAR SE O PRATO EXISTE E O CPF É CORRESPONDENTE À
    //ALGUÉM JÁ CADASTRADO
    
    
    
    public void remover (String cpf){
        Conecta conexao = new Conecta();
        conn = conexao.conectar();
        try{
            String remove = "DELETE FROM CLIENTES WHERE CPF = ?";
            pstm = conn.prepareStatement(remove);
            pstm.setString(1, cpf);
            pstm.execute();
            System.out.println("Removido com Sucesso");
            conexao.desconectar();
        }
        catch (SQLException e){
            conexao.desconectar();
            System.err.println("Falha em remover no DB: " + e.getMessage());
        }
    }
    
    public void removerFila (String cpf){
        Conecta conexao = new Conecta();
        conn = conexao.conectar();
        try{
            String remove = "DELETE FROM FILADEPEDIDOS WHERE CPF = ?";
            pstm = conn.prepareStatement(remove);
            pstm.setString(1, cpf);
            pstm.execute();
            System.out.println("Removido com Sucesso");
            conexao.desconectar();
        }
        catch (SQLException e){
            conexao.desconectar();
            System.err.println("Falha em remover no DB: " + e.getMessage());
        }
    }
    
    public ResultSet BuscaCPFHist(String cpf) {
        
        Conecta conexao = new Conecta();
        conn = conexao.conectar();
        try {
            // Instanciando o objeto preparedStatement (pstm)​
            pstm = conn.prepareStatement("SELECT * FROM HISTORICODEPEDIDOS WHERE CPF = ?");
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
    
    
    public ResultSet BuscaCPF(String cpf) {
        
        Conecta conexao = new Conecta();
        conn = conexao.conectar();
        try {
            // Instanciando o objeto preparedStatement (pstm)​
            pstm = conn.prepareStatement("SELECT * FROM FILADEPEDIDOS WHERE CPF = ?");
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
        NumberFormat formatter = new DecimalFormat("0.00");
        
        //ResultSet rs2 = cliente.buscarPorCPF(cpf);
        String ex = "";
        int precototal;
        try{
            ResultSet rs = BuscaCPFHist(cpf);
            //System.out.println(cpf);
            //System.out.println("chegueiaq");
            ex = ("\nNome: "+client.getNome()+ "    CPF: "+cpf +"\n------------------------------------------------------------------------------------------------------------------------\n"
                    + "\nEXTRATO: \n"
                    +"Produto                 \tQuantidade\t   Preço Unitário\t     Preço Total\t  Status" 
                    + "\n------------------------------------------------------------------------------------------------------------------------\n");
            //System.out.println("chegueiaq2");
            String checkex = ex;
            double p = 0;
            if(rs==null){
                return "Erro";
            }
            String a,sprecouni,sprecotot;
            String palabra = "";
            String pal = "";
            float precouni, precotot;
            while (rs.next()) {
                //System.out.println("passeiaq");
                a = rs.getString("Status");
                if (!a.equals("Cancelado")){
                    p += rs.getInt("Quantidade")*rs.getDouble("Precouni");
                }
                precouni = rs.getFloat("Precouni");
                sprecouni = formatter.format(precouni);
                precotot = rs.getFloat("Precouni")*rs.getFloat("Quantidade");
                sprecotot = formatter.format(precotot);
                
               int x = rs.getString("Produto").length();
               while ((22-x)>0){
                   palabra +=" ";
                   x++;
               }
                if (a.equals("-")){
                    pal = "        ";
                }
                else{
                    pal = "";
                }
                ex = ex + ("\n"+rs.getString("Produto") + palabra+"\t" +rs.getInt("Quantidade") + "\t           "+
                        sprecouni+
                        "\t          "+sprecotot+"\t"+pal+a);
            
            }
            String sp = formatter.format(p);
            ex = ex+("\n\nValor total:   R$: "+sp 
                    + "\n------------------------------------------------------------------------------------------------------------------------\n");
            if(ex.equals(checkex)){
                ex = "Não há nada no extrato";
            }
            return ex;
            
        }
        
        catch(SQLException e){
            return "Erro: "+e;
        }
    }
    
    public boolean AlterarStatus(String status, String cpf, String pedido) {
        // Abrindo a conexão com o banco​
        Conecta conexao = new Conecta();
        conn = conexao.conectar();
        try {
            // Instanciando o objeto preparedStatement (pstm)​
            pstm = conn.prepareStatement("UPDATE FILADEPEDIDOS SET STATUS = ? WHERE CPF = ? AND PRODUTO = ?");
            // Setando o valor ao parâmetro​
            pstm.setString(1, status);
            pstm.setString(2, cpf);
            pstm.setString(3, pedido);
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
    public boolean AlterarStatusHistAll(String status, String cpf) {
        // Abrindo a conexão com o banco​
        Conecta conexao = new Conecta();
        conn = conexao.conectar();
        try {
            // Instanciando o objeto preparedStatement (pstm)​
            pstm = conn.prepareStatement("UPDATE HISTORICODEPEDIDOS SET STATUS = ? WHERE CPF = ?");
            // Setando o valor ao parâmetro​
            pstm.setString(1, status);
            pstm.setString(2, cpf);
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
    
    public String removerProdRestaurante (String cpf, String produto){
        Conecta conexao = new Conecta();
        conn = conexao.conectar();
        try{
            String remove = "DELETE FROM FILADEPEDIDOS WHERE CPF = ? AND PRODUTO = ?";
            pstm = conn.prepareStatement(remove);
            pstm.setString(1, cpf);
            pstm.setString(2, produto);
            pstm.execute();
            
            conexao.desconectar();
            
            return "Pedido Pronto!";
        }
        catch (SQLException e){
            conexao.desconectar();
            return "Falha em remover no DB: " + e.getMessage();
        }
    }
    
    public boolean AlterarStatusHistPronto(String cpf, String pedido) {
        // Abrindo a conexão com o banco​
        Conecta conexao = new Conecta();
        conn = conexao.conectar();
        try {
            // Instanciando o objeto preparedStatement (pstm)​
            pstm = conn.prepareStatement("UPDATE HISTORICODEPEDIDOS SET STATUS = ? WHERE CPF = ? AND PRODUTO = ? AND STATUS = ?");
            // Setando o valor ao parâmetro​
            pstm.setString(1, "Pronto");
            pstm.setString(2, cpf);
            pstm.setString(3, pedido);
            pstm.setString(4, "-");
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
    
    public boolean AlterarStatusHist(String status, String cpf, String pedido) {
        // Abrindo a conexão com o banco​
        Conecta conexao = new Conecta();
        conn = conexao.conectar();
        try {
            // Instanciando o objeto preparedStatement (pstm)​
            pstm = conn.prepareStatement("UPDATE HISTORICODEPEDIDOS SET STATUS = ? WHERE CPF = ? AND PRODUTO = ?");
            // Setando o valor ao parâmetro​
            pstm.setString(1, status);
            pstm.setString(2, cpf);
            pstm.setString(3, pedido);
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
            pstm = conn.prepareStatement("SELECT * FROM FILADEPEDIDOS");
            // Executando o comando sql e armazenando no ResultSet
            rs = pstm.executeQuery();
            conexao.desconectar();
            //Retornando o ResultSet​
            System.out.println("cheguei");
             return rs;
        } 
        catch (SQLException e) {
            conexao.desconectar();
            return null;
        }
    }
    
    public String listadepedidos(){
        BancoRestaurant resta = new BancoRestaurant();
        String lista = "CPF          Pedido\tStatus" + "\n---------------------------------------------------------------------------\n";
        String checklista = lista;    
        try {

            rs = resta.Lista();
            System.out.println("cheguei");
            while (rs.next()) {
                System.out.println("passei");
                lista = lista + ("\n"+rs.getString("CPF") + "          " + 
                rs.getString("Produto")+"\t"+rs.getString("Status"));   
            }
            if(lista.equals(checklista)){
                lista = "Não há nada na fila";
                return lista;
            }
            else{
                    return lista;
            }
        } 

        catch( Exception e) {
                lista = "Erro na conexão com o Banco de Dados";
                return lista;
       } 
    }
    
    public ResultSet ListaClientes() {
        
        Conecta conexao = new Conecta();
        conn = conexao.conectar();
        try {
            // Instanciando o objeto preparedStatement (pstm)​
            pstm = conn.prepareStatement("SELECT * FROM CLIENTES");
            // Executando o comando sql e armazenando no ResultSet
            rs = pstm.executeQuery();
            conexao.desconectar();
            //Retornando o ResultSet​
            System.out.println("cheguei");
             return rs;
        } 
        catch (SQLException e) {
            conexao.desconectar();
            return null;
        }
    }
    
    public String listadeclientes(){
        BancoRestaurant resta = new BancoRestaurant();
        String lista2 = "CPF\tNome" + "\n-------------------------------------------";
        String checklista = lista2;    
        try {

            rs = resta.ListaClientes();
            System.out.println("cheguei");
            while (rs.next()) {
                System.out.println("passei");
                lista2 = lista2 + ("\n"+rs.getString("CPF") + "\t" + 
                rs.getString("NOME"));   
            }
            if(lista2.equals(checklista)){
                lista2 = "Não há nada na fila";
                return lista2;
            }
            else{
                    return lista2;
            }
        } 

        catch( Exception e) {
                lista2 = "Erro na conexão com o Banco de Dados";
                return lista2;
       } 
    }
    
}