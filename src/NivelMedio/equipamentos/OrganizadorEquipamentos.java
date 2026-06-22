package NivelMedio.equipamentos;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class OrganizadorEquipamentos {

    // Array: tamanho fixo. Bom quando voce ja sabe quantos espacos existem.
    private final EquipamentoNinja[] equipamentosFixos = new EquipamentoNinja[3];

    // List: tamanho flexivel. Bom quando voce quer adicionar/remover itens livremente.
    private final List<EquipamentoNinja> equipamentosFlexiveis = new ArrayList<>();

    // Stack: pilha. O ultimo item que entra e o primeiro que sai.
    private final Stack<RegistroEquipamento> historicoDeUso = new Stack<>();

    public void guardarNoArray(int posicao, EquipamentoNinja equipamento) {
        equipamentosFixos[posicao] = equipamento;
    }

    public void adicionarNaLista(EquipamentoNinja equipamento) {
        equipamentosFlexiveis.add(equipamento);
    }

    public void registrarUso(String ninja, EquipamentoNinja equipamento, String acao) {
        historicoDeUso.push(new RegistroEquipamento(ninja, equipamento, acao));
    }

    public RegistroEquipamento verUltimoRegistro() {
        return historicoDeUso.peek();
    }

    public RegistroEquipamento removerUltimoRegistro() {
        return historicoDeUso.pop();
    }

    public int totalNaLista() {
        return equipamentosFlexiveis.size();
    }

    public int totalNoHistorico() {
        return historicoDeUso.size();
    }

    public void listarArray() {
        for (int i = 0; i < equipamentosFixos.length; i++) {
            EquipamentoNinja equipamento = equipamentosFixos[i];
            String nome = equipamento == null ? "vazio" : equipamento.descrever();
            System.out.println("Posicao " + i + ": " + nome);
        }
    }

    public void listarLista() {
        for (EquipamentoNinja equipamento : equipamentosFlexiveis) {
            System.out.println("- " + equipamento.descrever());
        }
    }

    public void listarHistorico() {
        for (RegistroEquipamento registro : historicoDeUso) {
            System.out.println("- " + registro.resumo());
        }
    }
}
