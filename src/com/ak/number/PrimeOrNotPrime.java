package com.ak.number;

public class PrimeOrNotPrime {
    public static void main(String[] args) {
        int num = 17;
        if(isPrime(num))
            System.out.println("it is a prime num");
        else
            System.out.println("it is not a prime num");

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
