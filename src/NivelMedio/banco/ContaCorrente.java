package NivelMedio.banco;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(double saldoInicial) {
        super(saldoInicial, TipoConta.CORRENTE);
    }

    @Override
    public void depositar(double valor) {
        // Refatorado: conta corrente deposita o valor inteiro, sem taxa.
        validarValorPositivo(valor);
        saldo += valor;
    }
}
