package NivelIntermediario;

public class Uzumaki extends Ninja {


    // Sobreescrever o metodo da classe Ninja
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uzumaki, um ataque de ar");
    }

    public void estrategiaDeBatalhaNinja() {
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }



    public void tacarKunai(){
        System.out.println("Tacar Kunai");
    }




}
