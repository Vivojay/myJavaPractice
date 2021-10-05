package com.vivojay;

import java.util.*;

public class palindrome {
    public static void main(String[] args) {

        int[] armstrongNumbers = new int[5];

        Scanner myScanner = new Scanner(System.in);
        System.out.print("Add a number threshold (Try for a number <= 100,000): ");
        int myNumber = myScanner.nextInt();

        if (myNumber <= 100000) {
            for (int numberToCheck = 0; numberToCheck <= myNumber; numberToCheck++) {
                String stringNumber = Integer.toString(numberToCheck);
                long sum = 0;

                for (int charIndex = 0; charIndex < stringNumber.length(); charIndex++) {
                    int currentDigit = Character.getNumericValue(stringNumber.charAt(charIndex));
                    sum += Math.pow(currentDigit, stringNumber.length());
                }
                if (numberToCheck==sum) {
                    System.out.println("Armstrong number found: "+numberToCheck);
                }
            }
        } else {
            System.out.println("Whoops, number too large.");
        }


    }
}

