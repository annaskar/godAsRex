package com.company;

public class Player {
    private int points;
    private String player;

    public Player(String player)
    {
        points = 0;
        this.player= player;
        this.player = player;
    }

    public int getPoints(){
        return points;
    }

    public String getPlayer(){
        return player;
    }

    public void updatePointsOfPlayer(int p){
        points+=p;
    }

}
