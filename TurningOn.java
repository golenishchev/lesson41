package com.example.lesson41;

public interface TurningOn {
    String turnOn();
}

class CanNotTurnOnType implements TurningOn {
    public String turnOn() {
        return "You need to buy a new one";
    }
}

class PressButtonTurnOnType implements TurningOn {
    public String turnOn() {
        return "Turned On by Pressing the Button";
    }
}

class OpenLidTurnOnType implements TurningOn {
    public String turnOn() {
        return "Turned On by Opening the Lid";
    }
}

class DoubleTapTurnOnType implements TurningOn {
    public String turnOn() {
        return "Turned On by Double Tapping";
    }
}