package com.ak.array;


public class SubArray {

    public static void main(String[] args) {

        int array1[] = {11, 22, 1, 55, 1, 7, 0, 4, 2, 7, 9, 44, 77, 66, 1, 7, 0, 234, 865, 24, 1};
        int array2[] = {1, 7, 0, 4};
        if (isSubArray(array1, array2)) {
            System.out.println("array2[] is a subArray of array1[]");
        } else System.out.println("array2[] is not a subArray of array1[]");

    }

    public static boolean isSubArray(int[] num1, int[] num2) {
        int index1 = num1.length;
        int index2 = num2.length;

        for (int i = 0; i <= index1 - index2; i++) {
            int j;
            for (j = 0; j < index2; j++) {
                if (num1[i + j] != num2[j]) {
                    break;
                }
            }
            if ((j == index2))
                return true;
        }
        return false;
    }
}
