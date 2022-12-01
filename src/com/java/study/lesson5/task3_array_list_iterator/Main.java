package com.java.study.lesson5.task3_array_list_iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);

        Iterator<Integer> listIterator = integerArrayList.listIterator();

        while (listIterator.hasNext()){
            Integer integer = listIterator.next() + 1;
            System.out.println(integer);
        }
    }
}
