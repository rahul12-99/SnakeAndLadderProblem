package com.snakeandladder;

public class SnakeAndLadderSimulator {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random()*(6 -1 +1) + 1);
        System.out.println("The player rolled the dice and get a number : " + x);
    }
}
