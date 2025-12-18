package model.devices;

import model.AbstractDevice;
import model.interfaces.Adjustable;

public class Fan extends AbstractDevice implements Adjustable {

     int speedLevel;

    public Fan(int id) {
        super(id, "Fan");
    }

    public void increaseLevel() {
        setSpeedLevel(getSpeedLevel() + 1);
    }

    public void decreaseLevel() {
        setSpeedLevel(getSpeedLevel() - 1);
    }

	public int getSpeedLevel() {
		return speedLevel;
	}

	public void setSpeedLevel(int speedLevel) {
		this.speedLevel = speedLevel;
	}
}
