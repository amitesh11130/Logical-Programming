package com.ak.array;

import java.util.HashSet;

public class Contains_Duplicate {
    public static void main(String[] args) {
        int nums[] = {1, 2, 1, 4, 5, 3, 6, 4, 99, 7, 65, 3, 7, 3, 2, 5};
        System.out.println(containsDuplicate(nums));

    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
