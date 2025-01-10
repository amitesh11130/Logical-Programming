package com.ak.collection;

import java.util.Enumeration;
import java.util.Hashtable;

public class Iterate_HashTable {

    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable<Integer,String>();

        hashtable.put(1, "Core-Java");
        hashtable.put(2, "Spring");
        hashtable.put(3, "SpringBoot");
        hashtable.put(4, "Microservices");
        hashtable.put(5, "MySQL");
        hashtable.put(6, "Git");
        hashtable.put(7, "JDBC");

        Enumeration enumeration = hashtable.elements();

        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

    }
}
