package NivelIntermediario;

public abstract class Ninja implements EstrategiaDeBatalha {

    // How to-do: ARRAY E LIST
    /*

    // TIPO DO ARRAY[] O NOME DO ARRAY E NEW TIPO[QUANT DE OBJETOS];

        String[] ninjasArray = new String[5];
        ninjasArray[0] = "Aldeia da folha";
        ninjasArray[1] = "Aldeia da folha";
        ninjasArray[2] = "Aldeia da folha";
        ninjasArray[3] = "Aldeia da folha";
        ninjasArray[4] = "Aldeia da folha";

        for (int i = 0; i < ninjasArray.length; i++) {
            System.out.println(ninjasArray[i]);
        }

        //LISTAS NAO SAO ESTATICAS
        //List<tipo da lista> nome da lista = new Arraylist<>();
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("naruto usumaki");
        ninjasList.add("Sasuke ");
        ninjasList.add("Madara usumaki");
        ninjasList.add(itachi.getNome());

        System.out.println(ninjasList);
        ninjasList.remove("Sasuke ");
        System.out.println(ninjasList);


     */

    //TODO: Incluir novos 2 atributos: numeroDeMissoesConcluidas , Rank
    // TODO: Rank: Gennin, Chunnin, Jounnin, Hokage

    private String nome;
    private String aldeia;
    private int idade;
    private int numeroDeMissoesConcluidas;
    private NivelNinja rank;


    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }


    public Ninja(String nome, String aldeia, int idade) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumeroDeMissoesConcluidas() {
        return numeroDeMissoesConcluidas;
    }

    public void setNumeroDeMissoesConcluidas(int numeroDeMissoesConcluidas) {
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
    }

    public NivelNinja getRank() {
        return rank;
    }

    public void setRank(NivelNinja rank) {
        this.rank = rank;
    }

    public abstract void habilidadeEspecial();
}
