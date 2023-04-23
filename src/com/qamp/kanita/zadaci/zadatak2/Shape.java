package com.qamp.kanita.zadaci.zadatak2;

public abstract class Shape {

    private String colour;

    public Shape(final String colour) {
        this.colour = colour;
    }

    public abstract double getArea();

    public abstract double getCircumference();

    @Override
    public String toString(){
        return "colour: " + colour + "; area: " + getArea() + "; circumference: " + getCircumference();
    }





}
