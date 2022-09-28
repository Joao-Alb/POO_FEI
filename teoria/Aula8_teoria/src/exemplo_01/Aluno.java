/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo_01;

/**
 *
 * @author uniejoalbuquerque
 */
public class Aluno extends Pessoa {
    private String curso;

    public Aluno(String curso, String name, String sobrenome, int idade) {
        super(name, sobrenome, idade);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString()+"Curso: "+this.curso+"\n"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    
    
}
