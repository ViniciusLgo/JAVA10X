package NivelFacil.menu;

public class MenuNivelFacil {

    public void executar() {
        imprimirTitulo("NIVEL FACIL - BASE DO JAVA");
        estudarTiposPrimitivos();
        estudarTiposNaoPrimitivos();
        estudarCondicionaisELacos();
        estudarArrays();
        estudarScanner();
    }

    private void estudarTiposPrimitivos() {
        imprimirSecao("1. Tipos primitivos");

        int idade = 17;
        double altura = 1.64;
        char inicial = 'N';
        boolean ninjaAtivo = true;

        System.out.println("int guarda numeros inteiros: " + idade);
        System.out.println("double guarda numeros com casas decimais: " + altura);
        System.out.println("char guarda um caractere: " + inicial);
        System.out.println("boolean guarda verdadeiro ou falso: " + ninjaAtivo);
        System.out.println("Macete: primitivo guarda valor direto, sem metodos de objeto.");
    }

    private void estudarTiposNaoPrimitivos() {
        imprimirSecao("2. Tipos nao primitivos");

        String nome = "Naruto Uzumaki";
        String aldeia = "ALDEIA DA FOLHA";

        System.out.println("String e objeto e tem metodos.");
        System.out.println("Nome em maiusculo: " + nome.toUpperCase());
        System.out.println("Aldeia em minusculo: " + aldeia.toLowerCase());
        System.out.println("Macete: nao primitivos podem ter comportamento, como toUpperCase().");
    }

    private void estudarCondicionaisELacos() {
        imprimirSecao("3. If, else, ternario, switch e lacos");

        int nivel = 8;

        if (nivel >= 8) {
            System.out.println("If/else: ninja de elite.");
        } else {
            System.out.println("If/else: ninja em treinamento.");
        }

        String resultado = nivel >= 8 ? "Ternario: aprovado" : "Ternario: treinar mais";
        System.out.println(resultado);

        switch (nivel) {
            case 10 -> System.out.println("Switch: nivel maximo.");
            case 8, 9 -> System.out.println("Switch: nivel alto.");
            default -> System.out.println("Switch: nivel em evolucao.");
        }

        for (int missao = 1; missao <= 3; missao++) {
            System.out.println("For: missao " + missao + " concluida.");
        }
    }

    private void estudarArrays() {
        imprimirSecao("4. Arrays");

        String[] ninjas = {"Naruto", "Sasuke", "Sakura"};

        for (int i = 0; i < ninjas.length; i++) {
            System.out.println("Posicao " + i + ": " + ninjas[i]);
        }

        System.out.println("Macete: array tem tamanho fixo; List e melhor quando precisa crescer.");
    }

    private void estudarScanner() {
        imprimirSecao("5. Scanner e entrada do usuario");

        System.out.println("Scanner aparece nos exemplos antigos para ler o teclado.");
        System.out.println("Neste menu central eu nao chamo Scanner para nao travar esperando digitacao.");
        System.out.println("Macete: use scanner.nextLine() depois de nextInt() para limpar o Enter.");
    }

    private void imprimirTitulo(String texto) {
        System.out.println("===== " + texto + " =====");
    }

    private void imprimirSecao(String texto) {
        System.out.println();
        System.out.println("----- " + texto + " -----");
    }
}
