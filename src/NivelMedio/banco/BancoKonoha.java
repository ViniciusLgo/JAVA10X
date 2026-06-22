package NivelMedio.banco;

public class BancoKonoha {

    // Refatorado: sobrecarga mantem uma versao simples e outra completa.
    public void transferir(ContaBancaria contaOrigem, ContaBancaria contaDestino, double valor) {
        transferir(contaOrigem, contaDestino, valor, "Transferencia comum");
    }

    public void transferir(ContaBancaria contaOrigem, ContaBancaria contaDestino, double valor, String descricao) {
        if (!transferenciaValida(contaOrigem, valor)) {
            return;
        }

        // Refatorado: a regra da transferencia fica em uma sequencia clara: sacar, depositar, relatar.
        contaOrigem.sacar(valor);
        contaDestino.depositar(valor);

        imprimirResumoTransferencia(contaOrigem, contaDestino, descricao);
    }

    private boolean transferenciaValida(ContaBancaria contaOrigem, double valor) {
        if (valor <= 0) {
            System.out.println("A transferencia precisa ter valor maior que zero.");
            return false;
        }

        if (contaOrigem.consultarSaldo() < valor) {
            System.out.println("Transferencia cancelada por saldo insuficiente.");
            return false;
        }

        return true;
    }

    private void imprimirResumoTransferencia(
            ContaBancaria contaOrigem,
            ContaBancaria contaDestino,
            String descricao
    ) {
        System.out.println(descricao);
        imprimirSaldo("Origem", contaOrigem);
        imprimirSaldo("Destino", contaDestino);
    }

    private void imprimirSaldo(String papel, ContaBancaria conta) {
        System.out.println(papel + ": " + conta.getTipoConta() + " | Saldo: " + conta.consultarSaldo());
    }
}
