package NivelFacil;

public class ArraysReferencia {

    public static void main(String[] args) {

        /*
         * Dados PRIMITIVOS guardam o VALOR diretamente na memória.
         * Dados NÃO PRIMITIVOS (como arrays e objetos) guardam o ENDEREÇO de memória.
         * Isso significa: duas variáveis podem apontar pro MESMO array na memória!
         */

        // Array de primitivos (int): cada posição guarda o valor diretamente
        int[] chakraDoNaruto = new int[3];
        chakraDoNaruto[0] = 100;
        chakraDoNaruto[1] = 200;
        chakraDoNaruto[2] = 300;

        System.out.println("=== Array de Primitivos ===");
        for (int i = 0; i < chakraDoNaruto.length; i++) {
            System.out.println("Chakra [" + i + "]: " + chakraDoNaruto[i]);
        }

        // Array de referência (String): cada posição guarda um ENDEREÇO de memória
        // que aponta para onde o texto está guardado
        String[] ninjas = new String[4];
        ninjas[0] = "Naruto";
        ninjas[1] = "Sasuke";
        ninjas[2] = "Sakura";
        ninjas[3] = "Kakashi";

        System.out.println("\n=== Array de Referência (String) ===");
        for (int i = 0; i < ninjas.length; i++) {
            System.out.println("Ninja [" + i + "]: " + ninjas[i]);
        }

        // CUIDADO: quando você copia um array de referência,
        // você copia o ENDEREÇO, não os dados!
        String[] copiaDoGrupo = ninjas; // os dois apontam pro MESMO array
        copiaDoGrupo[0] = "Boruto";     // mudou aqui...

        System.out.println("\n=== Referência compartilhada ===");
        // ...mas aparece nos dois, porque é o mesmo array na memória!
        System.out.println("ninjas[0]: " + ninjas[0]);        // Boruto
        System.out.println("copiaDoGrupo[0]: " + copiaDoGrupo[0]); // Boruto

        /*
         * GARBAGE COLLECTOR (Coletor de Lixo):
         * Quando uma variável perde a referência para um objeto
         * (ou seja, não tem mais nenhuma variável apontando pra ele),
         * o Java limpa esse objeto da memória automaticamente.
         * Você não precisa fazer isso manualmente (diferente de C/C++).
         */
        System.out.println("\n=== Garbage Collector ===");

        String[] missaoAntiga = new String[2];
        missaoAntiga[0] = "Missão A";
        missaoAntiga[1] = "Missão B";

        // Ao reatribuir a variável, o array antigo fica "órfão" na memória.
        // O Garbage Collector do Java vai limpar ele automaticamente depois.
        missaoAntiga = new String[2]; // array antigo sera coletado pelo GC
        missaoAntiga[0] = "Missão Nova 1";
        missaoAntiga[1] = "Missão Nova 2";

        System.out.println("Missões atuais: " + missaoAntiga[0] + " e " + missaoAntiga[1]);
        System.out.println("O GC limpou o array antigo automaticamente!");
    }
}
