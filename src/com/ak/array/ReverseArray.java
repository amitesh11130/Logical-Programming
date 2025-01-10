package com.ak.array;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 5, 10, 15, 6, 7, 9};
        System.out.println("Original array[] :: " + Arrays.toString(arr));
        reverseArray(arr);

        System.out.println("Reverse array[] :: " + Arrays.toString(arr));
    }

    public static void reverseArray(int arr[]) {

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

    }
}
