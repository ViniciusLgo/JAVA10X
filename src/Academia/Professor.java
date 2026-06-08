package Academia;

public abstract class Professor extends Pessoa implements Instrutor {

    protected String especialidade;
    protected Double salario;

    public Professor(String nome, int idade, String cpf, String especialidade, Double salario) {
        super(nome, idade, cpf);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public Professor() {}

    @Override
    public void mostrarCpf() {
        System.out.println("CPF de " + nome + ": " + cpf);
    }

    @Override
    public void apresentar() {
        System.out.println("Olá! Sou o professor " + nome + ", especialidade: " + especialidade);
    }

    @Override
    public void ministrarAula() {
        System.out.println(nome + " está ministrando aula de " + especialidade);
    }

    @Override
    public void avaliarAluno(String nomeAluno) {
        System.out.println(nome + " está avaliando o aluno: " + nomeAluno);
    }

    public void mostrarSalario() {
        System.out.println("Salário de " + nome + ": R$ " + salario);
    }
}
