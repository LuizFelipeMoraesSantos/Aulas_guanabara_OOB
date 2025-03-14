package ufc;

public class Lutador implements Controlador {

    private String nome,nacionalidade,categoria;
    private int idade;
    private double altura,peso;
    private int vitoria,derrotas,empates;

    public Lutador(String nome, String nacionalidade,
                   int idade, double altura, double peso,
                   int vitoria, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.vitoria = vitoria;
        this.derrotas = derrotas;
        this.empates = empates;
    }


    public Lutador(String pretyBoy, String frança,
                   int i, double v,
                   double v1) {
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
        return (float) altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return (float) peso;
    }

    public void setPeso() {
        this.peso = peso;
        this.definirCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(double peso) {
        this.peso = peso;
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
        System.out.println("Lutador: "+getNome());
        System.out.println("é um peso " + getPeso());
        System.out.println("com " + getVitoria()+ " vitorias.");
        System.out.println(getDerrotas() + "  derrotas");
        System.out.println(getEmpates()+"  empates.");
    }

    @Override
    public void ganharLuta() {
        setVitoria(getVitoria() + 1);
    }

    @Override
    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }
    private void definirCategoria() {
        if (peso < 52.2) {
            this.categoria = "Inválido";
        } else if (peso <= 70.3) {
            this.categoria = "Leve";
        } else if (peso <= 83.9) {
            this.categoria = "Médio";
        } else if (peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }
}

