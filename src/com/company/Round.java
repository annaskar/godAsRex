package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Round {
    private int round ;
    private int numrQuestions ;

    public Round(){
        round = 5;
        numrQuestions = 4;
    }

    public int getNumrQuestions(){
        return numrQuestions;
    }

    public int getRound(){
        return round;
    }


    public void NumberRound() {
        if (round == 0) {
            System.out.print("GAME OVER");

        } else {
            round -= 1;
            System.out.print("You have only ");
            System.out.print(round);
            System.out.println(" rounds");

        }
    }
    public void NumberQuestions() {
        if ( numrQuestions  == 0) {

            System.out.println("next round");
            NumberRound();

        } else {
            numrQuestions  -= 1;
            System.out.print("You have only ");
            System.out.print( numrQuestions );
            System.out.println(" Questions");
        }
    }
}