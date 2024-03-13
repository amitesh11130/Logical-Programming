package com.ak.string;

import java.util.Scanner;

public class NumberToWords {

    private static final String[] units = {"", "One ", "Two ", "Three ", "Four ",
            "Five ", "Six ", "Seven ", "Eight ", "Nine ", "Ten ", "Eleven ", "Twelve ",
            "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ", "Nineteen "};

    private static final String[] tens = {"", "", "Twenty ", "Thirty ", "Forty ",
            "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety "};

    private static final String[] thousands = {"", "Thousand ", "Million ", "Billion "};

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        System.out.println(convertNumberToWords(number));
        scanner.close();
    }

    public static String convertNumberToWords(long number) {
        if (number == 0) {
            return "Zero";
        }

        int i = 0;
        StringBuilder words = new StringBuilder();

        do {
            long n = number % 1000;
            if (n != 0) {
                words.insert(0, convertLessThanOneThousand((int) n) + thousands[i]);
            }
            i++;
            number /= 1000;
        }
        while (number > 0);

        return words.toString().trim();
    }

    private static String convertLessThanOneThousand(int number) {
        String current;
        if (number % 100 < 20) {
            current = units[number % 100];
            number /= 100;
        } else {
            current = units[number % 10];
            number /= 10;

            current = tens[number % 10] + current;
            number /= 10;
        }
        if (number == 0) return current;
        return units[number] + "Hundred " + current;
    }
}

