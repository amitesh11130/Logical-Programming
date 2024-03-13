package com.ak.number;

import java.util.Scanner;

public class FindHCF {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hcf =0 ;
        System.out.println("Enter first number :: ");
        int n1 = sc.nextInt();
        System.out.println("Enter second number :: ");
        int n2 = sc.nextInt();

        for(int i=1; i<=n1 || i<=n2; i++ ) {

            if (n1 %i==0 && n2%i==0){
                 hcf = i;
            }
        }
        System.out.println("HCF is "+hcf);
    }
}
