package NivelMedio.equipamentos;

public record RegistroEquipamento(String ninja, EquipamentoNinja equipamento, String acao) {

    // Record e uma forma curta de criar uma classe de dados imutavel.
    // O Java ja cria construtor, getters com nome dos campos, equals, hashCode e toString.
    public RegistroEquipamento {
        if (ninja == null || ninja.isBlank()) {
            throw new IllegalArgumentException("O nome do ninja precisa ser informado.");
        }

        if (equipamento == null) {
            throw new IllegalArgumentException("O equipamento precisa ser informado.");
        }

        if (acao == null || acao.isBlank()) {
            throw new IllegalArgumentException("A acao precisa ser informada.");
        }
    }

    public String resumo() {
        return ninja + " " + acao + " " + equipamento.getNome();
    }
}
