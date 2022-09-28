
package exemplo_01;


public class Pessoa {
    private String name;
    private String sobrenome;
    private int idade;

    public Pessoa(String name, String sobrenome, int idade) {
        this.name = name;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public String getName() {
        return name;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    @Override
    public String toString() {
        return "\nNome: "+this.name+"\nSobrenome: "+this.sobrenome+ "\nIdade: "+this.idade+"\n";
    }
    
    
}
