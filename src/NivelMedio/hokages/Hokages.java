package NivelMedio.hokages;

public abstract class Hokages {

    // Refatorado: classe abstrata guarda apenas estado e contratos comuns dos Hokages.
    protected String nome;
    protected int idade;
    protected boolean vivoOuNao;

    public Hokages() {
    }

    public Hokages(String nome, int idade, boolean vivoOuNao) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }

    // Refatorado: metodos abstratos obrigam cada Hokage concreto a explicar seu comportamento.
    public abstract void mostrarInformacoes();

    public abstract void sabedoriaHokage();
}
