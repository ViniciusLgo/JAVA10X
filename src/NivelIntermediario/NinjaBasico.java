package NivelIntermediario;

public abstract class NinjaBasico  implements NinjaInterface {


    String nome;
    String aldeia;
    int idade;




    @Override
    public void mostrarInformacoes() {

    }

    @Override
    public void executarHabilidades() {

    }

    public abstract void habilidadeEspecial();
}
