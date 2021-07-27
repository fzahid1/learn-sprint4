package com.sprintfour.api;
import java.util.UUID;

import javax.persistence.*;

@Entity
public class Car {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private UUID id;

    private String year;
    private String make;
    private String model;
    public Car(){
        
    }

    public Car(String year, String make, String model) {

        this.year = year;
        this.make = make;
        this.model = model;
    }

    public String getId() {
        return this.id;
    }

    public String getYear() {
        return this.year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCar() {
        return year + " " + make  + " " + model;
    }

}