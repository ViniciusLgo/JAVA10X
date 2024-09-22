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
        Sasuke.EuSouUmNinja();

        // Criar Sakura Haruno
        Ninja Sakura = new Ninja();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.idade = 18;


         Ninja Gaara =  new Ninja();
         Gaara.nome = "Gaara";
         Gaara.aldeia = "Aldeia da Areia";
         Gaara.idade = 18;

    }
}
