package NivelIntermediario;

public class EquipamentosNinja {

    private String nome; // Nome do equipamento

    // Construtor para inicializar o nome do equipamento
    public EquipamentosNinja(String nome) {
        this.nome = nome;
    }

    // Getter para o nome
    public String getNome() {
        return nome;
    }

    // Setter para o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método que retorna uma descrição do objeto
    @Override
    public String toString() {
        return "Equipamento Ninja: " + nome;
    }
}
