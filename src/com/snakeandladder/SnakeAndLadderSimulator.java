package com.snakeandladder;

public class SnakeAndLadderSimulator {
    public static void main(String[] args) {
        int playerposition = 0;
        // to get the random number 1 to 6
        int getnumber = (int) Math.floor(Math.random()*(6 -1 +1) + 1);
        // to get the random option
        int getoption = (int) Math.floor(Math.random()*(3 -1 +1) + 1);
        switch (getoption){
            // case of no play:
            case 0:
                playerposition = playerposition;
                break;
            //case of ladder:
            case 1:
                playerposition += getnumber;
                break;
            // case of snake:
            case 2:
                playerposition -= getnumber;
                break;
        }
        System.out.println(playerposition);
    }
}
