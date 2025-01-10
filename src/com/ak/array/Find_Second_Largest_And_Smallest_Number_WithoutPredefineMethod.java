package com.ak.array;

import java.util.Arrays;

public class Find_Second_Largest_And_Smallest_Number_WithoutPredefineMethod {

    public static void main(String[] args) {


        int arr[] = {2, 3, -3, -2, 0, 6, 44, 77, 22, 88, 33, -3, 90, 99, 42, 45, 65, 99, -2};
        System.out.println("Original array :: " + Arrays.toString(arr));

        //sorting
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Array is ascending order :: " + Arrays.toString(arr));
        System.out.println("Second largest number in the array[] is :: " + findSecondLargest(arr));
        System.out.println("Second smallest number in the array[] is :: " + findSecondSmallest(arr));


    }

    public static int findSecondLargest(int[] arr) {
        int index = arr.length - 1;
        while (arr[index] == arr[arr.length - 1]) {
            index--;
        }

        return arr[index];
    }

    public static int findSecondSmallest(int[] arr) {
        if (arr.length == 0 || arr.length == 1)
            return arr[0];
        int index = 0;
        while (arr[index] == arr[0]) {
            index++;
        }

        return arr[index];
    }

}
