package com.progresspoint.solid.dependencyInversion;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ElectricPowerSwitchTest {

    @Test
    public void switchTest() {
        Switchable lightBulb = new LightBulb();
        Switch electricPowerSwitch= new ElectricPowerSwitch(lightBulb);
        electricPowerSwitch.press();
        electricPowerSwitch.press();

        Switchable fan = new Fan();
        Switch fanPowerSwitch= new ElectricPowerSwitch(fan);
        fanPowerSwitch.press();
        fanPowerSwitch.press();

    }

}