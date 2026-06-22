package NivelMedio;

import NivelMedio.menu.MenuNivelMedio;

public class Main {
    public static void main(String[] args) {
        // Main ficou pequeno de proposito: ele apenas inicia o menu de estudos.
        // A organizacao dos exemplos fica em MenuNivelMedio e nos subpacotes.
        new MenuNivelMedio().executar();
    }
}
