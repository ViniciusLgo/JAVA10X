package NivelIntermediario;

public abstract class Hokages {


    String nome;
    int idade;
    boolean vivoOuNao;


    public Hokages(){
    // Construtor vazio, sem argumentos
    }

    // Construtor com argumentos ( ALL args constructor


    public Hokages(String nome, int idade, boolean vivoOuNao) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }
}
