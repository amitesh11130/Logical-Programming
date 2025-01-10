package com.ak.math;

public class Square_Root {

    public static void main(String[] args) {

        int n = 2147483647;
        System.out.println("Square root ::"+mySqrt(n));

    }
    public static int mySqrt(int x) {
        double a = Math.sqrt(x);
        int b = (int) a ;
        return b ;
    }
}
