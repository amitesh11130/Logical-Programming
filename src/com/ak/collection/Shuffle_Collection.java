package com.ak.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffle_Collection {

    public static void main(String[] args) {

        List arrayList = new ArrayList();

        arrayList.add("Core-Java");
        arrayList.add("Spring");
        arrayList.add("SpringBoot");
        arrayList.add("Microservices");
        arrayList.add("MySQL");
        arrayList.add("Git");
        arrayList.add("JDBC");

        System.out.println("The arraylist are :: "+arrayList);

        Collections.shuffle(arrayList);
        System.out.println("The shuffled arraylist are :: "+arrayList);

    }
}
