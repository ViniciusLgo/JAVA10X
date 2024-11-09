package NivelIntermediario;

// Classe Ninja: Representa um ninja básico com atributos gerais.
public class Ninja implements NinjaInterface {
    String nome;
    int idade;
    String missao;
    String nivelDeDificuldade;
    String statusDaMissao;

    public Ninja() {

    }

    // Construtor para inicializar os atributos de um ninja.
    public Ninja(String nome, int idade, String missao) {
        this.nome = nome;
        this.idade = idade;
        this.missao = missao;
    }

    // Implementação do método mostrarInformations (deve ser sobrescrito nas subclasses).
    @Override
    public void mostrarInformations() {
        // Método vazio (para ser sobrescrito).
    }

    // Implementação do método executarHabilidade (deve ser sobrescrito nas subclasses).
    @Override
    public void executarHabilidade() {
        // Método vazio (para ser sobrescrito).
        System.out.println("MINHA HABILIDADE ESPECIAL.");
    }

    // Método para simular o lançamento de uma shuriken.
    @Override
    public void tacarUmaShuriken() {
        System.out.println("Tacar uma Shuriken.");
    }
}
