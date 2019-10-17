package com.collabera;

public class Main {

    public static void main(String[] args) {

        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        // ***** String Example *****

        String myString = "This is a string";
        System.out.println("myString is equal to: " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to: " + myString);
        myString = myString + "\u00A9 2019";
        System.out.println("myString is equal to: " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);

        double doubleNumber = 2120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is now equal to " + lastString);

    }
}
