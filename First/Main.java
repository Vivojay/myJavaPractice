package com.vivojay;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Marie", "Jerienna", "Kipling", "Loki", "Henry", "Thor", "NishantJha"};

        System.out.println("Names stored in list: "+Arrays.toString(names));

        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter name to lookup: ");
        String nameLookupQuery = myScanner.nextLine().trim();

        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(nameLookupQuery)) {
                System.out.println("Item " + nameLookupQuery + " found at index " + i);
                break;
            }
        }
    }
}
