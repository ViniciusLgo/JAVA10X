package NivelMedio.equipamentos;

public class Shuriken extends EquipamentoBase {
    // Refatorado: final evita alteracao acidental do tamanho depois do construtor.
    private final int tamanho;

    public Shuriken(int tamanho) {
        super("Shuriken tamanho " + tamanho, TipoEquipamento.ARREMESSO);
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        return "Shuriken de tamanho: " + tamanho;
    }
}
