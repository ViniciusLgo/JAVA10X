package NivelMedio.banco;

public abstract class ContaBancaria implements Conta {

    // Refatorado: saldo fica protegido para as filhas aplicarem suas regras de deposito.
    protected double saldo;
    private final TipoConta tipoConta;

    public ContaBancaria(double saldoInicial, TipoConta tipoConta) {
        validarValorNaoNegativo(saldoInicial);
        this.saldo = saldoInicial;
        this.tipoConta = tipoConta;
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void sacar(double valor) {
        validarValorPositivo(valor);

        if (valor > saldo) {
            System.out.println("Saldo insuficiente para sacar: " + valor);
            return;
        }

        saldo -= valor;
    }

    // Refatorado: validacoes comuns ficam na classe mae para evitar repeticao.
    protected void validarValorPositivo(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor precisa ser maior que zero.");
        }
    }

    private void validarValorNaoNegativo(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("O saldo inicial nao pode ser negativo.");
        }
    }

    @Override
    public abstract void depositar(double valor);
}
