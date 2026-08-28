package org.tnsif.acc.c2tc.scanner_bufferreader;

import java.util.Scanner;

public class ScannerCharDemo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String:");

        char ch = scan.next().charAt(3);

        System.out.println("Fourth character is " + ch);

        scan.close();
    }
}