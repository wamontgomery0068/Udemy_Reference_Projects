package com.collabera;

public class Main {

    public static void main(String[] args) {

//        int value = 2;
//        if(value == 1) {
//            System.out.println("Value was 1");
//        } else if(value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

        // Code above is converted into a Switch Statement

//        int switchValue = 1;
//
//        switch(switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//
//            case 2:
//                System.out.println("Value was 2");
//                break;
//
//            case 3: case 4: case 5:
//                System.out.println("was a 3, or a 4, or a 5");
//                System.out.println("Actually it was a " + switchValue);
//                break;
//
//            default:
//                System.out.println("Was not 1 or 2");
//        }

        // Create a new switch statement using char instead of int
        // Create a new char variable
        // Create a switch statement testing for
        // A, B, C, D, or E
        // Display a message if any of these are found and then break
        // Add a default which displays a message saying not found

        char characterValue = 'A';

        switch (characterValue) {
            case 'A':
                System.out.println("Value was A");
                break;
            case 'B':
                System.out.println("Value was B");
                break;
            case 'C':
                System.out.println("Value was C");
                break;
            case 'D': case 'E':
                System.out.println("was a D, or it was an E");
                break;
            default:
                System.out.println("Could not find A, B, C, D, or E");

        }

    }
}
