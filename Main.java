package com.example.lesson41;

public class Main {
    public static void main(String[] args) {
        Computer myDesktop = new Desktop();
        Computer myLaptop = new Laptop();
        Computer myTablet = new Tablet();
        System.out.println("Desktop: " + myDesktop.tryToTurnOn());
        System.out.println("Laptop: " + myLaptop.tryToTurnOn());
        System.out.println("Tablet: " + myTablet.tryToTurnOn());

        // Messing Up with your device
        myDesktop.setTurnOnType(new CanNotTurnOnType());
        System.out.println("Desktop: " + myDesktop.tryToTurnOn());
    }
}
