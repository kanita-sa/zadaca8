package com.qamp.kanita.zadaci.zadatak2;

public class Square extends Shape {

    private double side;

    public Square(final String colour, final double side){
        super(colour);
        this.side = side;
    }

    @Override
    public final double getArea(){
        return side * side;
    }

    @Override
    public double getCircumference(){
        return 4 * side;
    }

}
