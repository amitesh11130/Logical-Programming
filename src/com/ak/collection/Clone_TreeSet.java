package com.ak.collection;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Clone_TreeSet {

    public static void main(String[] args) {

        TreeSet treeSet = new TreeSet<>();

        treeSet.add("Core-Java");
        treeSet.add("Spring");
        treeSet.add("SpringBoot");
        treeSet.add("Microservices");
        treeSet.add("MySQL");
        treeSet.add("Git");
        treeSet.add("JDBC");

        System.out.println("The treeset are :: "+treeSet);

       TreeSet clone_Treeset = (TreeSet)treeSet.clone();

        System.out.println("The clone treeset are :: "+clone_Treeset);

    }
}
