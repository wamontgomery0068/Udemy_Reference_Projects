package com.collabera;

public class Main {

    public static void main(String[] args) {

        // ****** Operator Example ******

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        // result = result + 1
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        // result = result + 2;
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        // result = result * 10;
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        // result = result / 3
        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        // result = result - 2
        result -= 2; // 10 - 2 = 8
        System.out.println("10 - 2 = " + result );

        // **** if-then Statement Example ****

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if(topScore < 100) {
            System.out.println("You got the highest score.");
        }


        // ***** Example of the OR AND Operator *****

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");

        }

        if((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true.");
        }

        // 37. Assignment Operator VS Equal to Operator -- Code Below

        int newValue = 50;
        if(newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if(isCar) {
            System.out.println("This is not suppose to happen");
        }

        // 38. Ternary Operator -- Code Below

        isCar = true;
        boolean wasCar = isCar? true : false;
        if(wasCar) {
            System.out.println("wasCar is true");
        }

        // 39. Operator Precedence and Operator Challenge

        // 1) Create a double variable with a value of 20.00
        double myFirstValue = 20.00;
        System.out.println("myFirstValue = " + myFirstValue);

        // 2) Create a second variable of type double with the value of 80.00
        double mySecondValue = 80.00;
        System.out.println("mySecondValue = " + mySecondValue);

        // 3) Add both numbers together and multiply by 100.00
        double myValueTotal = (myFirstValue + mySecondValue) * 100.00;
        System.out.println("myValueTotal = " + myValueTotal);

        // 4) Use the remainder operator to figure out what the remainder from the result of the operation
        // in step 3 and 40.00. We used the modulus or remainder operator on int's in the course, but we can also
        // also use it on a double.
        double theRemainder = myValueTotal % 40.00;
        System.out.println("theRemainder = " + theRemainder);

        // 5) Create a boolean variable that assigns the value true if the remainder in #4 is 0,
        // or false if its not zero.

        boolean isNoRemainder = (theRemainder == 0) ? true : false;

        // 6) Output the boolean variable
        System.out.println("isNoRemainder = " + isNoRemainder);

        // 7) Write an if-ten statement that displays a message "Got some remainder" if boolean is
        // not true. Don't be suprised if you see output for this step, where you might expect it not to show.

        if(!isNoRemainder) {
            System.out.println("Got some remainder!");
        }
    }
}
