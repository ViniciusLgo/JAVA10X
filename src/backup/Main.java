package NivelIntermediario;

// Classe Main: Contém o método main para criar instâncias dos ninjas Uzumaki e Uchiha.
public class Main {
    public static void main(String[] args) {
        // Criando uma instância de Naruto Uzumaki.

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 16;

        // Criando uma instância de Sasuke Uchiha.
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 16;

        // Criando uma instância de Itachiu Uchiha.
        Uchiha itachi = new Uchiha("Itachi Uchiha",16,"cata jambo");
        itachi.executarHabilidade();

    }
}
