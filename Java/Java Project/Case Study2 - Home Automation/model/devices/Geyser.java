package model.devices;

import model.AbstractDevice;
import model.interfaces.Monitorable;
import model.interfaces.Schedulable;
import model.interfaces.TemperatureControl;

public class Geyser extends AbstractDevice
        implements Monitorable, Schedulable, TemperatureControl {

     int heatLevel;

    public Geyser(int id) {
        super(id, "Geyser");
    }

    public void setTemperature(int temp) {
        heatLevel = temp;
    }

    public String readSensor() {
        return "Heat Level: " + heatLevel;
    }

    public void scheduleOn(String time) {
        System.out.println("Geyser ON at " + time);
    }

    public void scheduleOff(String time) {
        System.out.println("Geyser OFF at " + time);
    }

	int getHeatLevel() {
		return heatLevel;
	}

	void setHeatLevel(int heatLevel) {
		this.heatLevel = heatLevel;
	}
    
}
