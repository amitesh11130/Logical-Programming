package com.ak.number;

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year :: ");
        int  year = sc.nextInt();
        leapYearOrNot(year);
    }
    public static void leapYearOrNot(int year){

        if (year%400 ==0) {
            System.out.println(year + " is a leap year");
        }
        else if (year%4==0 && year%100!=0) {
            System.out.println(year + " is a leap year");
        }else
        System.out.println(year + " is not a leap year");
    }
}
