package com.qamp.kanita.zadaci.zadatak1;

public class Fish implements Swim {

    private String fish;

    public Fish(){
    }

    public String getThing() {
        return "fish";
    }

    @Override
    public String swim(){
        return "Swims under water";
    }

}
