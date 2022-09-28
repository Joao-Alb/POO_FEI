
package exemplo_02;

public class Funcionario extends Pessoa {
   private Data admissao;
   private double salario;

    public Funcionario(Data admissao, double salario, String nome, String cpf, Data nascimento) {
        super(nome, cpf, nascimento);
        this.admissao = admissao;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return super.toString()+"\nAdmissao: "+this.admissao+"\nSalário: "+this.salario; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
   
   
}
