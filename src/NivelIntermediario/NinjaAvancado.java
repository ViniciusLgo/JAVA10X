package NivelIntermediario;

public class NinjaAvancado extends  NinjaBasico  implements NinjaInterface {



    public void especialidade(){
        System.out.println("Meu nome é " + nome + " jutsu clone das sombras");

    }


    @Override
    public void mostrarInformacoes() {
        System.out.println(" mostrar informações");

    }

    @Override
    public void executarHabilidades() {
        System.out.println("executar habilidades");

    }

    @Override
    public void habilidadeEspecial() {

    }
}
