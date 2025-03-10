package org.example.heranca.aluno;

import org.example.heranca.Pessoa;

public  class Aluno extends Pessoa {
    private int matricula;
    private String curso;


    public void pagarMatricula() {
        System.out.println("Matricula PAGA!");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno"+"\n"+
                "nome: " + getNome()+"\n"+
                "Idade: " + getIdade()+ "\n"+
                "Sexo: " + getSexo()+"\n" +
                "matricula: " + matricula+"\n" +
                "curso: '" + curso + '\'' +
                '}';
    }
}
