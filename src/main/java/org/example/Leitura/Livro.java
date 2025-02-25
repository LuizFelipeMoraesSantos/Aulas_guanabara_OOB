package org.example.Leitura;

public class Livro implements Publicacao {

    private String titulo,autor;
    private int totPaginas,pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int pagAtual, int totPaginas, boolean aberto, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.pagAtual = 0;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public void detalhes(){
        System.out.println("LIVRO");
        System.out.println("Titulo: "+getTitulo());
        System.out.println("Autor: "+getAutor());
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear() {
        this.setPagAtual(getPagAtual() + 1);
    }

    @Override
    public void avancarPag() {

    }
}
