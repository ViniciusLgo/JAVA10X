package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------------- Naruto Uzumaki ---------------");

        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da folha", 16, 15, NivelNinja.GENIN,Biju.KURAMA);



        System.out.println("--------------- Sasuke Uchiha ---------------");

        Uchiha sasuke = new Uchiha("Sasuke uchiha", "Aldeia da folha", 18, 20, NivelNinja.GENIN);
        sasuke.habilidadeEspecial();

        System.out.println("--------------- Itachi Uchiha ---------------");

        Uchiha itachi = new Uchiha("Itachi Uchiha", "Aldeia da folha", 27, 60, NivelNinja.JOUNNIN);
        itachi.habilidadeEspecial();
        itachi.metodoProvisorio();

        System.out.println("--------------- Madara Uchiha ---------------");

        Uchiha madara = new Uchiha("Madara Uchiha", "Aldeia da folha", 45,900, NivelNinja.KAGE);
        madara.habilidadeEspecial();
        madara.estrategiaDeBatalhaNinja();
        madara.inteligenciaDeCombate();
        madara.inteligenciaDeCombate(90);

        System.out.println("---------------");






    }
}
