package ufc;

import java.util.Locale;

public class TesteLutador {
    public static void main(String[] args){


        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Prety Boy", "França",
                31, 1.75, 68.9, 10, 2, 1);
        l[1] = new Lutador("Luiz Felipe","Brasil",
                37,1.82,92,10,5,0);

        Luta luta = new Luta();
        luta.marcarLuta(l[0],l[1]);
        luta.lutar();
        l[0].staus();
        l[1].staus();




    }
}
