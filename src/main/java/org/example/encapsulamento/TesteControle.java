package org.example.encapsulamento;

public class TesteControle {
    public static void main(String[] args){


        controle c = new controle(50,true,true);

        c.ligar();
        c.play();
        c.maisVolume();
        c.abrirmenu();

    }
}
