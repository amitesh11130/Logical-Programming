package com.ak.array;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Find_Second_Largest_And_Smallest_Number{

    public static void main(String[] args) {
        int arr[] = {2, 1, -3, -2, 6, 44, 77, 22, 88, 33, 90, 99, 42, 45, 65};
        System.out.println("Second largest number in the array[] is :: " + findSecondLargest(arr));
        System.out.println("Second smallest number in the array[] is :: " + findSecondSmallest(arr));
    }

    public static int findSecondSmallest(int[] arr) {
        if (arr.length == 0 || arr.length == 1)
            return arr[0];
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            linkedHashSet.add(arr[i]);
        }
        int a = Collections.min(linkedHashSet);
        linkedHashSet.remove(a);

        return Collections.min(linkedHashSet);
    }

    public static int findSecondLargest(int[] arr) {
        if (arr.length == 0 || arr.length == 1)
            return arr[0];
        HashSet<Integer> linkedHashSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            linkedHashSet.add(arr[i]);
        }
        int a = Collections.max(linkedHashSet);
        linkedHashSet.remove(a);

        return Collections.max(linkedHashSet);
    }
}
