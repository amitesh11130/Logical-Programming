package com.ak.array;

import org.w3c.dom.html.HTMLImageElement;

import java.util.Arrays;

public class Quick_Sort {

    public static void main(String[] args) {

        int[] arr = {11, 22, 1, 55, 1, 7, 0, 4, 2, 7, 9, 44, 77, 66, 1, 7, 0, 234, 865, 24, 1, 3, -0, -7, -4, -5, -77, -6555, -8};
        int N = arr.length;
        System.out.println("Original array:");
        System.out.println(Arrays.toString(arr));

        quickSort(arr, 0, N - 1);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));

    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];

        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}