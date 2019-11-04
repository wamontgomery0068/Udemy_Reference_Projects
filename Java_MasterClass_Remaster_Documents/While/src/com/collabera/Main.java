package com.collabera;

public class Main {

    public static void main(String[] args) {

        // While loop Example
//        int count = 6;
//        while(count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        for(int i = 6; i!=6; i++) {
//            System.out.println("Count value is " + count);
//        }
//
//        // Example of "do while" statement
//        count = 1;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//        } while (count != 6);

//        int number = 4;
//        int finishNumber = 20;
//
//        while (number <= finishNumber) {
//            number++;
//            if(!isEvenNumber(number)) {
//                continue;
//            }
//
//            System.out.println("Even number " + number);
//        }

        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }

            evenNumbersFound++;
            if(evenNumbersFound >= 5) {
                break;
            }
            System.out.println("Even number " + number);
        }

        System.out.println("Total even numbers found = " + evenNumbersFound);
    }

    // Challenge

    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // return true if an even number, otherwise return false;

    public static boolean isEvenNumber (int number) {
        if((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
