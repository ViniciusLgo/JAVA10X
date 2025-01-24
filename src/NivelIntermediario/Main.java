package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        // Criando instâncias de EquipamentosNinja
        EquipamentosNinja kunai = new EquipamentosNinja("Kunai de Ferro");
        EquipamentosNinja shuriken = new EquipamentosNinja("Shuriken de Ferro");
        EquipamentosNinja bomba = new EquipamentosNinja("Bomba de Ferro");

        // Criando uma BolsaGenerica para EquipamentosNinja
        BolsaGenerica<EquipamentosNinja> bolsaGenerica = new BolsaGenerica<>();

        // Adicionando os equipamentos à bolsa
        bolsaGenerica.adicionarEquipamentos(kunai);
        bolsaGenerica.adicionarEquipamentos(shuriken);
        bolsaGenerica.adicionarEquipamentos(bomba);

        // Exibindo o conteúdo da bolsa
        System.out.println(bolsaGenerica);
    }
}
