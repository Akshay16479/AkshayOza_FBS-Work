package view;

import java.util.Scanner;

import controller.HomeController;
import controller.RoomController;
import model.Home;
import model.Room;
import model.AbstractDevice;
import model.devices.*;
import model.exception.DuplicateDeviceException;
import model.interfaces.*;

public class View {

    static Scanner sc = new Scanner(System.in);
    
    static Room selectedRoom = null;


    public static void main(String[] args) {

        HomeController homeController = new HomeController();
        RoomController roomController = new RoomController();
        Home home = homeController.getHome();

        int choice;

        do {
        	System.out.println("\n===== HOME AUTOMATION SYSTEM =====");
        	System.out.println("1. Select Part of House");
        	System.out.println("2. Add Room");
        	System.out.println("3. Add Device to Room");
        	System.out.println("4. Turn ON Device");
        	System.out.println("5. Turn OFF Device");
        	System.out.println("6. Adjust Device Level");
        	System.out.println("7. Set Temperature");
        	System.out.println("8. Read Sensor");
        	System.out.println("9. Schedule Device");
        	System.out.println("10. Show Home Status");
        	System.out.println("0. Exit");
        	System.out.print("Enter choice: ");
        	

            choice = sc.nextInt();

            switch (choice) {

            case 1:
                selectRoom(home);
                break;

            case 2:
                addRoom(homeController);
                break;

            case 3:
                try {
                    addDevice(roomController, home);
                } catch (DuplicateDeviceException e) {
                    System.out.println(e.getMessage());
                }
                break;

            case 4:
                changePower(true);
                break;

            case 5:
                changePower(false);
                break;

            case 6:
                adjustDevice();
                break;

            case 7:
                setTemperature();
                break;

            case 8:
                readSensor();
                break;

            case 9:
                scheduleDevice();
                break;

            case 10:
                home.showHomeStatus();
                break;

            case 0:
                System.out.println("Exiting system...");
                break;

            default:
                System.out.println("Invalid choice!");
            }

        } while (choice != 0);
    }

    // ================= METHODS =================

    static void selectRoom(Home home) {

        if (home.rooms.isEmpty()) {
            System.out.println("No rooms available!");
            return;
        }

        System.out.println("Select Part of House:");

        int i = 1;
        for (Room r : home.rooms) {
            System.out.println(i + ". " + r.getRoomName());
            i++;
        }

        System.out.print("Enter choice: ");
        int ch = sc.nextInt();

        if (ch < 1 || ch > home.rooms.size()) {
            System.out.println("Invalid room choice!");
            return;
        }

        selectedRoom = home.rooms.get(ch - 1);
        System.out.println("Selected Room: " + selectedRoom.getRoomName());
    }

    
    
    static void addRoom(HomeController hc) {
        System.out.print("Enter Room Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        hc.addRoom(name);
        System.out.println("Room added successfully.");
    }

    static void addDevice(RoomController rc, Home home) throws model.exception.DuplicateDeviceException {

    	System.out.println("Select Room:");

    	int i = 1;
    	for (Room r : home.rooms) {
    	    System.out.println(i + ". " + r.getRoomName());
    	    i++;
    	}

    	System.out.print("Enter room choice: ");
    	int roomChoice = sc.nextInt();

    	if (roomChoice < 1 || roomChoice > home.rooms.size()) {
    	    System.out.println("Invalid room choice!");
    	    return;
    	}

    	Room room = home.rooms.get(roomChoice - 1);

        

        System.out.println("""
                Select Device:
                1. Fan
                2. AC
                3. TV
                4. Music System
                5. Light
                6. Shower
                7. Geyser
                8. Fridge
                """);

        System.out.print("Choice: ");
        int ch = sc.nextInt();
        
        if (ch < 1 || ch > 8) {
            System.out.println("Invalid device choice!");
            return;
        }


        System.out.print("Enter Device ID: ");
        int id = sc.nextInt();

        AbstractDevice device = null;

        switch (ch) {
            case 1:
                device = new Fan(id);
                break;

            case 2:
                device = new AC(id);
                break;

            case 3:
                device = new TV(id);
                break;

            case 4:
                device = new MusicSystem(id);
                break;

            case 5:
                device = new Light(id);
                break;

            case 6:
                device = new Shower(id);
                break;

            case 7:
                device = new Geyser(id);
                break;

            case 8:
                device = new Fridge(id);
                break;

            default:
                device = null;
                break;
        }


        if (device != null) {
        	rc.addDevice(room, device);
			System.out.println("Device added successfully.");

        } else {
            System.out.println("Invalid device choice!");
        }
    }

    static void changePower(boolean on) {

        if (selectedRoom == null) {
            System.out.println("Please select a room first!");
            return;
        }

        System.out.print("Enter Device ID: ");
        int id = sc.nextInt();

        AbstractDevice device = selectedRoom.getDevice(id);
        if (device == null) {
            System.out.println("Device not found!");
            return;
        }

        if (on) device.turnOn();
        else device.turnOff();
    }


    static void adjustDevice() {

        if (selectedRoom == null) {
            System.out.println("Please select a room first!");
            return;
        }

        System.out.print("Enter Device ID: ");
        int id = sc.nextInt();

        AbstractDevice device = selectedRoom.getDevice(id);

        if (!(device instanceof Adjustable adj)) {
            System.out.println("Device not adjustable!");
            return;
        }

        System.out.println("1. Increase Level");
        System.out.println("2. Decrease Level");
        int ch = sc.nextInt();

        if (ch == 1) adj.increaseLevel();
        else if (ch == 2) adj.decreaseLevel();
    }


    static void setTemperature() {

        if (selectedRoom == null) {
            System.out.println("Please select a room first!");
            return;
        }

        System.out.print("Enter Device ID: ");
        int id = sc.nextInt();

        AbstractDevice device = selectedRoom.getDevice(id);

        if (!(device instanceof TemperatureControl temp)) {
            System.out.println("Temperature control not supported!");
            return;
        }

        System.out.print("Enter Temperature: ");
        int t = sc.nextInt();
        temp.setTemperature(t);

        System.out.println("Temperature set successfully.");
    }


    static void readSensor() {

        if (selectedRoom == null) {
            System.out.println("Please select a room first!");
            return;
        }

        System.out.print("Enter Device ID: ");
        int id = sc.nextInt();

        AbstractDevice device = selectedRoom.getDevice(id);

        if (!(device instanceof Monitorable mon)) {
            System.out.println("No sensor available for this device!");
            return;
        }

        System.out.println("Sensor Data: " + mon.readSensor());
    }


    static void scheduleDevice() {

        if (selectedRoom == null) {
            System.out.println("Please select a room first!");
            return;
        }

        System.out.print("Enter Device ID: ");
        int id = sc.nextInt();

        AbstractDevice device = selectedRoom.getDevice(id);

        if (!(device instanceof Schedulable sch)) {
            System.out.println("Scheduling not supported for this device!");
            return;
        }

        System.out.println("1. Schedule ON");
        System.out.println("2. Schedule OFF");
        int ch = sc.nextInt();

        System.out.print("Enter Time (HH:MM): ");
        sc.nextLine();
        String time = sc.nextLine();

        if (ch == 1) sch.scheduleOn(time);
        else if (ch == 2) sch.scheduleOff(time);
        else System.out.println("Invalid choice!");
    }


    static AbstractDevice getDevice(Home home) {

        System.out.print("Enter Room Name: ");
        sc.nextLine();
        String roomName = sc.nextLine();

        Room room = home.getRoom(roomName);
        if (room == null) {
            System.out.println("Room not found!");
            return null;
        }

        System.out.print("Enter Device ID: ");
        int id = sc.nextInt();

        AbstractDevice device = room.getDevice(id);
        if (device == null) {
            System.out.println("Device not found!");
        }

        return device;
    }
}
