package com.ak.string;

import java.util.Scanner;

public class StringConvertIntoDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ::");
        String input = sc.nextLine();
        System.out.println(convertIntoDigit(input));
    }

    private static String convertIntoDigit(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                sb.append(ch);
            } else if (Character.isLetter(ch)) {
                char c = input.charAt(i+1);
                sb.append((int)(ch+c));
            } else
                sb.append(ch);
        }
        return sb.toString();
    }
}
