package com.example.lesson41;

public class Computer {
    public TurningOn TurningOnType;

    public String tryToTurnOn() {
        return TurningOnType.turnOn();
    }

    public void setTurnOnType(TurningOn newTurnOnType){
        TurningOnType = newTurnOnType;
    }
}

