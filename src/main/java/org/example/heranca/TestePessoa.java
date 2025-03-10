package org.example.heranca;

import org.example.heranca.aluno.Aluno;

public class TestePessoa {
    public static void main(String[] args) {

        //Visitante v1 = new Visitante();

        //v1.setNome("Luiz");
        //v1.setSexo("M");
        //v1.setIdade(37);

        //System.out.println(v1.toString());

        Aluno a1 = new Aluno();

        a1.setNome("Sandra");
        a1.setCurso("Software Development");
        a1.setMatricula(406);
        a1.setIdade(59);
        a1.setSexo("F");
        a1.pagarMatricula();

        System.out.println(a1.toString());


    }
}
