package NivelAvancado.menu;

import NivelAvancado.complexidade.EstudoBigO;
import NivelAvancado.fundamentos.EstudoJavaEstatico;
import NivelAvancado.streams.EstudoStreamsParte1;
import NivelAvancado.streams.EstudoStreamsParte2;

public class MenuAvancado {

    public void executar() {
        imprimirTitulo("MODULO AVANCADO - ESTRUTURA, IDEIAS E MACETES");

        new EstudoJavaEstatico().executar();
        new EstudoBigO().executar();
        new EstudoStreamsParte1().executar();
        new EstudoStreamsParte2().executar();
    }

    private void imprimirTitulo(String texto) {
        System.out.println("===== " + texto + " =====");
    }
}
