package org.tnsif.acc.c2tc.exceptionhandling;

public class NullPointerExceptionDemo {

    private static String str;

	public static void main(String[] args) {

        str = null;

        try {
            System.out.println(str.length());
        }
        catch (NullPointerException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("No matter what, this block will get executed");
        }
    }
}