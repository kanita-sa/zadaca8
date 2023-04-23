package com.qamp.kanita.zadaci.zadatak1;

public class Duck implements Flight, Swim {

    private String duck;
    public Duck(){
    }

    public String getThing(){
        return "duck";
    }

    @Override
    public String swim(){
        return "Kinda floats";
    }
    @Override
    public String fly(){
        return "Flies with wings";
    }
}
