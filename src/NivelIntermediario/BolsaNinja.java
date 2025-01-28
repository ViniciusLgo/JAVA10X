package NivelIntermediario;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {

    // Lista de ferramentas (genérica)
    private List<T> ferramentas;

    // Construtor que inicializa a lista
    public BolsaNinja() {
        this.ferramentas = new ArrayList<>();
    }

    // Método para adicionar ferramentas à lista
    public void adicionarFerramenta(T ferramenta) {
        ferramentas.add(ferramenta);
    }

    // Método para exibir todas as ferramentas na bolsa
    public void mostrarFerramentas() {
        System.out.println("Ferramentas na bolsa:");
        for (T ferramenta : ferramentas) {
            System.out.println(ferramenta);
        }
    }


}
