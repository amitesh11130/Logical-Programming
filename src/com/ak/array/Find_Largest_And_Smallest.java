package com.ak.array;

import java.util.Arrays;

public class Find_Largest_And_Smallest {

    public static void main(String[] args) {
        int arr[] = {100,-8, 0, 1, 3, 90, 4, 22, 88, 43, 55, 77, 88, 11, 8};
        System.out.println("Largest number in the array[] is :: " + findLargest(arr));
        System.out.println("Smallest number in the array[] is :: " + findSmallest(arr));
    }

    public static int findLargest(int[] arr) {
        int max = arr[0];
        for ( int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static int findSmallest(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }
}
