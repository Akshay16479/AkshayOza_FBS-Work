	package model;
	
	import java.util.ArrayList;
	import java.util.List;
	import model.devices.*;
	import model.interfaces.Schedulable;
	
	public class Home {
	
	      public List<Room> rooms = new ArrayList<>();
	
	    public void addRoom(Room room) {
	        rooms.add(room);
	    }
	
	    public Room getRoom(String roomName) {
	        for (Room r : rooms) {
	            if (r.getRoomName().equalsIgnoreCase(roomName)) {
	                return r;
	            }
	        }
	        System.out.println("Room not found !!");
	        return null;
	    }
	
	    public void turnOnDevice(String roomName, int deviceId) {
	        Room room = getRoom(roomName);
	        if (room != null) {
	            AbstractDevice d = room.getDevice(deviceId);
	            if (d != null) 
	            	d.turnOn();
	        }
	    }
	
	    public void turnOffDevice(String roomName, int deviceId) {
	        Room room = getRoom(roomName);
	        if (room != null) {
	            AbstractDevice d = room.getDevice(deviceId);
	            if (d != null) 
	            	d.turnOff();
	        }
	    }
	
	    public void scheduleDevice(String roomName, int deviceId, String time, boolean on) {
	        Room room = getRoom(roomName);
	        if (room != null) {
	            AbstractDevice d = room.getDevice(deviceId);
	            if (d instanceof Schedulable) {
	                if (on)
	                    ((Schedulable) d).scheduleOn(time);
	                else
	                    ((Schedulable) d).scheduleOff(time);
	            }
	        }
	    }
	
	    public void showHomeStatus() {
	        for (Room r : rooms) {
	            r.showRoomStatus();
	        }
	    }
	}
