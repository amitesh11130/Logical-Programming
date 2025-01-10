package com.ak.collection.custom;

public class ArrayOperation {

    public static void main(String[] args) {

        CustomArrayList arrayList = new CustomArrayList();

        System.out.println(arrayList.getSize());

        arrayList.add("Amitesh");
        arrayList.add("Raunak");
        arrayList.add("Walter");
        arrayList.add("Shivaji");
        arrayList.add("Monu");
        arrayList.add("Bittu");
        arrayList.add("Rajan");

        System.out.println("Size :: "+arrayList.getSize());
        System.out.println(arrayList);

        arrayList.add("Hello");
        arrayList.add("hi");
        arrayList.add("hey");
        arrayList.add("bye");

        System.out.println(arrayList.getSize());

        arrayList.remove(6);
        System.out.println("Size :: "+arrayList.getSize());
        System.out.println(arrayList);
    }
}
