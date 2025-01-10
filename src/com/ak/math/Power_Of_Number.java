package com.ak.math;

public class Power_Of_Number {

    public static void main(String[] args) {

        double x = 2.0000;
        int n = 10;
        double result = 1;

        while (n > 0) {
            result = result * x;
            n--;
        }
        System.out.println("Power :: " + result);

    }
}
