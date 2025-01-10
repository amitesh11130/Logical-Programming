package com.ak.array;

public class Find_Ceiling {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 7, 8, 9, 10, 55, 66, 77, 99, 100, 101, 155};
        int target = 78;
        int end = arr.length - 1;
        System.out.println("Ceiling  :: " + findCeil(arr, 0, end, target));
    }

    private static int findCeil(int[] num, int start, int end, int target) {

        if (target <= num[start])
            return num[start];

        if (target > num[end])
            return -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (target == num[mid]) {
                return mid;
            } else if (target > num[mid]) {
                start = mid + 1;
            } else
                end = mid - 1;
        }
        return start;
    }
}
