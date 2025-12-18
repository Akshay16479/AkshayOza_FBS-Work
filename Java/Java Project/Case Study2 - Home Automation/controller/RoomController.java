package controller;
import model.exception.DuplicateDeviceException;

import model.Room;
import model.AbstractDevice;

public class RoomController {


	public void addDevice(Room room, AbstractDevice device) throws DuplicateDeviceException {
	    room.addDevice(device);
	}

}
