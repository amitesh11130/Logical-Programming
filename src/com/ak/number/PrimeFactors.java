package com.ak.number;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :: ");
        int num = sc.nextInt();
        primeFactor(num);
    }

    public static void primeFactor(int num) {
        for (int i = 2; i <= num; i++) {
           if(primeNumber(i)==1){
               int x = num;
               while (x % i == 0) {
                   System.out.print(i + " ");
                   x /= i;
               }
            }
        }
    }

    public static int primeNumber(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return 0;
        }
        return 1;
    }
}
