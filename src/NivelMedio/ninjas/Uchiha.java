package NivelMedio.ninjas;

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

    // Refatorado: sobrescrita deixa claro o comportamento especifico do cla Uchiha.
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome e " + nome + " e esse e meu ataque Uchiha de fogo.");
        System.out.println("Missoes concluidas: " + numeroDeMissoesConcluidas);
    }

    @Override
    public void inteligenciaDeCombate() {
        System.out.println(nome + " usa o Sharingan para prever movimentos. Idade: " + idade);
    }

    @Override
    public void inteligenciaDeCombate(int qi) {
        System.out.println(nome + " calculou uma estrategia Uchiha.");
        super.inteligenciaDeCombate(qi);
    }
}
