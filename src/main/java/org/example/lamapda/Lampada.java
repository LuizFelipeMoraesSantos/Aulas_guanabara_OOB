package org.example.lamapda;

public class Lampada {
    String tipo;
    String cor;
    int quantidade;
    boolean estado;



    //Construtor
    public Lampada(String t,String c, int q){
        this.setCor(c);
        this.setTipo(t);
        this.setQuantidade(q);
        this.estado();
    }


    //Metodos get and set:
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


    //Métodos da Classe

    void estado(){
        System.out.println("Cor: "+getCor());
        System.out.println("Quantidade: "+getQuantidade());
        System.out.println("Tipo: "+getTipo());

    }
    public void ligada(){
        this.estado = true;
    }
    public void desligada(){
        this.estado = false;
    }

    void exibirlampada(){
        if(estado == true){
            System.out.println("Lampada está ligada!");
        }else{
            System.out.println(("Lampada está desligada"));
        }
    }
}
