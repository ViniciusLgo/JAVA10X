package NivelIntermediario;

// Classe abstrata Hokages: Define os atributos e comportamentos comuns dos Hokages.
public abstract class Hokages {
    String nome;
    int idade;
    boolean vivoOuNao;

    // Construtor vazio da classe Hokages.
    public Hokages() {}

    // Construtor com parâmetros para inicializar os atributos da classe.
    public Hokages(String nome, int idade, boolean vivoOuNao) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }
}
