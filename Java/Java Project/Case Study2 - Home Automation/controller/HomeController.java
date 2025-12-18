package controller;

import model.Home;
import model.Room;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HomeController {

    public Home home = new Home();

    public HomeController() {
        loadRoomsFromFile();
    }

    public Home getHome() {
        return home;
    }

    public void addRoom(String name) {
        home.addRoom(new Room(name));
    }

    // 🔹 ONLY NEW METHOD
    private void loadRoomsFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("src/rooms.txt"))) {
            String roomName;
            while ((roomName = br.readLine()) != null) {
                home.addRoom(new Room(roomName));
            }
        } catch (IOException e) {
            System.out.println("Error loading rooms from file");
        }
    }
}
