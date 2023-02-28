package com.snakeandladder;

public class SnakeAndLadderSimulator {
    public static void main(String[] args) {
        int playerposition = 0;
        int dicerollcount = 0;
        while (playerposition < 100) {
            int getnumber = (int) Math.floor(Math.random() * (6 - 1 + 1) + 1);
            dicerollcount++;
            int getoption = (int) Math.floor(Math.random() * (3 - 1 + 1) + 1);
            switch (getoption) {
                case 0:
                    playerposition = playerposition;
                    break;
                case 1:
                    playerposition += getnumber;
                    break;
                case 2:
                    playerposition -= getnumber;
                    break;

            }
            if (playerposition < 0){
                playerposition = 0;
            }
            if (playerposition > 100){
                playerposition -= getnumber;
            }
            System.out.println("player position after: " + dicerollcount + " is " + playerposition);
        }
        System.out.println("final position"+ playerposition);
    }
}
