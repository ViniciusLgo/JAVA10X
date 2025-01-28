package NivelIntermediario;

public class Kunai {
    private String descricao;

    public Kunai(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Kunai: " + descricao;
    }
}
