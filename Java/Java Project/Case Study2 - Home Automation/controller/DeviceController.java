package controller;

import model.AbstractDevice;

public class DeviceController {

    public void turnOn(AbstractDevice device) {
        device.turnOn();
    }

    public void turnOff(AbstractDevice device) {
        device.turnOff();
    }
}
