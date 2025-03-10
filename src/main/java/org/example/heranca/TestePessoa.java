package org.example.heranca;

import org.example.heranca.aluno.Aluno;
import org.example.heranca.aluno.Bolsista;

public class TestePessoa {
    public static void main(String[] args) {

        //Visitante v1 = new Visitante();

        //v1.setNome("Luiz");
        //v1.setSexo("M");
        //v1.setIdade(37);

        //System.out.println(v1.toString());

        //Aluno a1 = new Aluno();

        //a1.setNome("Sandra");
        //a1.setCurso("Software Development");
        //a1.setMatricula(406);
        //a1.setIdade(59);
        //a1.setSexo("F");
        //a1.pagarMatricula();

        //System.out.println(a1.toString());

        Professor p1 = new Professor();

        p1.setNome("Victor");
        p1.setEspecialidade("Portugues");
        p1.setSalario(2500.00);
        p1.setIdade(50);
        p1.setSexo("M");
        p1.aumentoSalario(100.00);

        System.out.println(p1.getSalario());


        Bolsista b1 = new Bolsista();

        b1.setBolsa(String.valueOf(true));
        b1.setRenovarBolsa(Boolean.parseBoolean(String.valueOf(false)));
        b1.pagarMensalidade();
        b1.setNome("Felipe Moraes");

        System.out.println(b1.getNome());
        System.out.println(b1.pagarMensalidade());
    }
}
