package com.ak.collection;

import java.util.ArrayList;
import java.util.List;

public class Join_Two_Array {

    public static void main(String[] args) {

        List arraylist1 = new ArrayList<>();

        arraylist1.add("Core-Java");
        arraylist1.add("Spring");
        arraylist1.add("SpringBoot");
        arraylist1.add("Microservices");

        System.out.println("The first arraylist are :: "+ arraylist1);

        List arraylist2 = new ArrayList<>();

        arraylist2.add("MySQL");
        arraylist2.add("GIT");
        arraylist2.add("JDBC");

        System.out.println("The second arraylist are :: "+ arraylist2);

        List joined_arraylist = new ArrayList<>();
        joined_arraylist.addAll(arraylist1);
        joined_arraylist.addAll(arraylist2);

        System.out.println("The joined arraylist are :: "+joined_arraylist);

    }
}
