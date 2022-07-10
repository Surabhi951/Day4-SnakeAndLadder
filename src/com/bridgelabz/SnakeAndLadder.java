package com.bridgelabz;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int position = 0;
       int diaValue = rollDie();
        System.out.println("DiaValue is:" + diaValue);

    }

    static int rollDie(){
        int random1 = (int) ((Math.random()*10) % 6);
        return random1;

    }
}