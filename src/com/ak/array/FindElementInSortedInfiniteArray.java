package com.ak.array;

public class FindElementInSortedInfiniteArray {

    public static void main(String[] args) {

        int arr[] = {1, 5, 6, 7, 8, 22, 44, 66, 77, 88, 123, 245, 345, 678, 900, 1000};
        int target = 77;
        System.out.println(searchInfinite(arr, target));
    }

    public static int searchInfinite(int[] num, int target) {
        int start = 0;
        int end = 1;
        while (target > num[end]) {
            start = end;
            end = end * 2;
        }
        return binarySearch(num, start, end, target);
    }

    public static int binarySearch(int num[], int start, int end, int target) {
        while ((start <= end)) {
            int mid = (start + end) / 2;
            if (num[mid] == target)
                return mid;
            else if (target > num[mid])
                start = mid + 1;
            else if (target < num[mid])
                end = mid - 1;
        }
        return -1;
    }
}
