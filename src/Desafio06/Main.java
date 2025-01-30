package Desafio06;

import java.util.*;

public class Main {
    public static void main(String[] args) {

/*

        LinkedList<Ninja> listDeNinjas = new LinkedList<>();

        listDeNinjas.add(new Ninja("Naruto Uzumaki", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Sasuke Uchiha", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Sakura Haruno", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Kakashi Hatake", 31, "Konoha"));
        listDeNinjas.add(new Ninja("Gaara", 17, "Areia"));
        listDeNinjas.add(new Ninja("Shikamaru Nara", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Temari", 18, "Areia"));
*/

        ArrayList<Ninja> arrayDeNinjas= new ArrayList<>();

        arrayDeNinjas.add(new Ninja("Naruto",25,55));
        arrayDeNinjas.add(new Ninja("Naruto", 25, 55));
        arrayDeNinjas.add(new Ninja("Sasuke", 26, 50));
        arrayDeNinjas.add(new Ninja("Sakura", 25, 45));
        arrayDeNinjas.add(new Ninja("Kakashi", 35, 60));
        arrayDeNinjas.add(new Ninja("Itachi", 27, 58));
        arrayDeNinjas.add(new Ninja("Gaara", 24, 52));

        System.out.println("-------- Lista de Ninjas -------");
        for (Ninja ninja : arrayDeNinjas) {
            System.out.println(ninja);
        }








    }
}
