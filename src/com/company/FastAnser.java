/*package com.company;

import java.util.Scanner;

public class FastAnser {

    private void menu()
    {
    System.out.print("Player a have the bottons A B C D ");
    System.out.print("Player b have the bottons Q W E R");

    }

  private int  menu2()
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();//System.in is a standard input stream.
        if ( a=="a"|| a=="b"|| a=="c"||a=="d")

            return 1;
        else if(a=="q"||a=="w"||a=="e"||a=="r")
            return 2;
        else
            System.out.print("wrong");
            return 0;
    }





    public void game() {
        int point;
        menu();
        Player a, b;

        System.out.println(Q.getQuestion());

        Q.printAnswers();

        /*Scanner sc = new Scanner(System.in); //System.in is a standard input stream.
        String answerOfPlayer = sc.nextLine(); //reads string.
        int ans=0;
        ans = menu2();
        if (question.trueAnswer(answerOfPlayer) && (ans == 1)) {
            a.updatePointsOfPlayer(1000);
        }
        else if((question.trueAnswer(answerOfPlayer) && (ans == 2)) )
        {
            b.updatePointsOfPlayer(1000);
        }
        else {
            point = point * (-1);
            player1.updatePointsOfPlayer(point);
        }
    }

}
*/