package com.qamp.kanita.zadaci.zadatak2;

public class Rectangle extends Shape {

    private double side_a;

    private double side_b;

    public Rectangle(final String colour, final double side_a, final  double side_b){
        super(colour);
        this.side_a = side_a;
        this.side_b = side_b;
    }

    @Override
    public double getArea(){
        return side_a * side_b;
    }

    @Override
    public double getCircumference(){
        return 2 * side_a + 2 * side_b;
    }

}
