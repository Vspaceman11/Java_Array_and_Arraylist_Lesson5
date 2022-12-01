package com.java.study.lesson5.task4_array_list_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Friends {
    public static void main(String[] args) {
        ArrayList<String> friendsList = new ArrayList<>();
        friendsList.add("Den");
        friendsList.add("Alex");
        friendsList.add("Jane");
        friendsList.add("Philip");
        System.out.println("Before sort" + friendsList);
        friendsList.sort(Comparator.naturalOrder());
        System.out.println("After sort by Comparator: " + friendsList);
        Collections.sort(friendsList);
        System.out.println("After sort by Collections: " + friendsList);
    }
}
