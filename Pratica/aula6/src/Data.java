/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author uniejoalbuquerque
 */
public class Data {
    
    public int dia, mes, ano;
    
    public Data (int d, int m, int a){
        dia = d;
        mes = m;
        ano = a;
    }
    
    public String toString(){
        return "Data da criação da conta: "+dia+"/"+mes+"/"+ano;
    }
}
