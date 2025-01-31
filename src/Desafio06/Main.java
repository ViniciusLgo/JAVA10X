package Desafio06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ninja> genins = new ArrayList<>();

        // Adicionando Genins à lista
        genins.add(new Ninja("Naruto", 25, 55));
        genins.add(new Ninja("Sasuke", 26, 50));
        genins.add(new Ninja("Sakura", 25, 45));
        genins.add(new Ninja("Kakashi", 35, 60));
        genins.add(new Ninja("Itachi", 27, 58));
        genins.add(new Ninja("Gaara", 24, 52));

        // Exibir todos os Genins cadastrados
        System.out.println("-------- Lista de Genins -------");
        for (Ninja genin : genins) {
            System.out.println(genin);
        }

        // Encontrar e exibir o Genin com a melhor nota
        Ninja melhorGenin = encontrarMelhorGenin(genins);
        System.out.println("\nO Genin com a melhor nota é: " + melhorGenin);

        // Remover um Genin pelo nome
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite o nome do Genin que deseja remover: ");
        String nomeParaRemover = scanner.nextLine();

        boolean removido = removerGenin(genins, nomeParaRemover);
        if (removido) {
            System.out.println("\nGenin removido com sucesso!");
        } else {
            System.out.println("\nGenin não encontrado.");
        }

        // Exibir a lista após a remoção
        System.out.println("\n-------- Lista de Genins Atualizada -------");
        for (Ninja genin : genins) {
            System.out.println(genin);
        }

        scanner.close();
    }

    // Método para encontrar o Genin com a melhor nota
    public static Ninja encontrarMelhorGenin(ArrayList<Ninja> lista) {
        Ninja melhor = lista.get(0); // Assume que o primeiro Genin tem a melhor nota inicialmente

        for (Ninja genin : lista) {
            if (genin.getNota() > melhor.getNota()) {
                melhor = genin; // Atualiza se encontrar um Genin com nota maior
            }
        }
        return melhor;
    }

    // Método para remover um Genin pelo nome
    public static boolean removerGenin(ArrayList<Ninja> lista, String nome) {
        Iterator<Ninja> iterator = lista.iterator();
        while (iterator.hasNext()) {
            Ninja genin = iterator.next();
            if (genin.getNome().equalsIgnoreCase(nome)) {
                iterator.remove();
                return true; // Retorna true se encontrou e removeu o Genin
            }
        }
        return false; // Retorna false se o Genin não foi encontrado
    }
}


/*
Descrição:Crie um sistema para armazenar e gerenciar genins em uma ArrayList.
 Cada genin tem um nome, idade e nota na academia ninja. O sistema deverá:

Adicionar 5 genins à lista.

Exibir todos os genins cadastrados.

Encontrar e exibir o genin com a melhor nota.

Remover um genin pelo nome.
*/
