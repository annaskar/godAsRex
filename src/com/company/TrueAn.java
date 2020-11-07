package com.company;

import java.awt.font.GlyphMetrics;
import java.util.Scanner;

public class TrueAn {
int po;//PONTOI PAIXNIDIOU
Game a;



    public int gameTrue(Game b)
    {
        Game a=b;

        System.out.print(a.q);
        System.out.print(a.anse1);
        System.out.print(a.anse2);
        System.out.print(a.anse3);
        System.out.print(a.anse4);
        System.out.print("Please selecte a anser\n,a for first anser\n,b for sec anser\nc for thrit anser\n,d for last");
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
        String str1= sc.nextLine(); //reads string.
        if(str1==a.trueanse)
        { System.out.print("YOU ARE CORRECT");
            po+=500;}
            else
        {
            System.out.print("IM SORRY");
            po+=0;
        }

            return po;



    }

  /*  private String nextLine() {
    return nextLine();
    }
*/

}
