package NivelIntermediario;

public class Uchiha extends Ninja {

    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial(){
        System.out.println("Habilidade Especial: " + habilidadeEspecial);
    }

    public void mostrarInformacoes(){
        System.out.println("nome = " + nome);
        System.out.println("idade = " + idade);
        System.out.println("Missao = " + missao);
        System.out.println("Nivel de dificuldade = " + nivelDeDificuldade);
        System.out.println("Status da Missao = " + statusDaMissao);
        System.out.println("habilidade especial uchiha ");
    }



    //Sharingan ativado, metodo publico
    public void SharinganAtivado() {
        System.out.println("Meu nome é " + nome + ". O Sharingan Ativou, eu sou um Uchiha!");
    }
}
