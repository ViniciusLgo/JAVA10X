package NivelMedio.menu;

import NivelMedio.banco.BancoKonoha;
import NivelMedio.banco.Conta;
import NivelMedio.banco.ContaBancaria;
import NivelMedio.banco.ContaCorrente;
import NivelMedio.banco.ContaPoupanca;
import NivelMedio.equipamentos.BolsaNinja;
import NivelMedio.equipamentos.EquipamentoNinja;
import NivelMedio.equipamentos.Kunai;
import NivelMedio.equipamentos.OrganizadorEquipamentos;
import NivelMedio.equipamentos.Pergaminho;
import NivelMedio.equipamentos.RegistroEquipamento;
import NivelMedio.equipamentos.Shuriken;
import NivelMedio.hokages.Senju;
import NivelMedio.ninjas.Boruto;
import NivelMedio.ninjas.Hatake;
import NivelMedio.ninjas.NivelNinja;
import NivelMedio.ninjas.Uchiha;
import NivelMedio.ninjas.Uzumaki;
import java.util.Stack;

public class MenuNivelMedio {

    public void executar() {
        imprimirTitulo("ESTUDO DO NIVEL MEDIO");
        estudarNinjas();
        estudarHokages();
        estudarFerramentas();
        estudarBancoKonoha();
        estudarGenericsComBolsaNinja();
        estudarStackERecord();
        estudarArrayListStack();
    }

    private void estudarNinjas() {
        imprimirSubmenu("1. Heranca, classe abstrata, interface e enum");

        // Refatorado: cada exemplo fica agrupado por assunto para estudar em partes menores.
        Uzumaki naruto = new Uzumaki();
        naruto.preencherFicha("Naruto Uzumaki", "Aldeia da Folha", 16, 30, NivelNinja.GENIN);

        naruto.mostrarFicha();
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        imprimirLinha();

        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 18, 20, NivelNinja.GENIN);
        sasuke.mostrarFicha();
        sasuke.habilidadeEspecial();

        imprimirLinha();

        Uchiha madara = new Uchiha("Madara Uchiha", "Aldeia da Folha", 45, 900, NivelNinja.KAGE);
        madara.habilidadeEspecial();
        madara.estrategiaDeBatalhaNinja();
        madara.inteligenciaDeCombate(170);

        imprimirLinha();

        Hatake kakashi = new Hatake();
        kakashi.preencherFicha("Kakashi Hatake", "Aldeia da Folha", 31, 120, NivelNinja.JOUNIN);
        kakashi.ativarSharingan();
        kakashi.entrarNaAnbu();

        imprimirLinha();

        Boruto boruto = new Boruto();
        boruto.preencherFicha("Boruto Uzumaki", "Aldeia da Folha", 12, 8, NivelNinja.GENIN);
        boruto.habilidadeEspecial();
        boruto.ativarOKarma();
        boruto.ativarJougan();
    }

    private void estudarHokages() {
        imprimirSubmenu("2. Classe abstrata Hokages");

        // Refatorado: Senju mostra como uma classe concreta completa os metodos abstratos.
        Senju hashirama = new Senju("Hashirama Senju", 46, false);
        hashirama.mostrarInformacoes();
        hashirama.sabedoriaHokage();
        hashirama.estrategiaDeBatalhaNinja();
        hashirama.inteligenciaDeCombate(160);
    }

    private void estudarFerramentas() {
        imprimirSubmenu("3. Encapsulamento e toString");

        // Refatorado: objetos simples mostram construtor, getter e representacao em texto.
        Kunai kunai = new Kunai("Kunai de tres pontas");
        Shuriken shuriken = new Shuriken(12);
        Pergaminho pergaminho = new Pergaminho("Contrato de invocacao");

        System.out.println(kunai);
        System.out.println(shuriken);
        System.out.println(pergaminho);
    }

    private void estudarBancoKonoha() {
        imprimirSubmenu("4. Banco Konoha: abstracao, polimorfismo e sobrecarga");

        // Refatorado: usar o tipo da interface prova que ContaCorrente respeita o contrato Conta.
        Conta contaPeloContrato = new ContaCorrente(100);
        contaPeloContrato.depositar(50);
        System.out.println("Saldo pela interface Conta: " + contaPeloContrato.consultarSaldo());

        ContaBancaria contaCorrenteNaruto = new ContaCorrente(500);
        ContaBancaria contaPoupancaHinata = new ContaPoupanca(300);

        contaCorrenteNaruto.depositar(100);
        contaPoupancaHinata.depositar(100);

        imprimirSaldo("Conta do Naruto", contaCorrenteNaruto);
        imprimirSaldo("Conta da Hinata", contaPoupancaHinata);

        BancoKonoha bancoKonoha = new BancoKonoha();
        bancoKonoha.transferir(contaCorrenteNaruto, contaPoupancaHinata, 50);
        bancoKonoha.transferir(
                contaPoupancaHinata,
                contaCorrenteNaruto,
                25,
                "Transferencia personalizada: Hinata enviou para Naruto"
        );

        imprimirSaldo("Saldo final Naruto", contaCorrenteNaruto);
        imprimirSaldo("Saldo final Hinata", contaPoupancaHinata);
    }

    private void estudarGenericsComBolsaNinja() {
        imprimirSubmenu("5. Generics com BolsaNinja");

        // Generics: o tipo entre <> define o que esta bolsa aceita.
        // Aqui T virou Kunai, entao esta bolsa so aceita objetos Kunai.
        BolsaNinja<Kunai> bolsaDeKunais = new BolsaNinja<>("Bolsa de kunais");
        bolsaDeKunais.adicionar(new Kunai("Kunai comum"));
        bolsaDeKunais.adicionar(new Kunai("Kunai explosiva"));

        System.out.println("Bolsa especifica de Kunai:");
        bolsaDeKunais.listarEquipamentos();
        System.out.println("Total de kunais: " + bolsaDeKunais.quantidade());

        // Se voce tentar descomentar a linha abaixo, o Java nao deixa compilar.
        // bolsaDeKunais.adicionar(new Shuriken(12));
        // Motivo: BolsaNinja<Kunai> aceita Kunai, nao Shuriken.

        imprimirLinha();

        // Aqui T virou EquipamentoNinja.
        // Como Kunai, Shuriken e Pergaminho implementam EquipamentoNinja,
        // todos podem entrar na mesma bolsa.
        BolsaNinja<EquipamentoNinja> bolsaMista = new BolsaNinja<>("Bolsa mista");
        bolsaMista.adicionar(new Kunai("Kunai de tres pontas"));
        bolsaMista.adicionar(new Shuriken(12));
        bolsaMista.adicionar(new Pergaminho("Contrato de invocacao"));

        System.out.println("Bolsa mista de equipamentos:");
        bolsaMista.listarEquipamentos();

        imprimirLinha();

        // O retorno tambem respeita o tipo generico.
        // Como bolsaDeKunais e BolsaNinja<Kunai>, pegar(0) retorna uma Kunai.
        Kunai primeiraKunai = bolsaDeKunais.pegar(0);
        System.out.println("Primeira kunai retirada: " + primeiraKunai.getNome());
    }

    private void estudarStackERecord() {
        imprimirSubmenu("6. Stack e record com equipamentos");

        // Stack representa uma pilha: o ultimo item que entra e o primeiro que sai.
        // Pense em uma pilha de pergaminhos: voce coloca por cima e tambem tira por cima.
        Stack<RegistroEquipamento> historico = new Stack<>();

        // Record: RegistroEquipamento guarda dados de forma simples e imutavel.
        // Depois de criar, os campos ninja, equipamento e acao nao mudam.
        RegistroEquipamento primeiraAcao = new RegistroEquipamento(
                "Naruto",
                new Kunai("Kunai comum"),
                "guardou"
        );

        RegistroEquipamento segundaAcao = new RegistroEquipamento(
                "Sasuke",
                new Shuriken(12),
                "preparou"
        );

        RegistroEquipamento terceiraAcao = new RegistroEquipamento(
                "Kakashi",
                new Pergaminho("Tecnica de invocacao"),
                "leu"
        );

        // push adiciona no topo da pilha.
        historico.push(primeiraAcao);
        historico.push(segundaAcao);
        historico.push(terceiraAcao);

        System.out.println("Historico empilhado:");
        listarHistorico(historico);

        imprimirLinha();

        // peek consulta o topo sem remover.
        RegistroEquipamento topo = historico.peek();
        System.out.println("Topo com peek, sem remover: " + topo.resumo());
        System.out.println("Tamanho depois do peek: " + historico.size());

        imprimirLinha();

        // pop remove o topo da pilha.
        RegistroEquipamento removido = historico.pop();
        System.out.println("Removido com pop: " + removido.resumo());
        System.out.println("Tamanho depois do pop: " + historico.size());

        imprimirLinha();
        System.out.println("Historico restante:");
        listarHistorico(historico);
    }

    private void estudarArrayListStack() {
        imprimirSubmenu("7. Array, List e Stack juntos");

        OrganizadorEquipamentos organizador = new OrganizadorEquipamentos();

        // Array: tamanho fixo. Aqui existem exatamente 3 posicoes.
        organizador.guardarNoArray(0, new Kunai("Kunai reserva"));
        organizador.guardarNoArray(1, new Shuriken(8));
        organizador.guardarNoArray(2, new Pergaminho("Mapa da missao"));

        System.out.println("Array de equipamentos fixos:");
        organizador.listarArray();

        imprimirLinha();

        // List: tamanho flexivel. Pode adicionar mais itens sem escolher uma posicao fixa.
        organizador.adicionarNaLista(new Kunai("Kunai flexivel"));
        organizador.adicionarNaLista(new Shuriken(16));
        organizador.adicionarNaLista(new Pergaminho("Lista de selos"));

        System.out.println("List de equipamentos flexiveis:");
        organizador.listarLista();
        System.out.println("Total na List: " + organizador.totalNaLista());

        imprimirLinha();

        // Stack: guarda historico como pilha.
        organizador.registrarUso("Naruto", new Kunai("Kunai reserva"), "pegou");
        organizador.registrarUso("Sasuke", new Shuriken(8), "lancou");

        System.out.println("Stack de historico:");
        organizador.listarHistorico();
        System.out.println("Topo da Stack: " + organizador.verUltimoRegistro().resumo());
        System.out.println("Removido da Stack: " + organizador.removerUltimoRegistro().resumo());
        System.out.println("Total restante na Stack: " + organizador.totalNoHistorico());
    }



    private void listarHistorico(Stack<RegistroEquipamento> historico) {
        for (RegistroEquipamento registro : historico) {
            System.out.println("- " + registro.resumo());
        }
    }

    private void imprimirTitulo(String texto) {
        System.out.println("===== " + texto + " =====");
        System.out.println();
    }

    private void imprimirSubmenu(String texto) {
        System.out.println();
        System.out.println("----- " + texto + " -----");
    }

    private void imprimirLinha() {
        System.out.println();
    }

    private void imprimirSaldo(String rotulo, ContaBancaria conta) {
        System.out.println(rotulo + " | Tipo: " + conta.getTipoConta() + " | Saldo: " + conta.consultarSaldo());
    }

}
