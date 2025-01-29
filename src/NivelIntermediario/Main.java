package NivelIntermediario;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // ------------------ ARRAY ------------------
        System.out.println("----------- ARRAY ------------");

        String[] nomeNinjaArray = new String[7];
        nomeNinjaArray[0] = "Naruto Uzumaki";
        nomeNinjaArray[1] = "Sasuke Uchiha";
        nomeNinjaArray[2] = "Sakura Haruno";
        nomeNinjaArray[3] = "Hinata Hyuga";
        System.out.println("nomeNinjaArray = " + Arrays.toString(nomeNinjaArray));
        System.out.println("nomeNinjaArray[4] = " + (nomeNinjaArray[4] == null ? "Vazio" : nomeNinjaArray[4]));

        // ------------------ LISTA (ARRAYLIST) ------------------
        System.out.println("----------- LISTA ------------");
        List<String> nomeNinjaList = new ArrayList<>();
        nomeNinjaList.add("Naruto Uzumaki");
        nomeNinjaList.add("Sasuke Uchiha");
        nomeNinjaList.add("Sakura Haruno");
        nomeNinjaList.add("Madara Uchiha");
        System.out.println("ArrayList = " + nomeNinjaList);

        // ------------------ STACK (PILHA) ------------------
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
        System.out.println("Mostrar Stack final = " + nomeNinjaStack);

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
        if (ninjasQueue.isEmpty()) {
            System.out.println("A fila está vazia");
        } else {
            System.out.println("A fila não está vazia, você tem esses elementos: " + ninjasQueue);
        }

        // ------------------ LINKEDLIST ------------------
        System.out.println("----------- LINKEDLIST ------------");
        LinkedList<String> ninjasLinkedList = new LinkedList<>();

        // Adicionando elementos na LinkedList
        ninjasLinkedList.add("Naruto Uzumaki");
        ninjasLinkedList.add("Sasuke Uchiha");
        ninjasLinkedList.add("Sakura Haruno");
        ninjasLinkedList.add("Hinata Hyuga");

        System.out.println("Mostrar LinkedList = " + ninjasLinkedList);
        System.out.println("Primeiro ninja da LinkedList: " + ninjasLinkedList.getFirst());
        System.out.println("Último ninja da LinkedList: " + ninjasLinkedList.getLast());

        // Removendo elementos da LinkedList
        System.out.println("Removendo primeiro ninja: " + ninjasLinkedList.removeFirst());
        System.out.println("Mostrar LinkedList após remoção = " + ninjasLinkedList);

        System.out.println("Removendo último ninja: " + ninjasLinkedList.removeLast());
        System.out.println("Mostrar LinkedList após remoção = " + ninjasLinkedList);


        // Adicionando no início e no fim
        ninjasLinkedList.addFirst("Kakashi Hatake");
        ninjasLinkedList.addLast("Madara Uchiha");
        System.out.println("LinkedList após adicionar elementos no início e no fim = " + ninjasLinkedList);

        // Verificar se a LinkedList está vazia
        if (ninjasLinkedList.isEmpty()) {
            System.out.println("A LinkedList está vazia");
        } else {
            System.out.println("A LinkedList não está vazia, você tem esses elementos: " + ninjasLinkedList);
        }







    }
}
