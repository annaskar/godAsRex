package com.company;

import java.awt.font.GlyphMetrics;
import java.util.Scanner;


import java.util.Scanner;

public class TrueAn {

    public TrueAn() {

    }

    public void gameTrue(Player player1, QuestionAndAnswer question)
    {
        System.out.println("Category Of Question " +question.getCategorie());
        System.out.println(question.getQuestion());
        question.printAnswers();

        Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
        String answerOfPlayer= sc.nextLine(); //reads string.

        if(question.trueAnswer(answerOfPlayer)){
            player1.updatePointsOfPlayer(250);
        }


    }

}