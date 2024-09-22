package NivelIntermediario;

import java.util.ArrayList;
import java.util.Scanner;

public class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDeDificuldade;
    String statusDaMissao;
    String aldeia;

    public void mostrarInformacoes(){
        System.out.println("nome = " + nome);
        System.out.println("idade = " + idade);
        System.out.println("Missao = " + missao);
        System.out.println("Nivel de dificuldade = " + nivelDeDificuldade);
        System.out.println("Status da Missao = " + statusDaMissao);
    }

}
