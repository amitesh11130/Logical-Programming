package com.ak.number;

public class PrimeNumberBetween {

    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 100;
        int count = 0;
        for (int i = num1; i <= num2; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        System.out.print("Total prime number between "+num1+ " to "+num2+" are :: "+count);
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
