package com.ak.number;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input from keyboard
       System.out.println("Enter first number :: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number :: ");
        int num2 = sc.nextInt();
        for(int i =num1;i<=num2;i++) {
            if (getPrimeNumber(i))
                System.out.println(i + " is a prime number");
        }
    }
    public static boolean getPrimeNumber(int num) {
        // checking number is smaller than 2 it is not a prime number
        if (num < 2)
            return false;
        // checking the number of divisors b/w 1 and the number n-1
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        //if reached here then must be true
            return true;

        }
}
