package com.ak.number;

import java.util.Scanner;

/**
 * Fibonacci Series ::
 * A series of numbers in which each number is the sum of the two preceding numbers is known as a Fibonacci Series.
 */

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number ::");
        int n = sc.nextInt();
        fibonacci(n);
    }

    public static void fibonacci(int num){
        int num1 = 0;
        int num2 = 1;
        System.out.print("The "+num+" term of a Fibonacci series :: "+num1+"," +num2);
        int next;
        for(int i =2;i<num;i++){
            next = num1+num2;
            num1 =num2;
            num2 =next;
            System.out.print(","+next);
        }
    }
}
