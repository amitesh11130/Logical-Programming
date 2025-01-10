package com.ak.array;

public class Binary_Search {

    public static void main(String[] args) {
         int arr[] = {1, 2, 3, 5, 7, 8, 9, 10, 55, 66, 77, 99, 100, 101, 155};
        //int arr[] = {220, 210, 200, 180, 170, 150, 130, 100, 90, 40, 20, 9, 8, 4, 2, 1};
        int target = 100;

        System.out.println("Index :: " + binarySearch(arr, target));
    }

    public static int binarySearch(int[] num, int target) {
        int start = 0;
        int end = num.length - 1;
        if (num[0] < num[end]) {
            while (start <= end) {
                int mid = (start + end) / 2;
                if (num[mid] == target)
                    return mid;
                else if (num[mid] < target)
                    start = mid + 1;
                else if (num[mid] > target)
                    end = mid - 1;
            }
        }
        while ((start <= end)) {
            int mid = (start + end) / 2;
            if (num[mid] == target)
                return mid;
            else if (num[mid] < target)
                end = mid - 1;
            else if (num[mid] > target)
                start = mid + 1;
        }
        return -1;
    }
}
