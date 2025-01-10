package com.ak.math;

public class HappyNumber {

    public static void main(String[] args) {
        int num = 19;
        int result = num;

        while (result != 1 && result != 4) {
            result = isHappyNumber(result);
        }
        if (result == 1)
            System.out.println(num + " is a Happy number");
        else
            System.out.println(num + " is not a happy number");
    }

    public static int isHappyNumber(int num) {
        int rem = 0, sum = 0;

        while (num > 0) {
            rem = num % 10;
            sum = sum + (rem * rem);
            num = num / 10;
        }
        return sum;
    }
}
