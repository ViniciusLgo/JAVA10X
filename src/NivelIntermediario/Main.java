
package NivelIntermediario;

import java.util.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // Arrays
        System.out.println("----------- ARRAY ------------");

        String[] nomeNinjaArray = new String[7];
        nomeNinjaArray[0] = "Naruto Uzumaki";
        nomeNinjaArray[1] = "Sasuke Uchiha";
        nomeNinjaArray[2] = "Sakura Haruno";
        nomeNinjaArray[3] = "Hinata Hyuga";
        System.out.println("nomeNinjaArray = " + nomeNinjaArray);
        System.out.println("nomeNinjaArray[0] = " + nomeNinjaArray[4]);

        // Lista é um pouco mais lenta em comparacao com ARRAY
        System.out.println("----------- LISTA ------------");
        List<String> nomeNinjaList = new ArrayList<>();
        nomeNinjaList.add("Naruto Uzumaki");
        nomeNinjaList.add("Sasuke Uchiha");
        nomeNinjaList.add("Sakura Haruno");
        nomeNinjaList.add("Madara Uchiha");
        System.out.println(nomeNinjaList);

        System.out.println("----------- STACK ------------");
        Stack<String> nomeNinjaStack = new Stack<>();
        nomeNinjaStack.push("Naruto Uzumaki");
        nomeNinjaStack.push("Sasuke Uchiha");
        nomeNinjaStack.push("Sakura Haruno");
        System.out.println("Mostrar Stack = " + nomeNinjaStack);
        System.out.println("Tirar da pilha/stack = " + nomeNinjaStack.pop());
        System.out.println("Mostrar Stack = " + nomeNinjaStack);
        System.out.println("Tirar da pilha/stack = " + nomeNinjaStack.pop());
        nomeNinjaStack.push("Kakashi");
        System.out.println("Mostrar Stack = " + nomeNinjaStack);
        System.out.println("Ninja no topo (sem remover): " + nomeNinjaStack.peek());
        System.out.println("Mostrar Stack = " + nomeNinjaStack);


        // ------------------ QUEUE (FILA) ------------------
        System.out.println("----------- QUEUE // FILAS ------------");
        Queue<String> ninjasQueue = new LinkedList<>();

        // Adicionando elementos na fila (Queue)
        ninjasQueue.add("Naruto Uzumaki");
        ninjasQueue.add("Sasuke Uchiha");
        ninjasQueue.add("Sakura Haruno");
        ninjasQueue.add("Hinata Hyuga");

        System.out.println("Mostrar Queue = " + ninjasQueue);
        System.out.println("Ninja no início da fila (sem remover): " + ninjasQueue.peek());

        // Removendo elementos da fila (FIFO - First In, First Out)
        System.out.println("Removendo da fila: " + ninjasQueue.poll());
        System.out.println("Mostrar Queue após remoção = " + ninjasQueue);

        System.out.println("Removendo da fila: " + ninjasQueue.poll());
        System.out.println("Mostrar Queue após remoção = " + ninjasQueue);

        ninjasQueue.add("Madara Uchiha");
        System.out.println("Adicionar Madara à fila: " + ninjasQueue);
        System.out.println("Ninja no início da fila (sem remover): " + ninjasQueue.peek());
        System.out.println("Mostrar Queue final = " + ninjasQueue);

        // Verificar se a fila esta vazia
        if (ninjasQueue.isEmpty()){
            System.out.println("A fila esta vazia");
        }else{
            System.out.println("A fila não esta vazia voce tem esses elementos: " + ninjasQueue);
        }





    }
}
