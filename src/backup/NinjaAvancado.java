package NivelIntermediario;

// Classe NinjaAvancado: Representa ninjas com habilidades avançadas.
public class NinjaAvancado implements NinjaInterface {
    String nome;
    int idade;
    String habilidade;
    String especialidade;

    // Implementação do método mostrarInformations.
    @Override
    public void mostrarInformations() {
        // Método vazio (para ser sobrescrito).
    }

    // Implementação do método executarHabilidade.
    @Override
    public void executarHabilidade() {
        // Método vazio (para ser sobrescrito).
    }

    // Implementação do método tacarUmaShuriken.
    @Override
    public void tacarUmaShuriken() {
        System.out.println("Tacar uma Shuriken.");
    }
}
