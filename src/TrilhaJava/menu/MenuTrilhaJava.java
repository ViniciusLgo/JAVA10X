package TrilhaJava.menu;

import NivelAvancado.menu.MenuAvancado;
import NivelFacil.menu.MenuNivelFacil;
import NivelMedio.menu.MenuNivelMedio;

public class MenuTrilhaJava {

    public void executarTudo() {
        imprimirTitulo("JAVA10X - TRILHA COMPLETA DE ESTUDOS");
        imprimirMapa();

        new MenuNivelFacil().executar();
        separarNiveis();

        new MenuNivelMedio().executar();
        separarNiveis();

        new MenuAvancado().executar();
        imprimirEncerramento();
    }

    private void imprimirMapa() {
        System.out.println("Ordem recomendada:");
        System.out.println("1. NivelFacil: base da linguagem e primeiros comandos.");
        System.out.println("2. NivelMedio: POO, interfaces, abstracao, generics, collections e banco.");
        System.out.println("3. NivelAvancado: static, PSVM, Big O, complexidade e Streams.");
        System.out.println();
    }

    private void separarNiveis() {
        System.out.println();
        System.out.println("============================================================");
        System.out.println();
    }

    private void imprimirTitulo(String texto) {
        System.out.println("===== " + texto + " =====");
    }

    private void imprimirEncerramento() {
        System.out.println();
        System.out.println("===== FIM DA TRILHA =====");
        System.out.println("Revisao sugerida: rode um nivel por vez e depois rode a trilha completa.");
    }
}
