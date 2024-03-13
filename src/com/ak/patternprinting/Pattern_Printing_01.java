package com.ak.patternprinting;



public class Pattern_Printing_01 {
    public static void main(String[] args) {
        int num = 4;
       // pattern01(num);
       // pattern02(num);
       // pattern03(num);
        pattern04(num);
    }
    // Printing Square Star Pattern
    public static void pattern01(int n){
        for(int i =1;i<=n;i++){
            for(int j =0;j<n;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //Printing Hollow Square Star Pattern
    public static void pattern02(int n){
        for(int i =1;i<=n;i++){
            for(int j=0;j<n;j++) {
                if(i==2 && (j==1 || j==2)    || i==3  && (j==2 ||j==1) ){
                    System.out.print(" ");
                }
                else System.out.print("*");
            }
            System.out.println();
        }
    }
    // Printing Rhombus Star Pattern
    public static void pattern03(int n){
        for(int i =1;i<=n;i++){
            for(int j=2;j<=i;j++)
                System.out.print(" ");
            for(int j=1;j<=n;j++)
                System.out.print("*");
            System.out.println();
        }
    }
    //Printing Pyramid Star Pattern
    public static void pattern04(int n){
        for(int i=1;i<=n;i++) {
            for (int j=n-i; j>=1; j--)
                System.out.print(" ");
            for (int j=1; j<=i; j++)
                System.out.print(" *");
            System.out.println();
        }
    }
}
