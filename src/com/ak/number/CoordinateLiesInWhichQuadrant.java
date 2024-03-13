package com.ak.number;

import java.util.Scanner;

public class CoordinateLiesInWhichQuadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x coordinate :: ");
        float x = sc.nextFloat();
        System.out.println("Enter y coordinate :: ");
        float y = sc.nextFloat();
        coordinateLies(x, y);
    }

    public static void coordinateLies(double x, double y) {
        if (x > 0 && y > 0)
            System.out.println("coordinate (" + x + "," + y + ") lies in 1st quadrant");
        else if (x < 0 && y > 0)
            System.out.println("coordinate (" + x + "," + y + ") lies in 2nd quadrant");
        else if (x < 0 && y < 0)
            System.out.println("coordinate (" + x + "," + y + ") lies in 3rd quadrant");
        else if (x > 0 && y < 0)
            System.out.println("coordinate (" + x + "," + y + ") lies in 4th quadrant");
        else if (x == 0 && y != 0)
            System.out.println("coordinate (" + x + "," + y + ") lies in Y-Axis");
        else if (x != 0) {
            System.out.println("coordinate (" + x + "," + y + ") lies in X-Axis");
        } else
            System.out.println("coordinate (" + x + "," + y + ") lies in Origin");
    }
}
