package Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        /*
         * Lacos de Repetiçao: Vao repetir infinitamente ou ate voce atingir o parametro desejado
         * WHILE = FOR
         * */

        // While
        // while (condicao) {Tudo aqui vai acontecer}

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

        while (numeroDeClones < numeroMaximoDeClones) {
            numeroDeClones++;
            System.out.println("O Naruto fez um clone das sombras " + numeroDeClones);
        }

        // FOR
        for (int i = 0; i <= numeroMaximoDeClones ; i++) {
            System.out.println("O naruto esta se clonando e ja se clonou " + i);
        }

    }
}
