package com.ak.number;

import java.util.Scanner;

/**
 * Factorial of a Number :
 * Factorial is a sequence of a number where we multiply by all previous numbers.
 */

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :: ");
        long n = sc.nextInt();
        factorial(n);
    }
    public static void factorial(long num){
        long mul = 1;
        for(long i=1;i<=num;i++){
          mul = i*mul;
        }
        System.out.println("Factorial of "+num+" is :: "+mul);
    }
}
