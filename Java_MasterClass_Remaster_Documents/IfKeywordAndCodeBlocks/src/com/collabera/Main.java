package com.collabera;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if( score < 5000 && score > 1000) {
//            System.out.println("Your score was less than 5000 but greater than 1000.");
//        } else if (score < 1000) {
//            System.out.println("Your score was less than 1000.");
//        } else {
//            System.out.println("Got here!");
//        }

        if(gameOver == true) {
            // Create a new variable called finalScore and it's data type will be "int"
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        // Challenge
        // ** 1) Print out a second score on the screen with the following
        // ** 2) score set to 10000
        // ** 3) levelCompleted set to 8
        // ** 4) bonus set to 200
        // ** 5) But make sure the first printout above still displays as well

        // ***** First Approach *****

//        boolean secondGameOver = true;
//        int secondScore = 1000;
//        int secondLevelCompleted = 8;
//        int secondBonus = 200;
//
//        if(secondGameOver) {
//            int finalScore = secondScore + (secondLevelCompleted * secondBonus);
//            System.out.println("Your final score was " + finalScore);
//
//        }

        // ***** Second Approach *****

        score = 1000;
        levelCompleted = 8;
        bonus = 200;

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }





    }
}
