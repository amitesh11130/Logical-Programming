package com.ak.number;

import java.util.Scanner;

public class AddTwoFractions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numerator1 :: ");
        int num1 = sc.nextInt();
        System.out.println("Enter denominator1 :: ");
        int dem1 = sc.nextInt();
        System.out.println("Enter numerator2 :: ");
        int num2 = sc.nextInt();
        System.out.println("Enter denominator2 :: ");
        int dem2 = sc.nextInt();
        int dem,num,x;

        System.out.print((num1+"/"+dem1)+" + "+(num2+"/"+dem2)+" = ");

        if (dem1 == dem2) {
             num = (num1 + num2);
             dem = dem1;
            System.out.print(num + "/" + dem);
        }
        else {
            int hcf = 0;
            for (int i = 1; i <= dem1 || i <= dem2; i++) {
                if (dem1 % i == 0 && dem2 % i == 0)
                    hcf = i;
            }
            dem = (dem1*dem2)/hcf;     //lcm = (num1+num2)/hcf
             num = ((dem/dem1)*num1)+((dem/dem2)*num2);
            System.out.print(num + "/" + dem);
        }
        if (num>dem)
            x = num;
        else
            x = dem;
        for (int i =1;i<=x;i++){
            if (num%i==0 && dem%i==0){
                num = num/i;
                dem = dem/i;
            }

        }
        System.out.println("=>"+num + "/" + dem);




    }

}
