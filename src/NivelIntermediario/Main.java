package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        // Criando uma bolsa ninja
        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();

        // Adicionando ferramentas à bolsa
        bolsaNinja.adicionarFerramenta(new Kunai("Kunai Explosiva"));
        bolsaNinja.adicionarFerramenta(new Shuriken("Shuriken de aço", 3));
        bolsaNinja.adicionarFerramenta(new Pergaminho("Invocacao do sapo"));
        bolsaNinja.adicionarFerramenta(new Pergaminho("Invocacao da aguia"));

        // Exibindo os itens da bolsa
        System.out.println("Itens da nossa bolsa Ninja:");
        bolsaNinja.mostrarFerramentas();
    }
}
