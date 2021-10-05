package com.vivojay;

import java.util.*;

public class fibonacci{
    public static void main(String[] args) {

        
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter number of Fibonacci numbers to generate: ");
        int generateUpto = myScanner.nextInt();
        
        int currentIndex = 2;
        long[] fibonacciSequence = new long[generateUpto];
        fibonacciSequence[0] = 0;
        fibonacciSequence[1] = 1;

        while (fibonacciSequence[fibonacciSequence.length-1] == 0) {
            fibonacciSequence[currentIndex] =
                fibonacciSequence[currentIndex-1] +
                fibonacciSequence[currentIndex-2];
                currentIndex++;
        }

        System.out.println("final list: "+Arrays.toString(fibonacciSequence));

    }
}
