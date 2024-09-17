package Condicoes;
import java.util.Scanner;



    public class DesafioNinjas_2 {
        public static void main(String[] args) {
            // Dados dos ninjas
            String[] nomes = {"Naruto", "Sasuke", "Sakura"};
            int[] idades = {17, 18, 17};
            String[] missoes = {"Missão 1", "Missão 2", "Missão 3"};
            String[] dificuldades = {"Alta", "Média", "Baixa"};
            String[] status = {"Não iniciada", "Não iniciada", "Não iniciada"};

            Scanner scanner = new Scanner(System.in);
            boolean sair = false;

            while (!sair) {
                // Menu com separador
                System.out.println("\n=================================");
                System.out.println("      Menu de Gerenciamento");
                System.out.println("=================================");
                System.out.println("1. Mostrar todos os ninjas e suas missões");
                System.out.println("2. Atualizar o status de uma missão");
                System.out.println("3. Consultar missões de um ninja específico");
                System.out.println("4. Sair");
                System.out.print("Escolha uma opção: ");

                int opcao = scanner.nextInt();
                scanner.nextLine(); // Consumir a nova linha após o número

                System.out.println("\n=================================");

                switch (opcao) {
                    case 1:
                        mostrarNinjas(nomes, idades, missoes, dificuldades, status);
                        break;

                    case 2:
                        System.out.print("Digite o nome da missão para atualizar o status: ");
                        String missãoParaAtualizar = scanner.nextLine();
                        System.out.print("Digite o novo status da missão: ");
                        String novoStatus = scanner.nextLine();
                        atualizarStatus(missoes, status, missãoParaAtualizar, novoStatus);
                        break;

                    case 3:
                        System.out.print("Digite o nome do ninja para consultar a missão: ");
                        String ninjaParaConsultar = scanner.nextLine();
                        consultarMissao(nomes, missoes, ninjaParaConsultar);
                        break;

                    case 4:
                        sair = true;
                        System.out.println("Saindo do programa...");
                        break;

                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }

                System.out.println("=================================\n");
            }

            scanner.close();
        }

        // Função para exibir informações dos ninjas
        public static void mostrarNinjas(String[] nomes, int[] idades, String[] missoes, String[] dificuldades, String[] status) {
            System.out.println("=================================");
            System.out.println("          Lista de Ninjas");
            System.out.println("=================================");
            for (int i = 0; i < nomes.length; i++) {
                System.out.println("Ninja " + (i + 1) + ":");
                System.out.println("Nome: " + nomes[i]);
                System.out.println("Idade: " + idades[i]);
                System.out.println("Missão: " + missoes[i]);
                System.out.println("Nível de Dificuldade: " + dificuldades[i]);
                System.out.println("Status da Missão: " + status[i]);
                System.out.println("---------------------------------");
            }
            System.out.println("=================================");
        }

        // Função para atualizar o status de uma missão
        public static void atualizarStatus(String[] missoes, String[] status, String missãoParaAtualizar, String novoStatus) {
            boolean encontrado = false;
            for (int i = 0; i < missoes.length; i++) {
                if (missoes[i].equals(missãoParaAtualizar)) {
                    status[i] = novoStatus;
                    System.out.println("Status atualizado com sucesso!");
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("Missão não encontrada.");
            }
        }

        // Função para consultar a missão de um ninja específico
        public static void consultarMissao(String[] nomes, String[] missoes, String ninjaParaConsultar) {
            boolean encontrado = false;
            for (int i = 0; i < nomes.length; i++) {
                if (nomes[i].equals(ninjaParaConsultar)) {
                    System.out.println("Missão de " + nomes[i] + ": " + missoes[i]);
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("Ninja não encontrado.");
            }
        }
    }

