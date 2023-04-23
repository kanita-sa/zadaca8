package com.qamp.kanita.zadaci.zadatak2;

public class Main {
    public static void main(String[] args) {
        MakeTheList theListOfShapes = new MakeTheList();

        final Shape theCircle = new Circle("Blue", 4.3);
        final Shape theRectangle = new Rectangle("White", 6, 8.7);
        final Shape theSquare = new Square("Red", 32);

        theListOfShapes.addShape(theCircle);
        theListOfShapes.addShape(theRectangle);
        theListOfShapes.addShape(theSquare);

        theListOfShapes.printShapes();

    }

}
