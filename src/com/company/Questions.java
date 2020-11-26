package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;


public class Questions {
    private final ArrayList<QuestionAndAnswer> questions;
    private final HashSet<String> allCategories;


    public Questions(){
        questions = new ArrayList<>();
        allCategories = new HashSet<>();
    }


    public QuestionAndAnswer giveQuestionAndAnswer(){
        if (questions.size()>0){
            QuestionAndAnswer temp;
            temp= questions.get(0);
            questions.remove(0);
            return temp;
        }
        return null;
    }

    public void reader() throws FileNotFoundException {

        String fileName = "questions.txt";

        File f = new File(fileName);
        Scanner sc = new Scanner(f);

        while (sc.hasNextLine()){
            String s = sc.nextLine();
            String[] all = s.split(",");

            ArrayList<String> answers = new ArrayList<>();
            answers.add(all[2]);
            answers.add(all[3]);
            answers.add(all[4]);
            answers.add(all[5]);

            QuestionAndAnswer x = new QuestionAndAnswer(all[1] , answers , all[6] , all[0]);
            questions.add(x);
            allCategories.add(all[0]);
        }
        Collections.shuffle(questions);

    }
}
