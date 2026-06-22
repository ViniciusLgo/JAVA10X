package NivelMedio.ninjas;

import NivelMedio.contratos.AnbuInterface;
import NivelMedio.contratos.SharinganInterface;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface {

    // Refatorado: interfaces diferentes representam habilidades diferentes.
    @Override
    public void ativarSharingan() {
        System.out.println(nome + " ativou o Sharingan copiado.");
    }

    @Override
    public void entrarNaAnbu() {
        System.out.println(nome + " entrou na ANBU como ninja de elite.");
    }
}
