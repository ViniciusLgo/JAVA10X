package NivelIntermediario;

public class Ninja {

    String nome;
    String aldeia;
    int idade;

    // Criar metodo public Personalizado
    public void SharinganAtivado(){
        System.out.println("Sharingan Ativado");
    }

    // Metodo String retorna String ( " " )
    public String EuSouUmNinja() {
        return "oi eu sou um ninja";
    }


    // Metodo Int retorna Int


    public int anosParaSeTornarHokage(int idadeMiniParaSerHokage) {
        return idadeMiniParaSerHokage - idade ;
    }
}
