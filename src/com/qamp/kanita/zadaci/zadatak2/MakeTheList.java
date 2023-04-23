package com.qamp.kanita.zadaci.zadatak2;

import java.util.ArrayList;
import java.util.List;

public class MakeTheList {

    private List<Shape> theShapes;

    public MakeTheList(){
        theShapes = new ArrayList<>();
    }

    public void addShape(Shape theShape){
        theShapes.add(theShape);
    }

    public void printShapes(){
        for (Shape theShape : theShapes){
            System.out.println(theShape.toString());
        }
    }

}
