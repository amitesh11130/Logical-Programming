package com.ak.number;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ::");
        int a = sc.nextInt();
        isPalindrome(a);
    }
    public static void isPalindrome(int num) {
        int num1 = num;
        int reverse = 0;
        while (num1 != 0) {
            int div = num1 % 10;
            reverse = reverse * 10 + div;
            num1 = num1 / 10;
        }
        if (reverse == num)
            System.out.println(num + " is palindrome number");
        else
            System.out.println(num + " is not a palindrome number");
    }
}
