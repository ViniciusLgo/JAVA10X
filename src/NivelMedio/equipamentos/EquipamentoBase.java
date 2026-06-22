package NivelMedio.equipamentos;

public abstract class EquipamentoBase implements EquipamentoNinja {

    private final String nome;
    private final TipoEquipamento tipo;

    public EquipamentoBase(String nome, TipoEquipamento tipo) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome do equipamento precisa ser informado.");
        }

        if (tipo == null) {
            throw new IllegalArgumentException("O tipo do equipamento precisa ser informado.");
        }

        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public TipoEquipamento getTipo() {
        return tipo;
    }
}
