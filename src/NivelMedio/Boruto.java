package NivelMedio;

// Boruto herda de Uzumaki (pai Naruto = Uzumaki) E implementa HyugaUzumaki (mãe Hinata = Hyuga).
// Isso representa que ele herdou poderes dos DOIS clãs.
// "extends Uzumaki" = herda tudo de Uzumaki (que herdou de Ninja).
// "implements HyugaUzumaki" = precisa implementar os métodos da interface.
public class Boruto extends Uzumaki implements HyugaUzumaki {

    // Implementação obrigatória dos métodos da interface HyugaUzumaki
    @Override
    public void ativarOKarma() {
        System.out.println("O Karma foi ativado! Eu sou um Hyuga Uzumaki!");
    }

    @Override
    public void ativarJougan() {
        System.out.println("Jougan ativado com sucesso! Eu sou um Hyuga Uzumaki!");
    }

    // Boruto também herda modoSabioAtivado() e habilidadeEspecial() de Uzumaki,
    // e todos os atributos (nome, aldeia, idade) de Ninja, sem precisar redeclará-los.
}
