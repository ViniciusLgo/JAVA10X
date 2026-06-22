package NivelMedio.ninjas;

public class Hyuga extends Ninja {

    // Refatorado: classe filha mantem apenas o comportamento especifico do cla Hyuga.
    public void byakuganAtivado() {
        System.out.println("Meu nome e " + nome + ". O Byakugan foi ativado.");
    }
}
