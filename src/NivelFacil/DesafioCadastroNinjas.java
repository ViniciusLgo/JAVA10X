package NivelFacil;

import java.util.Scanner;

/*
 * DESAFIO 2: Cadastro de Ninjas
 *
 * O usuário vai cadastrar ninjas digitando nome, aldeia e nível.
 * Ao final, o programa lista todos os cadastrados.
 *
 * Conceitos praticados: Scanner, arrays, for, if/else, String.
 */
public class DesafioCadastroNinjas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Definindo o número máximo de ninjas que o usuário pode cadastrar
        int totalDeNinjas = 3;

        // Arrays paralelos: cada índice representa um ninja
        String[] nomes    = new String[totalDeNinjas];
        String[] aldeias  = new String[totalDeNinjas];
        int[]    niveis   = new int[totalDeNinjas];

        System.out.println("===== CADASTRO DE NINJAS =====");

        // Loop para cadastrar cada ninja
        for (int i = 0; i < totalDeNinjas; i++) {
            System.out.println("\nCadastrando ninja " + (i + 1) + " de " + totalDeNinjas + ":");

            System.out.print("Nome do ninja: ");
            nomes[i] = scanner.nextLine();

            System.out.print("Aldeia do ninja: ");
            aldeias[i] = scanner.nextLine();

            System.out.print("Nível do ninja (1 a 10): ");
            niveis[i] = scanner.nextInt();
            scanner.nextLine(); // limpa o buffer do Enter após o nextInt()
        }

        // Listando todos os ninjas cadastrados
        System.out.println("\n===== NINJAS CADASTRADOS =====");
        for (int i = 0; i < totalDeNinjas; i++) {
            System.out.println("\nNinja " + (i + 1) + ":");
            System.out.println("  Nome:   " + nomes[i]);
            System.out.println("  Aldeia: " + aldeias[i]);
            System.out.println("  Nível:  " + niveis[i]);

            // Classificando o ninja pelo nível usando if/else
            if (niveis[i] >= 8) {
                System.out.println("  Rank:   S - Elite da aldeia!");
            } else if (niveis[i] >= 5) {
                System.out.println("  Rank:   A - Ninja experiente.");
            } else {
                System.out.println("  Rank:   B - Ainda em treinamento.");
            }
        }

        System.out.println("\nCadastro concluído! Que a aldeia esteja orgulhosa.");
        scanner.close();
    }
}
