package org.tnsif.acc.c2tc.scanner_bufferreader;

import java.util.Scanner;

public class ScannerMethodDemo1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scan.nextLine();

        System.out.println("Enter your age:");
        int age = scan.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        scan.close();
    }
}