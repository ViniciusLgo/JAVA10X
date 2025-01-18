package NivelIntermediario;

public class ContaPoupanca extends ContaBancaria{

    double taxaAdministrativa = 1.0;

    // construtor
    public ContaPoupanca (String nome, TipoConta tipoConta, double saldo) {
        super(nome, String.valueOf(tipoConta), saldo);
    }

    //metodos
    public void verContaPoupanca() {
        System.out.println("_______________Conta Poupanca_______________");
        System.out.println("Nome: " + nome + "\nTipo de conta: " + tipoConta + "\nValor aplicado na poupanca: R$" + this.saldo);
    }

    @Override
    public void depositar(double valorDeposito){
        double valorDepositado;

        if(valorDeposito > 0){
            valorDepositado = valorDeposito-((valorDeposito * taxaAdministrativa)/100);
            saldo += valorDepositado;

            System.out.println("______________Deposito realizado_______________");
            System.out.println("Os valores depositados tem uma taxa administrativa de: "+ taxaAdministrativa + "%" + "\nValor liquido depositado: " + valorDepositado);
            System.out.println("Deposito efetuado com sucesso!");
        } else {
            System.out.println("Insira um valor válido para deposito");
        }

    }

    @Override
    public void consultarSaldo(){
        System.out.println("______________Saldo Atualizado_____________");
        System.out.println("Saldo: R$ " + saldo);
    }
}