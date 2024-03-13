package com.ak.number;

import java.util.Scanner;

public class DecimalToBinaryConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number :: ");
        int decimal = sc.nextInt();
        convertDecimalToBinary(decimal);
    }

    private static void convertDecimalToBinary(int decimal) {
        int[] binary = new int[1000];
        int i = 0;
        while (decimal > 0) {
            binary[i] = decimal % 2;
            decimal = decimal / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binary[j]);
        }
    }
}
