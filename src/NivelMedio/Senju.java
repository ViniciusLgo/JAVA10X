package NivelMedio;

// Senju herda de Hokages (classe abstrata) E implementa EstrategiaDeBatalha (interface).
// Regra do Java: uma classe pode herdar de apenas UMA classe, mas pode implementar
// VÁRIAS interfaces ao mesmo tempo separando por vírgula.
public class Senju extends Hokages implements EstrategiaDeBatalha {

    // Implementação obrigatória dos métodos abstratos herdados de Hokages
    @Override
    public void sabedoriaHokage() {
        System.out.println("Você ganhou a sabedoria de um Senju Hokage!");
    }

    @Override
    public void mostrarInformacoes() {
        // Acessa os atributos "protected" herdados de Hokages
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Vivo ou não: " + vivouOuNao);
    }

    // Implementação obrigatória dos métodos da interface EstrategiaDeBatalha
    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Sou Hokage Senju, essa é minha estratégia de batalha!");
    }

    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Sou Hokage Senju, essa é minha inteligência de combate!");
    }
}
