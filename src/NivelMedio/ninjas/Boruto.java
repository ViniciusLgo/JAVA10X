package NivelMedio.ninjas;

import NivelMedio.contratos.HyugaUzumaki;

public class Boruto extends Uzumaki implements HyugaUzumaki {

    // Refatorado: extends reaproveita comportamento de Uzumaki e implements adiciona contrato HyugaUzumaki.
    @Override
    public void ativarOKarma() {
        System.out.println("O Karma foi ativado. Boruto combina poderes Uzumaki e Hyuga.");
    }

    @Override
    public void ativarJougan() {
        System.out.println("Jougan ativado com sucesso.");
    }
}
