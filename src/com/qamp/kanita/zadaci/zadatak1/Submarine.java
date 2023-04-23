package com.qamp.kanita.zadaci.zadatak1;

public class Submarine implements Swim {

    private String submarine;

    public Submarine(){
    }

    public String getThing(){
        return "submarine";
    }

    @Override
    public String swim(){
        return "Swims under water";
    }

}
