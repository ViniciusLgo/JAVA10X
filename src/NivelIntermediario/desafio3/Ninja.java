package NivelIntermediario.desafio3;

public class Ninja {

    String nome;
    int idade;
    String missao;
    String nivelDeDificuldade;
    String statusDaMissao;

    public void mostrarInformacoes() {
        System.out.println("nome = " + nome);
        System.out.println("Nivel de dificuldade = " + nivelDeDificuldade);
        System.out.println("Status da Missao = " + statusDaMissao);
        System.out.println("Missao = " + missao);
        System.out.println("idade = " + idade);
    }

}
