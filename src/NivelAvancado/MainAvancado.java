package NivelAvancado;

import NivelAvancado.menu.MenuAvancado;

public class MainAvancado {

    public static void main(String[] args) {
        // PSVM significa public static void main.
        // Esse metodo e o ponto de entrada: a JVM procura ele para iniciar o programa.
        new MenuAvancado().executar();
    }
}
