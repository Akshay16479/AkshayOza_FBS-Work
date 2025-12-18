package model.devices;

import model.AbstractDevice;
import model.interfaces.Monitorable;
import model.interfaces.TemperatureControl;

public class Fridge extends AbstractDevice
        implements Monitorable, TemperatureControl {

    private int temperature;
    private int coolingLevel;

    public Fridge(int id) {
        super(id, "Fridge");
    }

    public void setTemperature(int temp) {
        temperature = temp;
    }

    public String readSensor() {
        return "Fridge Temp: " + temperature;
    }

	public int getCoolingLevel() {
		return coolingLevel;
	}

	public void setCoolingLevel(int coolingLevel) {
		this.coolingLevel = coolingLevel;
	}
}
