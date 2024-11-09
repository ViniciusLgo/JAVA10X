package NivelIntermediario;

// Enum RankDeMissoes: Define os diferentes ranks de missão.
public enum RankDeMissoes {
    D("Baixo", 2),
    C("Moderado", 3),
    B("Confortável", 4),
    A("Difícil", 5),
    S("Altíssimo", 12);

    private String descricao;
    private int dificuldade;

    // Construtor do enum para inicializar descrição e dificuldade.
    RankDeMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    // Métodos para obter a descrição e a dificuldade de cada rank.
    public String getDescricao() {
        return descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }
}
