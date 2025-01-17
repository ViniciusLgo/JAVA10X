package NivelIntermediario;

public class Hatake extends Ninja implements SharinganInterface,AnbuInterface,HokageInterface {


    public void boasVindas() {
        System.out.println("Hatake eu sou" + nome);

    }

    @Override
    public void sharingAtivado() {
        System.out.println(nome + " e ativei o Sharingan");
    }


    @Override
    public void ninjaElite() {
        System.out.println(nome + " e eu sou um ninja elite da ANBU");
    }

    @Override
    public void hokageAtivo() {
        System.out.println(nome + " e eu sou um hokage ativo");
    }
}
