package model.devices;

import model.AbstractDevice;

public class Light extends AbstractDevice {

     int brightness;

    public Light(int id) {
        super(id, "Light");
    }

	int getBrightness() {
		return brightness;
	}

	void setBrightness(int brightness) {
		this.brightness = brightness;
	}
    
}
