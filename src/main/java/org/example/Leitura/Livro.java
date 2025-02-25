package org.example.Leitura;

public class Livro implements Publicacao {

    private String titulo,autor;
    private int totPaginas,pagAtual;
    private boolean aberto;
    private Pessoa leitor;

   public  Livro(){
   }

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
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

    @Override
    public String detalhes() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                "\nautor='" + autor + '\'' +
                "\ntotPaginas=" + totPaginas +
                "\n pagAtual=" + pagAtual +
                "\n aberto=" + aberto +
                "\n leitor=" + leitor.getNome() +
                '}';
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
    public void folhear(int p) {
        this.pagAtual = p;
    }

    @Override
    public void avancarPag() {
       this.setPagAtual(getPagAtual() + 1);
    }
}
