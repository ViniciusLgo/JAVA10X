package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        // Criar o ninja Naruto - Naruto é um OBJETO
        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da folha";
        Naruto.idade = 17;

        // Criar ninja Sasuke Uchiha - Sasuke é um OBJETO
        Ninja Sasuke = new Ninja();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.idade = 18;

        //metodo void nao retorna valor nenhum
        //Aplicanto metodos aos meus objetos
        Sasuke.SharinganAtivado();
        String chamandoMetodo = Sasuke.EuSouUmNinja();
        System.out.println(chamandoMetodo);


        int quantoTempoFalta = Sasuke.anosParaSeTornarHokage(70);
        System.out.println("faltam " + quantoTempoFalta + " anos para se tornar um hokage");

        // Criar Sakura Haruno
        Ninja Sakura = new Ninja();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.idade = 18;



    }
}
