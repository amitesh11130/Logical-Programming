package com.ak.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicate_Elements {

    public static void main(String[] args) {

        int arr[] = {3, 4, 6, 8, 0, 7, 5, 8, 1, 0, 7, 7, 3, 7};
        System.out.println("Array before removing duplicates:");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        int[] array = removeDuplicate(arr);
        for (int j : array)
            System.out.print(j + " ");

    }

    public static int[] removeDuplicate(int[] arr) {

        if (arr.length == 0 || arr.length == 1) return new int[]{arr[0]};

        Set<Integer> set = new HashSet<>();
        for (int j : arr) {
            set.add(j);
        }
        System.out.println("\nArray after removing duplicates:");

        int[] result = new int[set.size()];
        int index = 0;
        for (int value : set) {
            result[index++] = value;
        }

        return result;
    }

}
