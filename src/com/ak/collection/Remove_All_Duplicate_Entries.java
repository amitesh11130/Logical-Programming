package com.ak.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class Remove_All_Duplicate_Entries {

    public static void main(String[] args) {

        List arrayList = new ArrayList<>();

        arrayList.add("Core-Java");
        arrayList.add("Git");
        arrayList.add("JDBC");
        arrayList.add("Spring");
        arrayList.add("SpringBoot");
        arrayList.add("Microservices");
        arrayList.add("Spring");
        arrayList.add("Git");
        arrayList.add("Core-Java");
        arrayList.add("JDBC");
        Collections.sort(arrayList);

        System.out.println("Displaying the initial arrayList :: "+arrayList);

        LinkedHashSet hashSet = new LinkedHashSet<>();
        hashSet.addAll(arrayList);
        System.out.println("Displaying the Hashset :: "+hashSet);

        arrayList.clear();
        arrayList.addAll(hashSet);
        System.out.println("Displaying the arrayList after deleting duplicates entries :: "+arrayList);

    }
}
