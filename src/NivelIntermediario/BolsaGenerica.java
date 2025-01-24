package NivelIntermediario;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica<T> {

    private List<T> equipamentos;

    public BolsaGenerica() {
        this.equipamentos = new ArrayList<>();
    }

    // Método para adicionar equipamentos genéricos
    public void adicionarEquipamentos(T equipamentoGenerico) {
        equipamentos.add(equipamentoGenerico);
    }

    // Getter para os equipamentos
    public List<T> getEquipamentos() {
        return equipamentos;
    }

    // Setter para os equipamentos
    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    @Override
    public String toString() {
        return "Bolsa de equipamentos: " + equipamentos.toString();
    }
}
