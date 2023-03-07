/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author uniebspindola
 */
public class InfoC extends Cliente {
    private String senha;

    public InfoC(String cpf, String nome, String senha) {
        super(nome, cpf);
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    
    
}
