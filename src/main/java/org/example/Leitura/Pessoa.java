package org.example.Leitura;

import javax.xml.crypto.Data;
import java.util.Calendar;

public class Pessoa  {
    private String nome,sexo;
    private int idade;

    public Pessoa(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Data getIdade() {
        return idade;
    }

    public void setIdade(Data idade) {
        this.idade = idade;
    }


    public void fazerAniversario(){
            System.out.println("Nome: "+getNome());
            System.out.println("Idade: "+getIdade());
            System.out.println("Sexo:" +getSexo());
            Calendar c = Calendar.getInstance();
            System.out.println("Nascido em "+c.get(Calendar.DAY_OF_MONTH) + " de "+c.get(Calendar.MONTH) +" "+c.get(Calendar.YEAR)) ;
    }
}
