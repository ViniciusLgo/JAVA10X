package NivelIntermediario;

public abstract class ContaBancaria implements Conta {

    String nome;
    String tipoConta;
    double saldo;

    //construtores
    public ContaBancaria() {
    }

    public ContaBancaria(String nome, String tipoConta, double saldo) {
        this.saldo = saldo;
        this.tipoConta = tipoConta;
        this.nome = nome;
    }

    //metodos uteis
    public String verNome() {
        return nome;
    }

    public String verificarSaldo() {
        return "Saldo: " + this.saldo;
    }

    public String verTipoConta() {
        return tipoConta;
    }

}

