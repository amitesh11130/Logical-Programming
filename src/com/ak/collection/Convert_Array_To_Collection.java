package com.ak.collection;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Convert_Array_To_Collection {

    public static void main(String[] args) {

        String array[] = {"Core-Java","Spring","SpringBoot","Microservices","MySQL","Git","JDBC"};

        System.out.println("The array element are as follow :: ");
        for (int i = 0 ; i < array.length ; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("The converted array to List element are as follow :: ");

        List list = Arrays.asList(array);
        System.out.println(list);


    }

}
