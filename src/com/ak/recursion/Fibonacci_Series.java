package com.ak.recursion;

public class Fibonacci_Series {

    public static void main(String[] args) {
        int first = 0;
        int last = 15;
        System.out.print("the " + last + " Fibonacci Series are :: " + "0 1 ");
        fibonacciSeries(0, 1, last );

    }

    public static void fibonacciSeries(int i, int j, int k) {

        if (k == 0) return;

        System.out.print(i + j + " ");

        fibonacciSeries(j, i + j, --k);
    }
}
