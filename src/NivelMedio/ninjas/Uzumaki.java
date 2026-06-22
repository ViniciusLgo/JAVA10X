package NivelMedio.ninjas;

import NivelMedio.bijus.Bijus;

public class Uzumaki extends Ninja {

    Bijus bijus;

    // Refatorado: sobrescrita simples para mostrar polimorfismo.
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome e " + nome + " e esse e meu ataque Uzumaki de ar.");
    }


}
