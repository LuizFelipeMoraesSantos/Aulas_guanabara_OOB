package org.example.Leitura;

public class TesteLivro {

    public static void main(String[] args){

        Pessoa[] p = new Pessoa[3];
        Livro[] l = new Livro[4];

        p[0] = new Pessoa("Luiz","M",27);
        p[1] =new Pessoa("Maria","F",30);

        l[0] = new Livro("Sebhor dos aneis","JRR",650,p[0]);
        l[1] =new Livro("Harry pother","Sandra",320,p[1]);

        l[0].detalhes();
    }
}
