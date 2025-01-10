package com.ak.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse_Elements_In_ArrayList {

    public static void main(String[] args) {

        List arrayList = new ArrayList<>();

        arrayList.add("Core-Java");
        arrayList.add("Spring");
        arrayList.add("SpringBoot");
        arrayList.add("Microservices");
        arrayList.add("MySQL");
        arrayList.add("GIT");
        arrayList.add("JDBC");

        System.out.println("The original array list is as follows :: "+arrayList);

        Collections.reverse(arrayList);

        System.out.println("The reverse array list is as follows :: "+arrayList);

    }
}
