package model.devices;

import model.AbstractDevice;
import model.interfaces.Adjustable;
import model.interfaces.Schedulable;

public class MusicSystem extends AbstractDevice
        implements Adjustable, Schedulable {

     int volume;
     String mode;

    public MusicSystem(int id) {
        super(id, "Music System");
    }

    public void increaseLevel() {
        setVolume(getVolume() + 1);
    }

    public void decreaseLevel() {
        setVolume(getVolume() - 1);
    }

    public void scheduleOn(String time) {
        System.out.println("Music ON at " + time);
    }

    public void scheduleOff(String time) {
        System.out.println("Music OFF at " + time);
    }

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}
}
