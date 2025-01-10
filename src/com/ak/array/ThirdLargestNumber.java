package com.ak.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ThirdLargestNumber {

    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 5, 12, 6, 8, 7, 9, 12, 54, 54};
        int index = 3;
        thirdLargestNumber(arr, index);
    }

    public static void thirdLargestNumber(int[] arr, int i) {

        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }
        if (result.length < i) {
            System.out.println("Array has less than three distinct numbers !!");
            System.out.println("The largest number are : " + result[result.length - 1]);
            return;
        }
        Arrays.sort(result);
        System.out.println("The third largest number are : " + result[result.length - i]);
    }

}
