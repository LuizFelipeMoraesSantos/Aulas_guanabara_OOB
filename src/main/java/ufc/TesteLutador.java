package ufc;

import java.util.Locale;

public class TesteLutador {
    public static void main(String[] args){

         int [] l = new int[5];

        Lutador l[0] = new Lutador("Prety Boy","França", 31, 1.75, 68.9);
        Lutador l[1] = new Lutador("Felipe","Brasil",31,1.75,68.9,14,2,3);
        Lutador l[2] = new Lutador();
        Lutador l[3] = new Lutador();

        l[0].apresentar();
        l[2].staus();
        l[3].getCategoria();
        l[1].ganharLuta();
        l[0].empatarLuta();

    }
}
