package NivelMedio.ninjas;

import NivelMedio.contratos.EstrategiaDeBatalha;

public abstract class Ninja implements EstrategiaDeBatalha {

    // Refatorado: atributos comuns ficaram protegidos para as classes filhas acessarem sem duplicar codigo.
    protected String nome;
    protected String aldeia;
    protected int idade;
    protected int numeroDeMissoesConcluidas;
    protected NivelNinja rank;

    public Ninja() {
    }

    // Refatorado: construtor principal mantem os dados basicos de qualquer ninja.
    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    // Refatorado: sobrecarga reaproveita o construtor basico com this(...).
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    public void preencherFicha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        // Remodulado: como o menu agora esta em outro package, ele usa este metodo publico em vez de acessar campos.
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    // Refatorado: comportamento padrao fica na classe mae e pode ser sobrescrito nas filhas.
    public void habilidadeEspecial() {
        System.out.println("Meu nome e " + nome + " e esse e meu ataque especial.");
    }

    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nome e " + nome + ". Essa e minha estrategia de combate.");
    }

    @Override
    public void inteligenciaDeCombate() {
        System.out.println(nome + " esta analisando o campo de batalha.");
    }

    @Override
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150) {
            System.out.println("QI de genio: " + qi);
        } else if (qi>=130) {
            System.out.println("QI promissor: " + qi);
        } else if (qi>=90) {
            System.out.println("QI comum, precisa treinar mais: " + qi);
        } else {
            System.out.println("QI baixo para combate estrategico: " + qi);
        }
    }

    public void mostrarFicha() {
        System.out.println("Nome: " + nome);
        System.out.println("Aldeia: " + aldeia);
        System.out.println("Idade: " + idade);
        System.out.println("Missoes concluidas: " + numeroDeMissoesConcluidas);
        System.out.println("Rank: " + rank);
    }

}
