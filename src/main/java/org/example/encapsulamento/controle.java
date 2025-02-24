package org.example.encapsulamento;

public class controle implements controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public controle(int volume, boolean ligado, boolean tocando) {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    //metodo abstrato.
    @Override //sobrescrever
    public void ligar() {
        this.setLigado(true);

    }
    @Override
    public void desligar(){
        this.setLigado(false);
    }

    @Override
    public void abrirmenu() {
        System.out.println("MENU");
        System.out.println("Está ligado!"+isLigado());
        System.out.println("Está tocando: "+isTocando());
        for(int i = 0;i <= this.getVolume();i+= 10){
            System.out.println("|");
        }
        System.out.println(isTocando());
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu!");
    }

    @Override
    public void maisVolume() {
        if(isLigado()){
            this.setVolume(getVolume() + 5);
        }

    }

    @Override
    public void menosVolume() {
        if(isLigado()){
            this.setVolume(getVolume() - 5);
        }

    }

    @Override
    public void ligaMudo() {
        if(isLigado() && getVolume() > 0){
            this.setVolume(0);
        }

    }

    @Override
    public void desligarMudo() {
        if(isLigado() && getVolume() > 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(isLigado()){
            setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(isLigado()){
            setTocando(false);
        }
    }
}
