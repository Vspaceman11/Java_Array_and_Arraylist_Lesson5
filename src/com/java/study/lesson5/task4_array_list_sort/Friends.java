package com.java.study.lesson5.task4_array_list_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Friends {
    public static void main(String[] args) {
        String[] friendsList1 = {"Den", "Alex", "Jane", "Philip"};
        System.out.println("(1) Before sort: " + Arrays.toString(friendsList1)); // 1 line in console
        Arrays.sort(friendsList1);
        System.out.println("(2) After sort by Arrays: " + Arrays.toString(friendsList1)); // 2 line in console


        ArrayList<String> friendsList = new ArrayList<>();

        friendsList.add("Den");
        friendsList.add("Alex");
        friendsList.add("Jane");
        friendsList.add("Philip");

        System.out.println("(3) Before sort: " + friendsList); // 3 line in console
        friendsList.sort(Comparator.naturalOrder());
        System.out.println("(4) After sort by Comparator: " + friendsList); // 4 line in console
        Collections.sort(friendsList);
        System.out.println("(5) After sort by Collections: " + friendsList); // 5 line in console
    }
}
