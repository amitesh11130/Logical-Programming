package com.ak.array;

public class Binary_Search_Recursion {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 7, 8, 9, 10, 55, 66, 77, 99, 100, 101, 155};
        int target = 99;
        int start = 0;
        int end = arr.length - 1;
        System.out.println("Index :: " + search(arr, target, start, end));

    }

    public static int search(int[] num, int target, int start, int end) {
        int t = target;

        int mid = (start + end) / 2;
        if (num[mid] == target) {
            return mid;
        }  if (num[mid] < target && target <= num[end]) {
            return search(num, t, mid + 1, end);

        } if (num[mid] > target && target >= num[start]) {
            return search(num, t, start, mid - 1);
        }

        return -1;
    }
}
