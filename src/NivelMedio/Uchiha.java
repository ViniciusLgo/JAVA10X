package NivelMedio;

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

    @Override
    public void inteligenciaDeCombate(){
        System.out.println("meu nome é " + nome + " " + idade);

    };

    @Override
    void inteligenciaDeCombate(int qi){
        if (qi>150){
            System.out.println("seu qi é de genio "+ qi);
        } else if (qi>=130) {
            System.out.println("seu qi <UNK> de promissor "+ qi);
        } else if (qi>=90) {
            System.out.println("vai estudar teu qi é  "+ qi);
        }
    };
}
