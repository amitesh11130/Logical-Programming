package com.ak.number;
/*
Binary =          100011
decimal = (1*2^5)+(0*2^4)+(0*2^3)+(0*2^2)+(1*2^1)+(1*2^0) = 32+0+0+0+2+1
                                                          =35
 */

import java.util.Scanner;

public class BinaryToDecimalConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary number :: ");
        int binary = sc.nextInt();
        convertBinaryToDecimal(binary);
    }

    private static void convertBinaryToDecimal(int binary) {
        int decimal=0;
        int p =0;

            while (binary>0){
                int rem = binary%10;
                decimal = (int) (decimal+rem*Math.pow(2,p));
                binary = binary/10;
                p++;
        }
        System.out.println("Decimal number is :: "+decimal);
    }

}
