package com.ak.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Find_Index {

    public static void main(String[] args) {
        //2
        // Find the index of n.    n = 10
        // int arr3[] = {3, 4, 6, 7, 8, 10, 34, 55, 57, 89, 90, 100}
        int array3[] = {3, 4, 6, 7, 8, 10, 34, 55, 57, 89, 90, 100};
        int n = 10;
        int index3 = array3.length - 1;
        findIndex(array3, n, index3);

        //3
        // Replace index 4 with N, N = 10
        //int arr5[] = {2, 4, 36, 78, 98, 67, 34}
        int array4[] = {2, 4, 36, 78, 98, 67, 34};
        int i = 4;
        int value = 10;
        System.out.println("Before change index value :: " + Arrays.toString(array4));
        if (changeIndexValue(array4, value, i)) {
            System.out.println("After change index " + i + " value :: " + Arrays.toString(array4));
        } else
            System.out.println("Index is not available in the array[]");

    }

    public static boolean findIndex(int[] num, int n, int index) {

        while (index >= 0) {
            if (n == num[index]) {
                System.out.println("The index of " + n + " is :: " + index);
                return true;
            }
            index--;
        }
        System.out.println("The number is not found in the array[]");
        return false;
    }

    public static boolean changeIndexValue(int[] num, int value, int i) {
        int index = num.length - 1;
        while (index >= 0) {
            if (index == i) {
                num[i] = value;
                return true;
            }
            index--;
        }
        return false;
    }

}
