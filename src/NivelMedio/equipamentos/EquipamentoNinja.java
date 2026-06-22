package NivelMedio.equipamentos;

public interface EquipamentoNinja {

    // Generics ficam mais seguros quando limitamos quais tipos podem ser usados.
    // Esta interface marca tudo que pode entrar em uma BolsaNinja.
    String getNome();

    TipoEquipamento getTipo();

    default String descrever() {
        return getNome() + " [" + getTipo() + "]";
    }
}
