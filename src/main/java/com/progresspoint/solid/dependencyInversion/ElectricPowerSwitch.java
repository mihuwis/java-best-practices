package com.progresspoint.solid.dependencyInversion;

public class ElectricPowerSwitch implements Switch{

    public Switchable client;
    public boolean on;

    public ElectricPowerSwitch(final Switchable client) {
        this.client = client;
        this.on = false;
    }

    @Override
    public boolean isOn() {
        return this.on;
    }

    @Override
    public void press() {
        if(this.on){
            client.turnOff();
            this.on = false;
        } else {
            client.turnOn();
            this.on = true;
        }
    }
}
