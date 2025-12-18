package model;

import java.util.ArrayList;
import java.util.List;
import model.exception.DuplicateDeviceException;

public class Room {

     String roomName;
     public List<AbstractDevice> devices = new ArrayList<>();

    public Room(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomName() {
        return roomName;
    }

    public void addDevice(AbstractDevice device) throws DuplicateDeviceException {

        for (AbstractDevice d : devices) {
            if (d.getDeviceId() == device.getDeviceId()) {
                throw new DuplicateDeviceException(
                    "Device with ID " + device.getDeviceId() + " already exists in room " + roomName
                );
            }
        }
        devices.add(device);
    }

    public void removeDevice(int deviceId) {
        for (int i = 0; i < devices.size(); i++) {
            if (devices.get(i).getDeviceId() == deviceId) {
                devices.remove(i);
                return; // stop after removing
            }
        }
    }


    public AbstractDevice getDevice(int deviceId) {
        for (AbstractDevice d : devices) {
            if (d.getDeviceId() == deviceId) 
            	return d;
        }
        return null;
    }

    public void showRoomStatus() {
        System.out.println("Room: " + roomName);
        for (AbstractDevice d : devices) {
            System.out.println(d.getInfo());
        }
    }
}
