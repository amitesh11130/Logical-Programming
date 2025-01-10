package com.ak.string;

import java.util.Arrays;

public class Strings_Are_Anagrams {

    public static void main(String[] args) {

        String a = "Fiber";
        String b = "Brief";

        if(isAnagrams(a,b))
            System.out.println(a+" and "+b+" are anagrams");
        else
            System.out.println(a+" and "+b+" are not anagrams");
    }
    public static boolean isAnagrams(String a2,String b2){

        String a = a2.replaceAll("\\s", "");
        String b = b2.replaceAll("\\s","");

        if (a.length() != b.length())
            return false;
        char a1[] = a.toLowerCase().toCharArray();
        char b1[] = b.toLowerCase().toCharArray();

        Arrays.sort(a1);
        Arrays.sort(b1);

        return Arrays.equals(a1, b1);
    }
}
