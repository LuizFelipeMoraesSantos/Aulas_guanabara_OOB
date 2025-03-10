package org.example.heranca.aluno;

public class Bolsista extends Aluno {

    public String bolsa;
    public String renovarBolsa;

    public boolean pagarMensalidade() {
        System.out.println("Matricula com deconto bolsista (PAGO!)");
        return false;
    }

    public String getBolsa() {
        return bolsa;
    }

    public void setBolsa(String bolsa) {
        this.bolsa = bolsa;
    }

    public String isRenovarBolsa() {
        return renovarBolsa;
    }

    public void setRenovarBolsa(boolean renovarBolsa) {
        this.renovarBolsa = String.valueOf(renovarBolsa);
    }
}
