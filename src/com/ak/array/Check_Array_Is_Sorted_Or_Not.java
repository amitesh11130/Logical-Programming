package com.ak.array;

public class Check_Array_Is_Sorted_Or_Not {

    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 4, 22, 77, 11, -1, -55, 90, 90, 85, -22};

        if (isSorted(arr)) {
            System.out.println("It is a sorted array[]");
        } else
            System.out.println("It is not a sorted array[]");
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] > arr[i])
                return false;
        }
        return true;
    }
}
