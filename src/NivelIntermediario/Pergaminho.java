package NivelIntermediario;

public class Pergaminho {
    private String invocacao;

    public Pergaminho(String invocacao) {
        this.invocacao = invocacao;
    }

    @Override
    public String toString() {
        return "Pergaminho: " + invocacao;
    }
}
