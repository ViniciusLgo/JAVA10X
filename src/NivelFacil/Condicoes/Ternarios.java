package NivelFacil.Condicoes;

public class Ternarios {
    public static void main(String[] args) {

        /*
         * Ternarios: Sao maneiras de reduzir o codigo
         * variavel = (condição) ? valorSeVerdadeiro : valorSeFalso;
         * */

        short numeroDeMissioes = 1;
        String nivelDoNinja = (numeroDeMissioes >= 10) ? "Esse ninja esta com mais de 10 missoes" : "Esse ninja tem menos de 10 missoes";
        System.out.println(nivelDoNinja);

    }
}
