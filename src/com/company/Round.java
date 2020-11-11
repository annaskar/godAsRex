package com.company;

public class Round {
    private int round = 5;
    private int numrQuestions = 4;


    public void NumberRound() {
        if (round == 0) {

            System.out.print("GAME OVER");

        } else {
            round -= 1;
            System.out.print("You have only");
            System.out.print(round);
            System.out.print("rounds");

        }
    }
    public void NumberQuesetions() {
        if ( numrQuestions  == 0) {

            System.out.print("next round");
            NumberRound();

        } else {
            numrQuestions  -= 1;
            System.out.print("You have only");
            System.out.print( numrQuestions );
            System.out.print("Questions");

        }
    }
}