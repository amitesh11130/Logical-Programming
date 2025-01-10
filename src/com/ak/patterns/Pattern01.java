package com.ak.patterns;

public class Pattern01 {

    public static void main(String[] args) {
        int num = 6;
        pattern01(num);
        pattern02(num);
        pattern03(num);
        pattern04(num);
    }

    public static void pattern01(int num) {
        int i, j;
        for (i = 1; i <= num; i++) {
            for (j = (num - i) * 2; j > 0; j--)
                System.out.print(" ");
            for (j = 0; j < i; j++)
                System.out.print("* ");
            System.out.println();
        }
        System.out.println("===============================================");
    }

    public static void pattern02(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = num - i; j > 0; j--)
                System.out.print(" ");
            for (int j = 0; j < i; j++)
                System.out.print("* ");
            System.out.println();
        }
        System.out.println("===============================================");
    }

    public static void pattern03(int num) {
        for (int i = 0; i < num / 2; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            for (int j = 0; j <= i; j++) {
                System.out.print(" *");
            }

            System.out.println();
        }
        System.out.println("===============================================");
    }

    public static void pattern04(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = (num - i)*3-3 ; j > 0; j--)
                System.out.print(" ");
            for (int j = 0; j <= i * 2; j++)
                System.out.print(" * ");
            System.out.println();
        }

    }

}
