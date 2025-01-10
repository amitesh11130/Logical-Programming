package com.ak.array;

public class Second_Largest_And_Smallest_Number_Without_Sorting {

    public static void main(String[] args) {

        int arr[] = {2,100, 2, 4, 4, 22, 77, 11, -1, -55, 90, 90, 85, -22};
        int max = arr[0];
        int secondMax = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        System.out.println("Largest number in the array[] is :: " + max);
        System.out.println("Second largest number in the array[] is :: " + secondMax);


        int arr1[] = {-111, 2, 4, 4, 22, 77, 11, -1, -55, 90, 90, 85, -22};
        int min = arr1[0];
        int secondMin = 0;

        for (int i = 1; i < arr1.length; i++) {
            if (arr[i] < min) {
                secondMin = min;
                min = arr1[i];
            } else if (arr1[i] < secondMin && arr1[i] != min) {
                secondMin = arr1[i];
            }
        }
        System.out.println("Largest number in the array[] is :: " + min);
        System.out.println("Second smallest number in the array[] is :: " + secondMin);
    }
}
