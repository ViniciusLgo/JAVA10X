package Desafio06;

public class Ninja {
    private String nome;
    private int idade;
    private int nota;

    // Construtor
    public Ninja(String nome, int idade, int nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    // Exibição formatada
    @Override
    public String toString() {
        return "Genin: " + nome + " | Idade: " + idade + " | Nota: " + nota;
    }
}
