package com.ak.string;


public class IsPalindrome {

    public static boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))
                return false;
            ++l;
            --r;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "Ma^?/daM";
        String s1 = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(isPalindrome(s1));
    }
}
