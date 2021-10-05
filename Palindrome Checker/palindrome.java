package com.vivojay;

import java.util.*;

public class palindrome {
    public static void main(String[] args) {

        
        Scanner myScanner = new Scanner(System.in);
        long numberToCheck = myScanner.nextLong();
        
        /*
        Scanner myScanner = new Scanner(System.in);
        String numberToCheck = myScanner.nextLine().trim();
        
        try {
            numberToCheck = Integer.parseInt(numberToCheck);
        }
        catch (Exception e) {
            System.out.println("Whoops, invalid number "+numberToCheck+" aborting program.");
            System.exit(1);
        }
        */
        
        short lenOfNumberToCheck = (short) Math.floor(Math.log10(numberToCheck));
        boolean isPalindrome = true;

        for (int i = 0; i < Math.floor(lenOfNumberToCheck/2)+1; i++) {
            String stringOfNumberToCheck = Long.toString(numberToCheck);

            if (stringOfNumberToCheck.charAt(i) != stringOfNumberToCheck.charAt((short) Math.floor(lenOfNumberToCheck)-i)) {
                System.out.println("Number is not a palindrome");
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Number is palindrome");
        }
    }
}    

