package com.collabera;

public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("Andrew", 500);

        System.out.println("New score is " + newScore);

        calculateScore(75);

        calculateScore();

        double centimeters = calcFeetAndInchesToCentimeters(6, 0);
        if( centimeters < 0.0 ) {
            System.out.println("Invalid parameters");
        }

        // calcFeetAndInchesToCentimeters(100);
        // calcFeetAndInchesToCentimeters(156);
        calcFeetAndInchesToCentimeters(157);



    }

    // **** Challenge Code Below

    // Original Method
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if((feet < 0) || ((inches < 0) || (inches > 12))) {
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;

        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    // Overloaded Method
    public static double calcFeetAndInchesToCentimeters(double inches) {

        if(inches < 0) {
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;

        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }















    // **** Challenge Code Above


    // Original Method
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 10000;
    }

    // First - Overloaded Method
    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 10000;
    }

    // Second - Overloaded Method
    public static int calculateScore() {
        System.out.println("No player name, no player scored");
        return 0;
    }
}
