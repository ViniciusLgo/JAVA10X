package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        // Obj ninja nao da pra ser criado


        // Obj uzumaki
        Uzumaki naruto = new Uzumaki() {
            @Override
            public void mostrarInformations() {

            }

            @Override
            public void executarHabilidade() {

            }
        };
        naruto.nome = "Naruto Uzumaki";
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        // Obj uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.habilidadeEspecial();



    }
}
