package com.qamp.kanita.zadaci.zadatak1;

public class Plane implements Flight {

    private String plane;

    public Plane(){
    }

    public String getThing(){
        return this.plane;
    }

    @Override
    public String fly(){
        return "Flies using engine";
    }

}
