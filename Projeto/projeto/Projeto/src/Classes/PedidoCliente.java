/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author uniebspindola
 */
//import java.util.Date;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;

public class PedidoCliente {

//    private String data;
    private String cpf;
    private String produto;
    private int quantidade;
    private double precoUnitario;
    private double valorPedido;
    private double total;

    public PedidoCliente(String cpf, String produto, int quantidade, double precoUnitario, double valorPedido, double total) {
        this.cpf = cpf;
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.valorPedido = valorPedido;
        this.total = total;
    }

//    public String getDateTime() {
//	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//	Date date = new Date();
//	return dateFormat.format(date);
//    }

    public String getCpf() {
        return cpf;
    }

    public String getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public double getValorPedido() {
        return valorPedido;
    }

    public double getTotal() {
        return total;
    }

    
    
    @Override
    public String toString() {
        return "";
    }
    
    
    
    
}
