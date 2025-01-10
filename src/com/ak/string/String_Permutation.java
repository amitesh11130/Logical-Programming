package com.ak.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class String_Permutation {

    public static List<List<Integer>> result = new ArrayList<>();

    public static void main(String[] args) {

        String s = "123";
        System.out.print("Permutation of string " + s + " are :: ");
        permutation(s.toCharArray(), 0);
        System.out.println();

        printPermuntation("", s);
        System.out.println(result);

        printPermuntation2("", s);
    }

    public static void permutation(char[] s, int c) {
        if (c == s.length - 1) {
            System.out.print(s);
            System.out.print(" ");
            return;
        }
        for (int i = c; i < s.length; i++) {
            swap(s, i, c);
            permutation(s, c + 1);
            swap(s, i, c);
        }
    }

    public static void swap(char[] s, int i, int c) {
        char temp = s[i];
        s[i] = s[c];
        s[c] = temp;
    }

    private static void printPermuntation(String output, String input) {

        if (input.isEmpty()) {
            ArrayList<Integer> list1 = new ArrayList<>();
            for (int i = 0; i < output.length(); i++) {
                Integer j = Integer.parseInt(String.valueOf(output.charAt(i)));
                list1.add(j);
            }
            result.addAll(Collections.singleton(list1));
            return;
        }

        for (int i = 0; i <= output.length(); i++) {

            char ch = input.charAt(0);

            String temp = output.substring(0, i) + ch + output.substring(i, output.length());

            printPermuntation(temp, input.substring(1));

        }

    }

    private static void printPermuntation2(String output, String input) {

        if (input.isEmpty()) {
            System.out.print(output +" ");
            return;
        }

        for (int i = 0; i <= output.length(); i++) {

            char ch = input.charAt(0);

            String temp = output.substring(0, i) + ch + output.substring(i, output.length());

            printPermuntation2(temp, input.substring(1));

        }

    }
}
