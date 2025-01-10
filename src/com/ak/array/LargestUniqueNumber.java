package com.ak.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LargestUniqueNumber {
    public static void main(String[] args) {
        int[] arr = {4,10, 2, 1, 6, 12, 6, 12, 54, 54,9};
        largestUniqueNumber(arr);
    }

    private static void largestUniqueNumber(int[] arr) {
        Set<Integer> uniqueSet = new HashSet<>();
        Set<Integer> duplicateSet = new HashSet<>();

        for (int num : arr){
            if(!uniqueSet.add(num)){
                duplicateSet.add(num);
            }
        }
        uniqueSet.removeAll(duplicateSet);

        int[] array = new int[uniqueSet.size()];
        int i = 0;
        for (int n : uniqueSet){
            array[i++] = n;
        }
        Arrays.sort(array);
        System.out.println("The largest unique number is : " +array[array.length-1]);

    }
}
