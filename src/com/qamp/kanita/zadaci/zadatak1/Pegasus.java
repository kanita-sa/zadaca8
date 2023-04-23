package com.qamp.kanita.zadaci.zadatak1;

public class Pegasus implements Flight{

    private String pegasus;

    public Pegasus(){
    }
    public String getThing(){
        return this.pegasus;
    }

    @Override
    public String fly(){
        return "Flies with wings";
    }

}
