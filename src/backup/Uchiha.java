package NivelIntermediario;

// Classe Uchiha: Representa um ninja da família Uchiha, com habilidades especiais como o Sharingan.
public class Uchiha extends Ninja {


    // Construtor da classe Uchiha.
    public Uchiha() {
        super();
    }

    public Uchiha(String nome, int idade, String missao) {
        super(nome, idade, missao);
    }


    // Método para mostrar as informações do Uchiha.
    public void mostrarInformacoes() {
        System.out.println("nome = " + nome);
        System.out.println("idade = " + idade);
        System.out.println("Missao = " + missao);
        System.out.println("Nivel de dificuldade = " + nivelDeDificuldade);
        System.out.println("Status da Missao = " + statusDaMissao);
        System.out.println("habilidade especial Uchiha");
    }

    // Método para ativar o Sharingan.
    public void SharinganAtivado() {
        System.out.println("Meu nome é " + nome + ". O Sharingan Ativou, eu sou um Uchiha!");
    }
}
