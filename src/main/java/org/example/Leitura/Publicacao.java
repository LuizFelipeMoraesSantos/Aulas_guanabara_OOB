package org.example.Leitura;

public interface Publicacao  {

    String detalhes();

    public void abrir();
    public void fechar();
    public void folhear(int p);
    public void avancarPag();
}
