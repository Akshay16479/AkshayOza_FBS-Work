package model.devices;

import model.AbstractDevice;
import model.interfaces.Adjustable;

public class TV extends AbstractDevice implements Adjustable {

     int volume;
     int channel;

    public TV(int id) {
        super(id, "TV");
    }

    public void increaseLevel() {
        volume++;
    }

    public void decreaseLevel() {
        volume--;
    }

	int getVolume() {
		return volume;
	}

	void setVolume(int volume) {
		this.volume = volume;
	}

	int getChannel() {
		return channel;
	}

	void setChannel(int channel) {
		this.channel = channel;
	}
    
}
