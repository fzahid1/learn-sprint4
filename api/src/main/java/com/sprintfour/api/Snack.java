package com.sprintfour.api;
public class Snack {
    private String name;
    private Integer ID;
    private Double cost; 

    public Snack(String name, Integer ID, Double cost){
        this.ID = ID;
        this.name = name;
        this.cost = cost;
    }

    public int getID(){
        return this.ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost(){
        return this.cost;
    }

    public void setCost(Double cost) {
        this.cose = cost;
    }
}
