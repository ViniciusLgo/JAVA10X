package NivelIntermediario;

public class Main {
    public static void main(String[] args) {


        System.out.println("------------");

        // Objeto 1
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da folha";
        Naruto.idade = 17;
        Naruto.ModoSabioAtivado();

        System.out.println("------------");

        // Objeto 2
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 18;
        sasuke.missao = "Recuperar o amuleto";
        sasuke.nivelDeDificuldade = "Alta";
        sasuke.statusDaMissao = "Em andamento";
        sasuke.mostrarInformacoes();
        sasuke.SharinganAtivado();


        System.out.println("------------");


        // Objeto 3
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.idade = 18;
        Sakura.AtivarCura();



        System.out.println("------------");

        // Objeto 4
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.aldeia = "Aldeia da folha";
        Hinata.idade = 17;
        Hinata.Byakugan();


        System.out.println("------------");

    }
}
