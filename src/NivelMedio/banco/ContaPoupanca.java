package NivelMedio.banco;

public class ContaPoupanca extends ContaBancaria {

    // Refatorado: constante nomeada explica a regra da poupanca.
    private static final double TAXA_DEPOSITO = 0.01;

    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial, TipoConta.POUPANCA);
    }

    @Override
    public void depositar(double valor) {
        validarValorPositivo(valor);

        // A poupanca cobra 1% no deposito neste exercicio.
        double taxa = valor * TAXA_DEPOSITO;
        saldo += valor - taxa;
    }
}
