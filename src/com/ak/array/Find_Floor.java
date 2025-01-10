package com.ak.array;

public class Find_Floor {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 7, 8, 9, 10, 55, 66, 77, 99, 100, 101, 155};
        int target = 145;
        int end = arr.length - 1;
        System.out.println("Floor :: " + findFloor(arr, 0, end, target));
    }

    private static int findFloor(int[] num, int start, int end, int target) {

        if (start > end)
            return -1;

        if (target >= num[end])
            return end;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (num[mid] == target)
                return mid;
           else if (num[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return end;
    }
}
