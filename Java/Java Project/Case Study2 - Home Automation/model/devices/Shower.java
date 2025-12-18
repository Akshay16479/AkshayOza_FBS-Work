package model.devices;

import model.AbstractDevice;
import model.interfaces.Monitorable;
import model.interfaces.TemperatureControl;

public class Shower extends AbstractDevice
        implements Monitorable, TemperatureControl {

     int waterTemp;

    public Shower(int id) {
        super(id, "Shower");
    }

    public void setTemperature(int temp) {
        waterTemp = temp;
    }

    public String readSensor() {
        return "Water Temp: " + waterTemp;
    }

	int getWaterTemp() {
		return waterTemp;
	}

	void setWaterTemp(int waterTemp) {
		this.waterTemp = waterTemp;
	}
    
}
