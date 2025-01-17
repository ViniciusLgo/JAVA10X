package NivelIntermediario;

public class Uchiha extends Ninja {

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    // Sobreescrever o metodo da classe Ninja
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uchiha, um ataque de fogo. Eu ja completei: " + numeroDeMissoesConcluidas + " missoes." );
    }

}
