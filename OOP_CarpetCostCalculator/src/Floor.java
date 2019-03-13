package com.Krzysztof;

public class Floor {
    private double width;
    private double lenght;
    public Floor(double width, double lenght) {
        if(width<0){
            width = 0;
        }
        else
        {
            this.width = width;
        }
        if(lenght < 0){
            lenght = 0;
        }
        else
        {
            this.lenght = lenght;
        }
    }
    public double getArea(){
        return width*lenght;
    }
}
