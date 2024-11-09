package NivelIntermediario;

// Classe Boruto: Herda de Uzumaki e implementa a interface HyugaUzumaki, com habilidades específicas.
public class Boruto extends Uzumaki implements HyugaUzumaki {

    // Método que ativa o Karma (habilidade de Uzumaki).
    public void AtivarOKarma() {
        System.out.println("O karma foi ativado! Eu sou Hyuga Uzumaki");
    }

    // Método que ativa o Jougan (habilidade de Hyuga).
    public void AtivarJougan() {
        System.out.println("Jougan! Eu sou Hyuga Uzumaki");
    }

    // Implementação vazia do método mostrarInformations, precisa ser sobrescrito.
    @Override
    public void mostrarInformations() {
        // Método vazio (para ser implementado posteriormente, caso necessário).
    }

    // Implementação vazia do método executarHabilidade, precisa ser sobrescrito.
    @Override
    public void executarHabilidade() {
        // Método vazio (para ser implementado posteriormente, caso necessário).
    }
}
