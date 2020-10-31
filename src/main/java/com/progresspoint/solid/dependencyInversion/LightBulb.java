package com.progresspoint.solid.dependencyInversion;

public class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Light is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is off");
    }
}
