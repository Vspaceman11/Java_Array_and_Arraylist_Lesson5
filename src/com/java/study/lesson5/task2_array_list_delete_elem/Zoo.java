package com.java.study.lesson5.task2_array_list_delete_elem;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> zoo = new ArrayList<>();
        zoo.add(0,"African Penguin");
        zoo.add(1,"Antelope");
        zoo.add(2,"Axolotl");
        zoo.add(3,"Bontebok");
        zoo.add(4, "Caracal");
        zoo.add(5,"Chimpanzee");
        zoo.add(6,"Chinchilla");
        zoo.add(7,"Clouded Leopard");

        zoo.remove(7);
        zoo.remove(5);
        zoo.remove(2);
        System.out.println(zoo.size());
        System.out.println(zoo);
    }
}
