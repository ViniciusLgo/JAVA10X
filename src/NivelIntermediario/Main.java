package NivelIntermediario;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------------- Naruto Uzumaki ---------------");

        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da folha", 16, 15, NivelNinja.GENIN,Biju.KURAMA);
        System.out.println(naruto.getNome());
        naruto.setNome("Narutin da Bahia de KONHA");
        System.out.println(naruto.getNome());


        System.out.println("--------------- Sasuke Uchiha ---------------");

        Uchiha sasuke = new Uchiha("Sasuke uchiha", "Aldeia da folha", 18, 20, NivelNinja.GENIN);

        sasuke.sharingaAtivado();

        System.out.println("--------------- Itachi Uchiha ---------------");

        Uchiha itachi = new Uchiha("Itachi Uchiha", "Aldeia da folha", 27, 60, NivelNinja.JOUNNIN);


        System.out.println("--------------- Madara Uchiha ---------------");

        Uchiha madara = new Uchiha("Madara Uchiha", "Aldeia da folha", 45,900, NivelNinja.KAGE);
        madara.estrategiaDeBatalhaNinja();
        madara.inteligenciaDeCombate();
        madara.inteligenciaDeCombate(90);

        System.out.println("---------------");


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

    }
}
