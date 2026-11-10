package NivelAvancado.streams;

import java.util.List;

public class EstudoStreamsParte1 {

    public void executar() {
        imprimirSecao("7. Streams - melhor feature do Java [Parte 1]");

        List<String> ninjas = List.of("Naruto", "Sasuke", "Sakura", "Kakashi", "Boruto");

        System.out.println("Lista original:");
        ninjas.forEach(System.out::println);

        System.out.println();
        System.out.println("Filtrando nomes que comecam com S:");
        ninjas.stream()
                // filter recebe uma regra e mantem apenas quem passa nessa regra.
                .filter(nome -> nome.startsWith("S"))
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Transformando nomes para maiusculo:");
        ninjas.stream()
                // map transforma cada item em outro valor.
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("Macete: stream nao muda a lista original; ela cria um fluxo de leitura.");
    }

    private void imprimirSecao(String titulo) {
        System.out.println();
        System.out.println("----- " + titulo + " -----");
    }
}
