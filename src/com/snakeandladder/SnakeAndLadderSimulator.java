package com.snakeandladder;

import java.util.Scanner;

public class SnakeAndLadderSimulator {
    final static int winningPosition = 100;

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Input the names of the two players:");
        String player1 = Sc.next();
        String player2 = Sc.next();
        int player1position = 0;
        int player2position = 0;

        int count = 0; // For counting number of turns each player
        int x;   // for getting random value


        while (player1position != winningPosition && player2position != winningPosition) {
            System.out.println();
            // Dice Computation Getting the Random Dice
            x = (int) Math.floor(Math.random() * (6 - 1 + 1) + 1);
            if ((player1position + x) <= 100) {
                player1position = x + player1position; //position update for player 1
                System.out.println(player1 + " throws " + x);
            }

            System.out.println(player1 + " reaches to cell " + player1position);


            switch (player1position) {   //for ladders
                case 3:
                    System.out.println(player1 + " reaches to base of a ladder ");
                    player1position = 22;
                    System.out.println(player1 + " climbs on position 22");
                    player1position += x;
                    System.out.println(player1 + " got a ladder and and get a chance to play again and final position is " + player1position);
                    break;
                case 15:
                    System.out.println(player1 + " reaches to base of a ladder ");
                    player1position = 25;
                    System.out.println(player1 + " climbs on position 25");
                    player1position += x;
                    System.out.println(player1 + " got a ladder and and get a chance to play again and final position is " + player1position);
                    break;
                case 34:
                    System.out.println(player1 + " reaches to base of a ladder ");
                    player1position = 36;
                    System.out.println(player1 + " climbs on position 36");
                    player1position += x;
                    System.out.println(player1 + " got a ladder and and get a chance to play again and final position is " + player1position);
                    break;
                case 60:
                    System.out.println(player1 + " reaches to base of a ladder ");
                    player1position = 86;
                    System.out.println(player1 + " climbs on position 86");
                    player1position += x;
                    System.out.println(player1 + " got a ladder and and get a chance to play again and final position is " + player1position);
                    break;
                //for snakes
                case 17:
                    System.out.println(player1 + " reaches to mouth of a snake ");
                    player1position = 4;
                    System.out.println(player1 + " goes down to 4");
                    break;
                case 39:
                    System.out.println(player1 + " reaches to mouth of a snake ");
                    player1position = 8;
                    System.out.println(player1 + " goes down position 8");
                    break;
                case 73:
                    System.out.println(player1 + " reaches to mouth of a snake ");
                    player1position = 64;
                    System.out.println(player1 + " goes down position 64");
                    break;
                case 97:
                    System.out.println(player1 + " reaches to mouth of a snake ");
                    player1position = 3;
                    System.out.println(player1 + " goes down position 3");
                    break;
                default:
                    break;
            }


            System.out.println();
            // random dice value
            x = (int) Math.floor(Math.random() * (6 - 1 + 1) + 1);
            if ((player2position + x) <= 100) {
                player2position = x + player2position;       //position update of player2
                System.out.println(player2 + " throws " + x);
            }

            System.out.println(player2 + " reaches to cell " + player2position);


            switch (player2position) {   //for ladders
                case 3:
                    System.out.println(player2 + " reaches to base of a ladder ");
                    player2position = 22;
                    System.out.println(player2 + " climbs on position 22");
                    player2position += x;
                    System.out.println(player1 + " got a ladder and and get a chance to play again and final position is " + player2position);
                    break;
                case 15:
                    System.out.println(player2 + " reaches to base of a ladder ");
                    player2position = 25;
                    System.out.println(player2 + " climbs on position 25");
                    player2position += x;
                    System.out.println(player1 + " got a ladder and and get a chance to play again and final position is " + player2position);
                    break;
                case 34:
                    System.out.println(player2 + " reaches to base of a ladder ");
                    player2position = 36;
                    System.out.println(player2 + " climbs on position 36");
                    player2position += x;
                    System.out.println(player1 + " got a ladder and and get a chance to play again and final position is " + player2position);
                    break;
                case 60:
                    System.out.println(player2 + " reaches to base of a ladder ");
                    player2position = 86;
                    System.out.println(player2 + " climbs on position 48");
                    player2position += x;
                    System.out.println(player1 + " got a ladder and and get a chance to play again and final position is " + player2position);
                    break;
                //for snakes
                case 17:
                    System.out.println(player2 + " reaches to mouth of a snake ");
                    player2position = 4;
                    System.out.println(player2 + " goes down to 4");
                    break;
                case 39:
                    System.out.println(player2 + " reaches to mouth of a snake ");
                    player2position = 8;
                    System.out.println(player2 + " goes down to 8");
                    break;
                case 73:
                    System.out.println(player2 + " reaches to mouth of a snake ");
                    player2position = 64;
                    System.out.println(player2 + " goes down to 64");
                    break;
                case 97:
                    System.out.println(player2 + " reaches to mouth of a snake ");
                    player2position = 3;
                    System.out.println(player2 + " goes down to 3");
                    break;
                default:
                    break;
            }
            count++;
        }

        System.out.println();

        System.out.println("Total number of dice throws made by  player1 is: " + count);

        if (player1position == 100) {
            System.out.println(player1 + " is the winner ");
        } else {
            System.out.println(player2 + " is the winner ");
        }

    }
}
