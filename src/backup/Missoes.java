package NivelIntermediario;

// Classe Missoes: Representa uma missão que pode ser associada a um ninja.
public class Missoes {
    private String nome;
    private RankDeMissoes rank;

    // Método para exibir os detalhes da missão.
    public void exibirDetalhes() {
        System.out.println("Missão: " + nome + " - Rank: " + rank + " (Descrição: " + rank.getDescricao() + ", Dificuldade: " + rank.getDificuldade() + ")");
    }

    // Construtor para inicializar os valores de nome e rank.
    public Missoes(String nome, RankDeMissoes rank) {
        this.nome = nome;
        this.rank = rank;
    }

    // Getters e Setters.
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RankDeMissoes getRank() {
        return rank;
    }

    public void setRank(RankDeMissoes rank) {
        this.rank = rank;
    }
}
