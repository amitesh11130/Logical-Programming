package com.ak.number;
import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number ::");
        int n = sc.nextInt();
        System.out.println("Enter the power number ::");
        int p = sc.nextInt();
        powerOfNumber(n,p);
    }
    public static void powerOfNumber(int num,int pow){
        int power =1;
        for (int i=1;i<=pow;i++){
          power =  num*power;
        }
        System.out.println("Power of "+num+"^"+pow+" :: "+power);
    }
}
