package com.qamp.kanita.zadaci.zadatak2;

public class Circle extends Shape {

    private double radius;

    public Circle(final String color, final double radius){
        super(color);
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getCircumference(){
        return 2 * radius * Math.PI;
    }

}
