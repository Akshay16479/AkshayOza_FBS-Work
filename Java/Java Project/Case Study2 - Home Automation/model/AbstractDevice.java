package model;

import java.time.LocalDateTime;

public abstract class AbstractDevice {

     int deviceId;
     String deviceName;
     boolean status;
     LocalDateTime timeLastOn;
     LocalDateTime timeLastOff;

    public AbstractDevice(int deviceId, String deviceName) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public boolean getStatus() {
        return status;
    }

    public void turnOn() {
        status = true;
        timeLastOn = LocalDateTime.now();
    }

    public void turnOff() {
        status = false;
        timeLastOff = LocalDateTime.now();
    }

    public String getInfo() {
        return deviceName + " (ID: " + deviceId + ") Status: " + status;
    }
}
