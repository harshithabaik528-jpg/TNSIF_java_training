package org.tnsif.acc.c2tc.staticdemo_finaldemo;

class UpiApp {

    final int max_Daily_limit = 100000;

    void showLimit() {
        System.out.println("Daily transfer limit: " + max_Daily_limit);
    }
}

public class FinalOnVariable {

    public static void main(String[] args) {

        UpiApp app = new UpiApp();

        app.showLimit();

        // This is a different local variable
        int max_Daily_limit = 500000;

        System.out.println("Local variable limit: " + max_Daily_limit);
    }
}