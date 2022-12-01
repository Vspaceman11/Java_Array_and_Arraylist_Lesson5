package com.java.study.lesson5.task5_array_list_index_of;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> teachersList = new ArrayList<>();
        teachersList.add("Tatyana Ivanovna");
        teachersList.add("Rosa Sergeevna");
        teachersList.add("Margarita Vyacheslavovna");
        teachersList.add("Tatyana Nikolaevna");
        teachersList.add("Maxim Viktorovich");

        System.out.println("The worst teacher is: " + teachersList.indexOf("Tatyana Ivanovna"));
        System.out.println("The best teacher is: " + teachersList.indexOf("Maxim Viktorovich"));
        System.out.println(teachersList);
    }
}
