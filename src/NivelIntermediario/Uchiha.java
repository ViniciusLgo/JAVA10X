package NivelIntermediario;

public class Uchiha extends Ninja implements SharinganInterface {

    public Uchiha() {
    }



    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    /*
     * Metodo:
     * Implementa da interface Sharingan
     * */
    public void sharingaAtivado() {
        System.out.println(nome + ": Ativou o Sharingan");
    }

    @Override
    public void sharingAtivado() {
    }




}
