package Academia;

public abstract class Aluno extends Pessoa implements Pagante {

    protected String graduacao;
    protected Double mensalidade;

    public Aluno(String nome, int idade, String cpf, String graduacao, Double mensalidade) {
        super(nome, idade, cpf);
        this.graduacao = graduacao;
        this.mensalidade = mensalidade;
    }

    public Aluno() {}

    @Override
    public void mostrarCpf() {
        System.out.println("CPF de " + nome + ": " + cpf);
    }

    @Override
    public void apresentar() {
        System.out.println("Olá! Sou o aluno " + nome + ", graduação " + graduacao);
    }

    public void treinar() {
        System.out.println(nome + " está treinando. Graduação atual: " + graduacao);
    }

    public void mostrarMensalidade() {
        System.out.println("Mensalidade de " + nome + ": R$ " + mensalidade);
    }
}
