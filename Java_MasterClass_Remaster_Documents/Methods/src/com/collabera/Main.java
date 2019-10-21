package com.collabera;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        // Execute the calculateScore method
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was  " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        // Execute the calculateScore method
        highScore = calculateScore(gameOver, score,levelCompleted, bonus);
        System.out.println("Your final score was  " + highScore);

        // Challenge
        // ** 1) Create a method called displayHighScorePosition
        // ** 2) It should a player name as a parameter, and a 2nd parameter as a position in the high score table
        // ** 3) You should display the players name along with a message like "managed to get into position" and the
        // position they got and a further message " on the high score table".
        // ** 4) Create a 2nd method called calculateHighScorePosition
        // ** 5) It should be sent one argument only, the player score
        // ** 6) it should return an int
        // ** 7) the return data should be
        // ** 8) 1 if the score is >= 1000
        // ** 9) 2 if the score is >= 500 and < 1000
        // ** 10) 3 if the score is >= 100 and < 500
        // ** 11) 4 in all other cases call methods and display the results of the following
        // a score of 1500, 900, 400, and 50

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Andrew", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("John", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Daniel", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Joel", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Victoria", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Angela", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Joseph", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " +
                highScorePosition + " on the high score table.");

    }

    public static int calculateHighScorePosition(int playerScore) {

//        if(playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        }
//
//        return 4;

        int position = 4; // Assuming position 4 will be returned

        if(playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;
    }

    // Create a method that will calculate the score
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;


    }
}
