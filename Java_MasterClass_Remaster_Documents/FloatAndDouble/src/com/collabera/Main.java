package com.collabera;

public class Main {

    public static void main(String[] args) {

        // ***** Float Example *****

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("myMinFloatValue: " + myMinFloatValue);
        System.out.println("myMaxFloatValue: " + myMaxFloatValue);

        // ***** Double Example *****

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("myMinDoubleValue: " + myMinDoubleValue);
        System.out.println("myMaxDoubleValue: " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;

        System.out.println("myIntValue: " + myIntValue);

        System.out.println("myFloatValue: " + myFloatValue);

        System.out.println("myDoubleValue: " + myDoubleValue);

        // ***** Challenge *****
        // Instructions
        // ** 1) Create a variable with the appropriate type to store the number of pounds to be converted to kilograms
        // ** 2) Calculate the result i.e. the number of kilograms based on the contents of the variable
        // ** above and store the result in a 2nd appropriate variable.
        // ** 3) Print out the result.

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted kilograms: " + convertedKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;

        System.out.println(pi);
        System.out.println(anotherNumber);

    }
}
