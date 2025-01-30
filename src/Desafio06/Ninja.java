package Desafio06;

import java.util.LinkedList;

public class Ninja {

    private String nome;
    private int idade;
    private int nota;


    @Override
    public String toString() {
        return "Ninja" + nome +", idade=" + idade + ", nota=" + nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Ninja() {
    }

    public Ninja(String nome, int idade, int nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }


    /* private String nome;
    private int idade;
    private String aldeia;

    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }*/



}
