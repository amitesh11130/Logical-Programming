package com.ak.number;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :: ");
        int n = sc.nextInt();
        reverseNumber(n);
    }
    public static void reverseNumber(int num){
        int reverse=0;
        int rem ;
        while (num != 0){
            rem = num%10;
            reverse = reverse*10+rem;
            num = num/10;
        }
        System.out.println("Reverse number :: "+reverse);
    }
}
