package ufc;

public class Lutador implements Controlador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitoria;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitoria, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.vitoria = vitoria;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public Lutador(){
    }

    public Lutador(String pretyBoy, String frança, int i, double v, double v1) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        if(peso <52.2){
            this.setCategoria("Invalido");
        } else if (peso <= 70.3) {
            this.setCategoria("Leve");
        } else if (peso <= 83.9) {
            this.setCategoria("Médio");
        } else if (peso <= 120.2) {
            this.setCategoria("Peso pesado");
        }else {
            System.out.println("Invalido");
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }


    @Override
    public void apresentar() {
        System.out.println("APRESENTAÇÃO LUTADOR");
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem: "+ getNacionalidade());
        System.out.println("Idade: "+ getIdade());
        System.out.println("Altura: "+ getAltura());
        System.out.println("Pesando: "+ getPeso());
        System.out.println("Ganhou: "+getVitoria());
        System.out.println("Perdeu: "+getDerrotas());
        System.out.println("Empatou: "+ getEmpates());
    }

    @Override
    public void staus() {
        System.out.println(getNome());
        System.out.println("é um peso " + getPeso());
        System.out.println(" com " + getVitoria()+ " vitorias.");
        System.out.println(getDerrotas() + "derrotas");
        System.out.println(getEmpates()+"empates");
    }

    @Override
    public void ganharLuta() {
        setVitoria(getVitoria() + 1);
    }

    @Override
    public void perderLuta() {
        setVitoria(getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }
}
