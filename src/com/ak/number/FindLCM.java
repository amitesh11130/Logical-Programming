package com.ak.number;
/*
lcm = num1*num2/hcf
 */

import java.util.Scanner;

public class FindLCM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number :: ");
        int num2 = sc.nextInt();
        getHCF(num1,num2);
    }
    public static void getHCF(int num1,int num2){
        int hcf = 0;
        for(int i = 1;i<=num1 || i<=num2; i++){
            if (num1%i==0 && num2%i==0)
                hcf = i;
        }
        System.out.println("LCM of "+num1+" and "+num2+" is :: "+num1*num2/hcf);
    }

}
