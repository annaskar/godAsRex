package com.company;

import java.awt.*;
import java.util.Scanner;

public class Game {

    protected String anse1;
    protected String q; //ЕΡΩΤΗΣΗ
    protected String anse2;
    protected String anse3;
    protected String anse4;
    protected String trueanse;


protected Game(String anse1, String anse2, String anse3, String anse4, String q, String trueanse)
    {
        this.anse1=anse1;
        this.anse2=anse2;
        this.anse3=anse3;
        this.anse4=anse4;
        this.q=q;
        this.trueanse=trueanse;
};

   /* private Game ()
    {
        this.anse1="0";
        this.anse2="0";
        this.anse3="0";
        this.anse4="0";
        this.q="0";
        this.trueanse="0";
    };*/

   private void menu2()
    {

        System.out.print("what category you want to play?\n");
        System.out.print("type 1 for football\n");
        System.out.print("type 2 for animals\n");

    }

public void playwithmenotwhitANNA()
{
     Game pack=new Game("ANNA IS", "WOMEN BILL", "WOMAN", "STERIOS", "BILL", "WOMEN BILL");
    TrueAn a = null;
    int va=0;
        this.menu2();
    Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
    String str1= sc.nextLine(); //reads string.
        if (str1 == "football") {


            //pack()=qestion(type:"football"); //ΠΕΡΝΩ ΤΗΝ ΕΡΩΤΗΣΗ ΚΑΙ ΤΗΝ ΑΠΑΝΤΗΣΗ ΚΑΙ ΤΑ ΑΠΟΘΗΚΕΥΩ  ΕΔΩ
           va=a.gameTrue(pack);
            return ;


        }
        if (str1 == "animals") {
            return ;
            //   question(type:animals);
        }
        else System.out.print("Please enter True value");
return ;

}

    /*private String nextLine() {
       return nextLine();
    }*/
}


