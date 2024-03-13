package com.ak.string;
/*
In this program:
=> A String contain number digit and other character.

=> If a characters is a letter, it's appended directly to the output string.
=> If a characters is a digit , it adds the numeric value of the digit to the numeric value of
   the previous character and appends the result to the output string.
=> Otherwise, if any other characters are in String appended directly to the output string.

 */

import java.util.Scanner;

public class StringConvertIntoCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string :: ");
        String input = sc.nextLine();

        System.out.println("Input :: "+input);
      String output1 = convertStringToLetter(input);
      String output2 = convertStringToLetter(output1);
      if(output1.equals(output2)){
          System.out.println("Output :: "+output1);
      }else {
          System.out.println("Output1 :: "+output1);
          System.out.println("Output2 :: "+output2);
      }
    }

    private static String convertStringToLetter(String input) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                sb.append(ch);
            } else if (Character.isDigit(ch)) {
                if (i>=1) {
                    char previousChar = input.charAt(i - 1);
                    int num = Character.getNumericValue(ch);

                    sb.append((char) ((int) previousChar + num));
                }else
                    System.out.println("String should be start with letter ");
            } else
                sb.append(ch);
        }
        return sb.toString();
    }
}

