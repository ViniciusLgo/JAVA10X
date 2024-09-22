package NivelFacil.Condicoes;
import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {

        /*
         * SwitchCases: Que servem para gerar casos especificos
         * Objetivo: Pedir pro usuario escolher entre os Ninjas
         * switchCase
         * */

        // Pedir para o usuario
        Scanner scanner = new Scanner(System.in);

        // Mostrar opcoes para o usuario
        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        // Pedir para o usuario escolher uma das opcoes
        int escolhaDoUsuario = scanner.nextInt();

        System.out.println("Voce digitou o numero: " + escolhaDoUsuario);

        // Reacao ao escolher um personagem
        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("O usuario escolheu o Naruto Uzumaki o proximo hokage");
                break;
            case 2:
                System.out.println("O usuario escolheu o Sasuke Uchiha, o ninja mais revoltado");
                break;
            case 3:
                System.out.println("O usuario escolheu a Sakura Haruno, a personagem feminina mais legal");
                break;
            default:
                System.out.println("Voce nao digitou uma resposta valida! Tente denovo");
        }

        // fechar a caixa
        scanner.close();
    }
}