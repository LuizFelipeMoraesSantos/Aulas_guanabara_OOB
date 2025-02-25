package ufc;

import java.util.Random;

public class Luta {

    private Lutador desafiado, desafiante;
    private int rounds;
    private boolean aprovado;

    // Getters e Setters
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

    // Método para marcar a luta
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria() == (l2.getCategoria()) && l1 != l2) {
            this.aprovado = true;
            this.desafiado = l2;
            this.desafiante = l1;
        } else {
            this.aprovado = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    // Método para realizar a luta
    public void lutar() {
        if (this.aprovado) {
            System.out.println("=== APRESENTAÇÃO DOS LUTADORES ===");
            this.desafiado.apresentar();
            System.out.println("\n");
            this.desafiante.apresentar();

            Random rand = new Random();
            int vencedor = rand.nextInt(3); // 0 - Empate, 1 - Desafiante vence, 2 - Desafiado vence

            System.out.println("\n=== RESULTADO DA LUTA ===");
            switch (vencedor) {
                case 0:
                    System.out.println("Empate!");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                case 1:
                    System.out.println(this.desafiante.getNome() + " ganhou!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                case 2:
                    System.out.println(this.desafiado.getNome() + " ganhou!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
            }
        } else {
            System.out.println("A luta não pode acontecer.");
        }
    }
}
