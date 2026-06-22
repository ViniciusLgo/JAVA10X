package NivelMedio.equipamentos;

public class Kunai extends EquipamentoBase {
    
    public Kunai(String nome) {
        super(nome, TipoEquipamento.ARMA);
    }

    @Override
    public String toString() {
        return "Kunai: " + getNome();
    }
}
