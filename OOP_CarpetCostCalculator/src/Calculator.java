package com.Krzysztof;

public class Calculator {
    private double floor;
    private double cost;


    public Calculator(Floor floor, Carpet carpet1) {
        this.floor = floor.getArea();
        this.cost = carpet1.getCost();
    }

    public double getTotalCost() {
        return this.floor*this.cost;
    }
}
