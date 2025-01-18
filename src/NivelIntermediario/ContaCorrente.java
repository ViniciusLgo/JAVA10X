package NivelIntermediario;

public class ContaCorrente extends ContaBancaria implements Conta{


    // construtor
    public ContaCorrente(String nome, TipoConta tipoConta, double saldo) {
        super(nome, String.valueOf(tipoConta), saldo);
        tipoConta = TipoConta.CORRENTE;
    }

    // médotos
    public void visualizarContaCorrente() {
        System.out.println("_______________Conta Corrente_______________");
        System.out.println("Nome: " + nome + "\nTipo de conta: " + tipoConta + "\nSaldo: " + saldo);
    }

    public void depositar(double valorDeposito){
        if(valorDeposito > 0){
            saldo += valorDeposito;

            System.out.println("______________Deposito realizado_______________");
            System.out.println("Valor de depositado: " + valorDeposito);
            System.out.println("Deposito efetuado com sucesso!");
        } else {
            System.out.println("Insira um valor válido para deposito");
        }
    }

    public void consultarSaldo(){
        System.out.println("______________Saldo Atualizado_____________");
        System.out.println("Saldo: R$ " + saldo);
    }

}