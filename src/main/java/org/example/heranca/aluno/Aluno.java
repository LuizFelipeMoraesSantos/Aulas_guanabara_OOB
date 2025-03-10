package org.example.heranca.aluno;

import org.example.heranca.Pessoa;

public  class Aluno extends Pessoa {
    private int matricula;
    private String curso;


    public boolean pagarMensalidade() {
        System.out.println("Matricula PAGA!");
        return false;
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

}
