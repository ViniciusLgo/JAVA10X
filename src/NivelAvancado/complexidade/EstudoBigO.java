package NivelAvancado.complexidade;

import java.util.List;

public class EstudoBigO {

    public void executar() {
        imprimirSecao("4. Analise da complexidade de algoritmos");
        estudarComplexidade();

        imprimirSecao("5. Introducao a Big O");
        estudarBigO();

        imprimirSecao("6. Big O nao e sobre complexidade apenas");
        explicarIdeiaCorretaDeBigO();
    }

    private void estudarComplexidade() {
        List<String> ninjas = List.of("Naruto", "Sasuke", "Sakura", "Kakashi");

        System.out.println("Exemplo O(1): acessar uma posicao direta.");
        System.out.println("Primeiro ninja: " + ninjas.get(0));

        System.out.println("Exemplo O(n): percorrer todos os ninjas.");
        for (String ninja : ninjas) {
            System.out.println("- analisando " + ninja);
        }
    }

    private void estudarBigO() {
        int n = 5;

        System.out.println("O(1): cresce constante. O trabalho nao muda muito quando n aumenta.");
        operacaoConstante(n);

        System.out.println("O(n): cresce junto com a entrada.");
        operacaoLinear(n);

        System.out.println("O(n^2): cresce bem mais rapido porque tem loop dentro de loop.");
        operacaoQuadratica(3);
    }

    private void explicarIdeiaCorretaDeBigO() {
        System.out.println("Big O descreve crescimento.");
        System.out.println("Ele ajuda a comparar algoritmos quando a entrada aumenta.");
        System.out.println("Macete: Big O ignora detalhes pequenos e foca no comportamento dominante.");
        System.out.println("Outro macete: O(n) nao significa lento sempre; O(1) nao significa melhor sempre.");
    }

    private void operacaoConstante(int n) {
        System.out.println("Entrada recebida: " + n + ". Trabalho feito uma vez.");
    }

    private void operacaoLinear(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("Passo linear " + i);
        }
    }

    private void operacaoQuadratica(int n) {
        for (int linha = 1; linha <= n; linha++) {
            for (int coluna = 1; coluna <= n; coluna++) {
                System.out.println("Comparando linha " + linha + " com coluna " + coluna);
            }
        }
    }

    private void imprimirSecao(String titulo) {
        System.out.println();
        System.out.println("----- " + titulo + " -----");
    }
}
