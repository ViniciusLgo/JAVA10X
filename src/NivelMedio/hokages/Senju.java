package NivelMedio.hokages;

import NivelMedio.contratos.EstrategiaDeBatalha;

public class Senju extends Hokages implements EstrategiaDeBatalha {

    public Senju() {
        super();
    }

    public Senju(String nome, int idade, boolean vivoOuNao) {
        super(nome, idade, vivoOuNao);
    }

    // Refatorado: implementacao obrigatoria do metodo abstrato herdado de Hokages.
    @Override
    public void sabedoriaHokage() {
        System.out.println("Voce ganhou a sabedoria de um Senju Hokage.");
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Vivo: " + vivoOuNao);
    }

    // Refatorado: Senju implementa o mesmo contrato de combate usado por Ninja.
    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Sou Hokage Senju. Minha estrategia usa defesa e lideranca.");
    }

    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Sou Hokage Senju. Minha inteligencia de combate vem da experiencia.");
    }

    @Override
    public void inteligenciaDeCombate(int qi) {
        System.out.println("QI estrategico Senju: " + qi);
    }
}
