package com.qamp.kanita.zadaci.zadatak1;

public class Main {
    public static void main(String[] args) {

        Classify classify = new Classify();

        final Duck theDuck = new Duck();
        final Fish theFish = new Fish();
        final Pegasus thePegasus = new Pegasus();
        final Plane thePlane = new Plane();
        final Submarine theSubmarine = new Submarine();
        

        classify.addThingsThatSwims(theDuck);
        classify.addThingsThatFlies(theDuck);
        classify.addThingsThatSwims(theFish);
        classify.addThingsThatFlies(thePegasus);
        classify.addThingsThatFlies(thePlane);
        classify.addThingsThatSwims(theSubmarine);

        classify.printFlyingThings();
        classify.printSwimmingThings();





    }

}
