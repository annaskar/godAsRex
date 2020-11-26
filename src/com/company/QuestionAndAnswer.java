package com.company;

import java.util.ArrayList;
import java.util.Collections;


public class QuestionAndAnswer {
    private final String question;
    private final ArrayList<String> answers;
    private final String trueAnswer;
    private final String categorie;



    public QuestionAndAnswer(String question , ArrayList<String> answer , String trueAnswer , String categorie) {
        this.question = question;
        answers = new ArrayList<>();
        answers.addAll(answer);
        this.trueAnswer=trueAnswer;
        this.categorie = categorie;
    }

    public String getQuestion() {
        return question;
    }

    public String getTrueAnswer(){
        return trueAnswer;
    }

    public String getCategorie(){
        return categorie;
    }

    public void printAnswers(){
        Collections.shuffle(answers);
        for (String a:answers)
            System.out.println(a);
    }
    public boolean trueAnswer(String answerOfPlayer) {
        return answerOfPlayer.equals(trueAnswer);
    }

}
