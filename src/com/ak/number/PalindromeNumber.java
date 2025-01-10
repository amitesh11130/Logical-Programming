package com.ak.number;

public class PalindromeNumber {

    public static void main(String[] args) {
        int num = 45654;
        if(isPalindrome(num)){
            System.out.println(num+" :: is a Palindrome number");
        }else
            System.out.println("It is not a Palindrome number");
    }
    public static boolean isPalindrome(int num){
        int num1 = num;
        int reverse = 0;
        while (num1!=0){
            reverse = reverse*10+num1%10;
            num1 = num1/10;
        }
        if (num==reverse) {
            return true;
        }
        return false;
    }

}
