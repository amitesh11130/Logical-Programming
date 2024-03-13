package com.ak.number;

import java.util.Scanner;

public class MaximumNumberOfHandshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int person = sc.nextInt();

        int handshake = (person - 1) * person /2;
        System.out.println(handshake);

    }
}
