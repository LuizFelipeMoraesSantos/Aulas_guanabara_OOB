package org.example.Conta;


public class TesteConta {
    public static void main(String[] args){


    Conta conta = new Conta(1,"CC","Pedro",0,false);
    Conta conta2 = new Conta(2,"CC","Creuza",0,false);



    conta.aberturaDeConta();
    conta.depositar(300f);
    conta.pagarMensalidade();
    conta.exibir();
    System.out.println("\n");


    conta2.aberturaDeConta();
    conta2.depositar(500f);
    conta2.sacar(100f);
    conta2.pagarMensalidade();
    conta2.exibir();
    }

}
