package org.example.Conta;

public class Conta {
    public int numConta;
    private String tipo;
    private String dono;
    private float saldo;
    private boolean status;


    public Conta() {
    }

    public Conta(int numConta, String tipo, String dono, float saldo, boolean status) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    //Metodos
    public void exibir() {
        System.out.println("Conta: " + getNumConta() + "\n" +
                "Tipo: " + getTipo() + "\n" +
                "Dono:" + getDono() + "\n" +
                "Saldo: " + getSaldo() + "\n" +
                "status:" + isStatus());
    }

    public void aberturaDeConta() {
        if (!status) { // Apenas abre se estiver desativada
            this.setStatus(true);

            if (this.tipo.equals("CC")) {
                this.setSaldo(50.0f);
            } else if (this.tipo.equals("CP")) {
                this.setSaldo(150.0f);
            }

            System.out.println("Conta aberta com sucesso! Saldo inicial: R$" + getSaldo());
        } else {
            System.out.println("A conta já está ativa.");
        }
    }

    public void fecharConta() {
        if (getSaldo() == 0) {
            this.setStatus(false);
            System.out.println("Sua conta foi desativada");
        } else {
            System.out.println("Sua conta ainda tem saldo R$" + getSaldo() + "\n");
            System.out.println("Conta tem que estar vazia para cancelar");
        }
    }

    public void depositar(float deposito) {
        if (status == true) {
            setSaldo(saldo + deposito);
            System.out.println("Depósito de R$" + deposito + " realizado. Novo saldo: R$" + getSaldo());
        } else {
            System.out.println("Sua conta está desativada");
        }

    }

    public void sacar(float saque) {
        if (status) {
            if (getSaldo() >= saque) {
                setSaldo(getSaldo() - saque);
            } else {
                System.out.println("Erro: Saldo insuficiente para saque.");
            }
        } else {
            System.out.println("Erro: Sua conta está desativada.");
        }
    }

    public void pagarMensalidade() {
        if (status) {
            if (getTipo().equals("CC")) {
                saldo = saldo - 12;
            } else {
                saldo = saldo - 15;
            }
        } else {
            System.out.println("Erro: Sua conta está desativada.");
        }
    }
}