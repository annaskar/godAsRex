package com.company;
import java.util.Scanner;

public class BetGame {


    private Object String;

    private void menu() {
        System.out.print("You must to bet a points/n");
        System.out.print("If you want to bet a 250 please tap a /n");
        System.out.print("If you want to bet a 500 please tap b/n");
        System.out.print("If you want to bet a 750 please tap c/n");
        System.out.print("If you want to bet a 1000 please tap d /n");

    }
    private int menu2() {
       Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();//System.in is a standard input stream.
        while (a != " ")
        {if (a == "a") {
                return 250;
            } else if (a == "b") {
                return 500;
            } else if (a =="c") {
                return 750;
            } else if (a =="d") {
                return 1000;
            } else
                System.out.println("Chose corect please :( ");
         a = sc.nextLine();//System.in is a standard input stream.
        }
        return 0;
    }


    
    
    public void game() {
        int point;
        menu();
        point =menu2();
        System.out.println(question.getQuestion());

        question.printAnswers();

        Scanner sc = new Scanner(System.in); //System.in is a standard input stream.
        String answerOfPlayer = sc.nextLine(); //reads string.

        if (question.trueAnswer(answerOfPlayer)) {
            player1.updatePointsOfPlayer(point);
        }
        else
        {point=point*(-1);
            player1.updatePointsOfPlayer(point);
        }
    }




}
