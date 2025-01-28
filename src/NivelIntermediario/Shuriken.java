package NivelIntermediario;

public class Shuriken {
    private String descricao;
    private int tamanho;

    public Shuriken(String descricao, int tamanho) {
        this.descricao = descricao;
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Shuriken de tamanho: " + tamanho;
    }
}
