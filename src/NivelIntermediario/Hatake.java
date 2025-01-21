package NivelIntermediario;

public class Hatake extends Ninja implements SharinganInterface,AnbuInterface,HokageInterface {


    public void boasVindas() {
        System.out.println("Hatake eu sou" + getNome());

    }

    @Override
    public void sharingAtivado() {
        System.out.println(getNome() + " e ativei o Sharingan");
    }


    @Override
    public void ninjaElite() {
        System.out.println(getNome() + " e eu sou um ninja elite da ANBU");
    }

    @Override
    public void hokageAtivo() {
        System.out.println(getNome() + " e eu sou um hokage ativo");
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

    @Override
    public void habilidadeEspecial() {

    }
}
