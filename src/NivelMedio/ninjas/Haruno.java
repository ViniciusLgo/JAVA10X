package NivelMedio.ninjas;

public class Haruno extends Ninja {

    // Refatorado: metodo especifico fica na classe que realmente usa essa habilidade.
    public void ativarCura() {
        System.out.println("Eu sou " + nome + ". Curei meus aliados no campo de batalha.");
    }
}
