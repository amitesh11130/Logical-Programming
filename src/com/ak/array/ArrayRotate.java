package com.ak.array;

import java.util.Arrays;

public class ArrayRotate {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        System.out.println("Original array[] :: " + Arrays.toString(arr));

        reverseArray(arr, 0, arr.length - 1 - k);
        reverseArray(arr, arr.length - k, arr.length - 1);
        reverseArray(arr, 0, arr.length - 1);


        System.out.println("Rotate array[] :: " + Arrays.toString(arr));
    }

    public static void reverseArray(int arr[], int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
}

