package com.bridgelabz;

public class SnakeAndLadder {
    static final int NO_OPTION =0;
    static final int SNAKE_OPTION =1;

    static final int LADDER_OPTION =2;

    public static void main(String[] args) {
        int position = 0;
       int diaValue = rollDie();
        System.out.println("DiaValue is:" + diaValue);

        int option = getOption();
        System.out.println("option is:" + option);

        if(option == NO_OPTION){
            System.out.println("No option");
        }
        else if(option == SNAKE_OPTION ){
            System.out.println("got a snake");

        }
        else if(option ==LADDER_OPTION ){
            System.out.println("got a ladder");
        }

    }

    static int rollDie(){
        int random1 = (int) ((Math.random()*10) % 6);
        return random1;

    }

    static int getOption(){
        int random2 = (int) ((Math.random()*10) % 3);
        return random2;
    }
}