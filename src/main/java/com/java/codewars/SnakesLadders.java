package com.java.codewars;

public class SnakesLadders {
    private int[] board = new int[]{
            1, 38, 3, 4, 5, 6, 14, 31, 9, 10,
            11, 12, 13, 14, 26, 6, 17, 18, 19, 20,
            42, 22, 23, 24, 25, 26, 27, 84, 29, 30,
            31, 32, 33, 34, 35, 44, 37, 38, 39, 40,
            41, 42, 43, 44, 45, 25, 47, 48, 11, 50,
            67, 52, 53, 54, 55, 56, 57, 58, 59, 60,
            61, 19, 63, 60, 65, 66, 67, 68, 69, 70,
            91, 72, 73, 53, 75, 76, 77, 98, 79, 80,
            81, 82, 83, 84, 85, 86, 94, 88, 68, 90,
            91, 88, 93, 94, 75, 96, 97, 98, 80, 100};

    private int player = 1;
    private int position1 = 0;
    private int position2 = 0;

    public String play(int die1, int die2) {
        String endTurn = "";

        if (position2 == 100 || position1 == 100)
            return "Game over!";

        if (player == 1) {
            position1 = board[move(position1, die1, die2) - 1];
            if (position1 == 100) {
                return "Player 1 Wins!";
            }
            player = checkPlayer(1, die1, die2);
            return "Player 1 is on square " + position1;
        }

        if (player == 2) {
            position2 = board[move(position2, die1, die2) - 1];
            if (position2 == 100) {
                return "Player 2 Wins!";
            }
            player = checkPlayer(2, die1, die2);
            return "Player 2 is on square " + position2;
        }
        return endTurn;
    }

    private int move(int position, int die1, int die2) {
        if ((position + die1 + die2) > 100) {
            return 100 + (100 - (position + die1 + die2));
        } else {
            return position + die1 + die2;
        }
    }

    private int checkPlayer(int player, int die1, int die2) {
        return die1 == die2 ? player : 3 - player;
    }
}