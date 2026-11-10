package NivelAvancado.fundamentos;

public class EstudoJavaEstatico {

    // Variavel estatica: pertence a classe, nao a um objeto especifico.
    // Em aulas, muita gente chama isso de "global", mas em Java o nome correto e campo static.
    private static int totalDeExecucoes = 0;

    private final String nomeDoModulo = "Fundamentos avancados";

    public void executar() {
        totalDeExecucoes++;

        imprimirSecao("1. Tempo de compilacao x tempo de execucao");
        explicarCompilacaoEExecucao();

        imprimirSecao("2. Java sempre foi estatico");
        explicarTipagemEstatica();

        imprimirSecao("3. Escopo static, variaveis globais e PSVM");
        explicarStaticEpsvm();
    }

    private void explicarCompilacaoEExecucao() {
        // Compilacao: javac analisa os arquivos .java e gera .class.
        // Execucao: java/JVM carrega os .class e roda o programa.
        System.out.println("Compilacao: o javac verifica tipos, sintaxe e contratos antes de rodar.");
        System.out.println("Execucao: a JVM executa o bytecode gerado nos arquivos .class.");
        System.out.println("Macete: erro de tipo normalmente aparece na compilacao; erro de regra aparece rodando.");
    }

    private void explicarTipagemEstatica() {
        String ninja = "Naruto";
        int idade = 17;

        // Java e estatico porque o tipo da variavel e conhecido antes da execucao.
        // A linha abaixo nao compilaria:
        // idade = "dezessete";

        System.out.println("String ninja = " + ninja);
        System.out.println("int idade = " + idade);
        System.out.println("Macete: se o compilador ja sabe o tipo, voce ganha seguranca antes de executar.");
    }

    private void explicarStaticEpsvm() {
        System.out.println("Modulo: " + nomeDoModulo);
        System.out.println("Total de execucoes desta classe: " + totalDeExecucoes);

        // public: a JVM consegue acessar.
        // static: a JVM chama sem criar objeto da classe.
        // void: o metodo nao devolve valor.
        // main: nome padrao procurado pela JVM.
        // String[] args: argumentos recebidos pelo terminal.
        System.out.println("PSVM = public static void main(String[] args).");
        System.out.println("Macete: static e compartilhado pela classe; atributo normal pertence ao objeto.");
    }

    private void imprimirSecao(String titulo) {
        System.out.println();
        System.out.println("----- " + titulo + " -----");
    }
}
