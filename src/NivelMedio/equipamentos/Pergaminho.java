package NivelMedio.equipamentos;

public record Pergaminho(String conteudo) implements EquipamentoNinja {
    
    public Pergaminho {
        if (conteudo == null || conteudo.isBlank()) {
            throw new IllegalArgumentException("O conteudo do pergaminho precisa ser informado.");
        }
    }
    
    @Override
    public String getNome() {
        return "Pergaminho: " + conteudo;
    }

    @Override
    public TipoEquipamento getTipo() {
        return TipoEquipamento.SUPORTE;
    }

    @Override
    public String toString() {
        return "Pergaminho: " + conteudo;
    }
}
