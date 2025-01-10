package com.ak.number;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber_StoreInArray {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 100;
        List<Integer> prime = new ArrayList<>();

        for (int i = num1; i <= num2; i++) {
            if (isPrime(i)) {
                prime.add(i);
            }
        }
        System.out.println("Prime number are :: "+prime);
    }
    public static boolean isPrime(int num){
        if(num<2)
            return false;
        for (int i =2;i<num;i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
}
