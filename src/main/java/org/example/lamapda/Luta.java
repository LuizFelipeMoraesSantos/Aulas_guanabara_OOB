package org.example.lamapda;

import ufc.Lutador;

public class Luta {


    private Lutador desafiado, desafiante;
    private int rounds;
    private boolean aprovado;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    //Métodos
    public void marcarLuta(Lutador l2, Lutador l1) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovado = true;
            this.desafiante = l1;
            this.desafiado = l2;
        } else {
            aprovado = false;
            desafiado = null;
            desafiante = null;

        }

    }


}
