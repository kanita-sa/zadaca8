package com.qamp.kanita.zadaci.zadatak1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Classify {

    private List<Flight> thingsThatFlies;

    private List<Swim> thingsThatSwims;

    public Classify(){
        thingsThatFlies = new ArrayList<>();
        thingsThatSwims = new LinkedList<>();
    }

    public void addThingsThatFlies(Flight thing){
        thingsThatFlies.add(thing);
    }

    public void addThingsThatSwims(Swim thing){
        thingsThatSwims.add(thing);
    }

    public void printFlyingThings(){
        System.out.println("\nThings that flies: ");
        for (Flight thing : thingsThatFlies){
            System.out.println(thing.getThing() + ": " + thing.fly());
        }
    }

    public void printSwimmingThings(){
        System.out.println("\nThings that swims: ");
        for (Swim thing : thingsThatSwims){
            System.out.println(thing.getThing() + ": " + thing.swim());
        }
    }




}
