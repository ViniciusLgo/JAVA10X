package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        ContaCorrente contaTeste = new ContaCorrente("João", TipoConta.CORRENTE, 100.00);
        contaTeste.visualizarContaCorrente();
        contaTeste.consultarSaldo();
        contaTeste.depositar(100.00);
        contaTeste.consultarSaldo();

        ContaPoupanca contaTeste2 = new ContaPoupanca("Leonardo", TipoConta.POUPANCA, 100.00);
        contaTeste2.verContaPoupanca();
        contaTeste2.consultarSaldo();
        contaTeste2.depositar(100);
        contaTeste2.consultarSaldo();


    }
}