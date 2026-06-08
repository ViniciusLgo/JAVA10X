package NivelMedio;

// Hyuga herda de Ninja.
// Como não sobrescreve habilidadeEspecial(), usa o comportamento padrão de Ninja.
public class Hyuga extends Ninja {

    public void byakuganAtivado() {
        System.out.println("Meu nome é " + nome + ". O Byakugan ativou, eu sou um Hyuga!");
    }
}
