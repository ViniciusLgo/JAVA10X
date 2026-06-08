package Academia;

public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Vini", 20, "08547088555", "A", 80.50) {
            @Override
            public void pagar() {
                System.out.println(nome + " pagando mensalidade de R$ " + mensalidade);
            }

            @Override
            public void gerarBoleto() {
                System.out.println("Gerando boleto para " + nome + "...");
            }
        };

        Aluno aluno2 = new Aluno("Ana", 25, "12345678900", "B", 100.00) {
            @Override
            public void pagar() {
                System.out.println(nome + " pagando mensalidade de R$ " + mensalidade);
            }

            @Override
            public void gerarBoleto() {
                System.out.println("Gerando boleto para " + nome + "...");
            }
        };

        Professor professor1 = new Professor("João", 35, "98765432100", "Ritmo Alto", 1500.00) {};

        // Polimorfismo — array base Pessoa, cada objeto chama seu próprio apresentar()
        Pessoa[] membros = { aluno1, aluno2, professor1 };
        System.out.println("=== Apresentação dos membros ===");
        for (Pessoa membro : membros) {
            membro.apresentar();
        }

        System.out.println();

        // Interface Pagante — só acessa o contrato da interface
        Pagante[] pagantes = { aluno1, aluno2 };
        System.out.println("=== Pagamentos ===");
        for (Pagante pagante : pagantes) {
            pagante.pagar();
        }

        System.out.println();

        aluno1.mostrarMensalidade();
        aluno1.treinar();
        aluno1.gerarBoleto();

        System.out.println();

        professor1.ministrarAula();
        professor1.avaliarAluno(aluno1.nome);
        professor1.mostrarSalario();
    }
}
