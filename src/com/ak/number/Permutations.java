package com.ak.number;

import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of student :: ");
        long student = sc.nextInt();
        System.out.println("Enter number of seats :: ");
        long seats = sc.nextInt();
        long p = factorial(seats)/factorial(seats-student);
        System.out.println("Total possible arrangements "+p);
    }
    public static long factorial(long p){
        long factorial =1;

        for (long i = p;i>=1;i--){
            factorial = factorial*i;
        }
        return factorial;
    }
}
