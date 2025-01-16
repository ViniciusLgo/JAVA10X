package NivelIntermediario;

public class Main {
    public static void main(String[] args) {




        // Obj uzumaki
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da folha";
        naruto.idade = 16;


        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        // Obj uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";

        sasuke.habilidadeEspecial();


        // obj uchiha 2
        Uchiha itachi = new Uchiha("Itachi Uchiha","aldeia da folha",28);
        itachi.estrategiaDeBatalhaNinja();
        itachi.habilidadeEspecial();


    }
}
