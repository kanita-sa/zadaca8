package com.qamp.kanita.zadaci.zadatak1;

public class Submarine implements Swim {

    private String submarine;

    public Submarine(){
    }

    public String getThing(){
        return this.submarine;
    }

    @Override
    public String swim(){
        return "Swims under water";
    }

}
