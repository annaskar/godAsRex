package com.company;

import java.io.FileNotFoundException;


public class Game {
    private final Player player1;
    private final Questions w ;

    public Game()throws FileNotFoundException{
        player1= new Player("ANNA");
        w= new Questions();
        w.reader();
    }


    public void playwithmenotwhitANNA() {

        System.out.println("ROUND 1");
        Round round1= new Round();
        playRoundTrueAnswer(round1);

        System.out.println("ROUND 2");
        Round round2= new Round();
        playRoundTrueAnswer(round2);

    }

    public void playRoundTrueAnswer(Round round){
        QuestionAndAnswer n;

        while (round.getNumrQuestions()>0){
            n=w.giveQuestionAndAnswer();
            //TrueAn trueAn= new TrueAn(n);
            TrueAn trueAn= new TrueAn();
            trueAn.gameTrue(player1,n);
            System.out.printf("%s have %d points%n",player1.getPlayer(),player1.getPoints());

            round.NumberQuestions();
            if (round.getNumrQuestions()>0){
                System.out.println("next question");
            }
            else{
                round.NumberQuestions();
            }
        }
    }

}