package com.collabera;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMiniIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum value = " + myMiniIntValue);
        System.out.println("Integer Maximum value = " + myMaxIntValue);
        System.out.println("Busted Max value = " + (myMaxIntValue + 1));
        System.out.println("Busted Min value = " + (myMiniIntValue - 1));

        int myMaxInTest = 2147483647;


    }
}
