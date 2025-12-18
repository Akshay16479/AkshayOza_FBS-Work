package model.devices;

import model.AbstractDevice;
import model.interfaces.Adjustable;
import model.interfaces.Monitorable;
import model.interfaces.TemperatureControl;

public class AC extends AbstractDevice
        implements Adjustable, Monitorable, TemperatureControl {

     int temperature;
     String mode;

    public AC(int id) {
        super(id, "AC");
    }

    public void increaseLevel() {
        temperature++;
    }

    public void decreaseLevel() {
        temperature--;
    }


    public String readSensor() {
        return "Room Temp: " + temperature;
    }

	int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}
    
}
