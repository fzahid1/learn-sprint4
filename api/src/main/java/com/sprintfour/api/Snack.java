package com.sprintfour.api;
public class Snack {
    private String name;
    private int ID;
    private double cost; 

    public Snack(String name, int ID, double cost){
        this.name = name;
        this.ID = ID;
        this.cost = cost;
    }

    public String getName(){
        return this.name;
    }

    public int getID(){
        return this.ID;
    }

    public double getCost(){
        return this.cost;
    }
}
