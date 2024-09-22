
package NivelIntermediario;

public class Ninja implements INinja{

    String nome;
    int idade;
    String missao;
    String nivelDeDificuldade;
    String statusDaMissao;
    String aldeia;

    public void mostrarInformacoes() {
        System.out.println("nome = " + nome);
        System.out.println("idade = " + idade);
        System.out.println("Missao = " + missao);
        System.out.println("Nivel de dificuldade = " + nivelDeDificuldade);
        System.out.println("Status da Missao = " + statusDaMissao);
    }

    //metodo geral todos os ninjas vao ter
    public void habilidadeEspecial() {
        System.out.println("meu nome e " + nome + " e esse e meu ataque especial");

    }


    @Override
    public void mostrarInformations() {

    }

    @Override
    public void executarHabilidade() {

    }
}



