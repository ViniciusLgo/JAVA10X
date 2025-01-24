package NivelIntermediario;

public class Uchiha extends Ninja implements SharinganInterface {

    public Uchiha() {
    }


    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    @Override
    public void habilidadeEspecial() {

    }

    /*
     * Metodo:
     * Implementa da interface Sharingan
     * */
    public void sharingaAtivado() {
        System.out.println(getNome() + ": Ativou o Sharingan");
    }

    @Override
    public void sharingAtivado() {
    }


    @Override
    public void estrategiaDeBatalhaNinja() {

    }

    @Override
    public void inteligenciaDeCombate() {

    }

    @Override
    public void inteligenciaDeCombate(int qi) {

    }
}
