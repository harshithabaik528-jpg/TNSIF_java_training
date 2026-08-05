package org.tnsif.acc.c2tc.scanner_bufferreader;
import java.util.Scanner;

public class ScannerMethodDemo2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char ch = scan.nextLine().charAt(5);
		System.out.println("character is: " + ch);
		scan.close();
	}
}