package com.ak.array;

import java.util.Arrays;

public class FindFirstLastOccurrence {

    public static void main(String[] args) {

        int array[] = {1, 2, 4, 6, 77, 88, 99, 99, 99, 100, 102, 105, 105, 170};
        int value = 99;

        int[] index = findFirstAndLastOccurrence(array, value);
        if (index[0] != -1 && index[1] != -1) {
            System.out.println("First and Last Occurrence are :: [" + index[0] + ", " + index[1] + "]");
        } else {
            System.out.println("Element not found in the array");
        }
    }

    public static int[] findFirstAndLastOccurrence(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int[] result = {-1, -1};
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                result[0] = mid;
                high = mid - 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        int index = result[0];
        while (index <=nums.length - 1  && result[0] != -1 && nums[index] == nums[result[0]]) {
            result[1] = index;
            index++;
        }
        return result;
    }
}
