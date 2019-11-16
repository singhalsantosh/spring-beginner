package com.example.pkg;

public class Animal {
    private String speciesName;
    private double weight;
    private double height;

    public Animal(String speciesName, double weight, double height) {
        this.speciesName = speciesName;
        this.weight = weight;
        this.height = height;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
