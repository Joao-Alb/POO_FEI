
package exemplo_02;


public class Pessoa {
    private String nome;
    private String cpf;
    private Data nascimento;

    public Pessoa(String nome, String cpf, Data nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public String toString() {
        return "\nNome: "+this.nome+"\nCPF: "+"Data de nascimento: "+this.nascimento; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
