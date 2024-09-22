package NivelIntermediario;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

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


        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Hyuga Uzumaki";
        Boruto.aldeia = "Aldeia da folha";
        Boruto.idade = 9;

        Boruto.ModoSabioAtivado();
        Boruto.AtivarJougan();
        Boruto.AtivarOKarma();



        System.out.println("------------");



        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.habilidadeEspecial();

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.habilidadeEspecial();


        Hokages Tobirama = new Hokages("tobirama",45,false);
        System.out.println(Tobirama.nome);

        Hokages Hiruzen = new Hokages("Hiruzen",45,true);
        System.out.println(Hiruzen.idade);


        Missoes missao1 = new Missoes("Resgatar cachorro", RankDeMissoes.D);
        missao1.exibirDetalhes();

        Missoes missao2 = new Missoes("Derrotar Zabuza", RankDeMissoes.A);
        missao2.exibirDetalhes();





    }
}
