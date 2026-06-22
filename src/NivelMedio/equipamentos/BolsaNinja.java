package NivelMedio.equipamentos;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T extends EquipamentoNinja> {

    private final String nome;

    // T e um tipo generico.
    // Quando voce criar BolsaNinja<Kunai>, o T vira Kunai.
    // Quando voce criar BolsaNinja<EquipamentoNinja>, o T vira EquipamentoNinja.
    private final List<T> equipamentos = new ArrayList<>();

    public BolsaNinja(String nome) {
        this.nome = nome;
    }

    public void adicionar(T equipamento) {
        equipamentos.add(equipamento);
    }

    public T pegar(int indice) {
        return equipamentos.get(indice);
    }

    public int quantidade() {
        return equipamentos.size();
    }

    public String getNome() {
        return nome;
    }

    public void listarEquipamentos() {
        for (T equipamento : equipamentos) {
            System.out.println("- " + equipamento.descrever());
        }
    }
}
