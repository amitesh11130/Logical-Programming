package com.ak.collection;

import java.util.HashMap;
import java.util.Map;

public class Value_Of_HashMap {

    public static void main(String[] args) {

        Map map = new HashMap<Integer,String>();

        map.put(1,"Core-Java");
        map.put(2,"Spring");
        map.put(3,"SpringBoot");
        map.put(4,"Microservices");
        map.put(5,"MySQL");
        map.put(6,"GIT");
        map.put(7,"JDBC");

        System.out.println("The value of Hashmap are as follow :: "+map.values());
    }
}
