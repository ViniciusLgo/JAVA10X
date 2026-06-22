package NivelMedio.banco;

public interface Conta {

    // Refatorado: interface pequena define somente o contrato minimo de uma conta.
    double consultarSaldo();

    void depositar(double valor);
}
