package NivelAvancado.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EstudoStreamsParte2 {

    public void executar() {
        imprimirSecao("8. Streams - melhor feature do Java [Parte 2]");

        List<NinjaAvancado> ninjas = List.of(
                new NinjaAvancado("Naruto", 17, 90),
                new NinjaAvancado("Sasuke", 17, 95),
                new NinjaAvancado("Sakura", 17, 88),
                new NinjaAvancado("Kakashi", 31, 99)
        );

        listarNomesDosMaisFortes(ninjas);
        somarPoder(ninjas);
        ordenarPorPoder(ninjas);
    }

    private void listarNomesDosMaisFortes(List<NinjaAvancado> ninjas) {
        System.out.println("Ninjas com poder acima de 90:");

        List<String> nomes = ninjas.stream()
                .filter(ninja -> ninja.poder() > 90)
                .map(NinjaAvancado::nome)
                .collect(Collectors.toList());

        System.out.println(nomes);
        System.out.println("Macete: filter filtra, map transforma, collect junta o resultado.");
    }

    private void somarPoder(List<NinjaAvancado> ninjas) {
        int poderTotal = ninjas.stream()
                .mapToInt(NinjaAvancado::poder)
                .sum();

        System.out.println("Poder total do time: " + poderTotal);
    }

    private void ordenarPorPoder(List<NinjaAvancado> ninjas) {
        System.out.println("Ranking por poder:");

        ninjas.stream()
                .sorted(Comparator.comparingInt(NinjaAvancado::poder).reversed())
                .forEach(ninja -> System.out.println(ninja.nome() + " - " + ninja.poder()));
    }

    private void imprimirSecao(String titulo) {
        System.out.println();
        System.out.println("----- " + titulo + " -----");
    }
}
