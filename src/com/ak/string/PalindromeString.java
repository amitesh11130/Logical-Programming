package com.ak.string;

public class PalindromeString {

        public static void main(String[] args) {
            String s = "Amima";
            if(isStringPalindrome(s)){
                System.out.println("It is a Palindrome String");
            }else
                System.out.println("It is not a Palindrome String");
        }
        public static boolean isStringPalindrome(String s) {
            int i = 0;
            int j = s.length()-1;
           while (i<j){
               if ((s.toLowerCase()).charAt(i) != (s.toLowerCase()).charAt(j))
                   return false;
               i++;
               j--;
           }
            return true;
        }

    }
