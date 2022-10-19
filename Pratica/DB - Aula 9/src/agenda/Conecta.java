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
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conecta {
    private Connection conn;
    
    public Connection conectar(){
        try{
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/agenda";
            conn = DriverManager.getConnection(url, "postgres", "fei");
            System.out.println("Conectado com Sucesso");
            return conn;
        } catch (ClassNotFoundException | SQLException e){
            System.out.println("Erro de conexão" + e.getMessage());
            return null;
        }
    }
    
    public void desconectar(){
        try{
            if(conn != null && !conn.isClosed()){
                conn.close();
            } 
        }catch (SQLException e){
            System.out.println("Erro");
        }
    }
    
}
