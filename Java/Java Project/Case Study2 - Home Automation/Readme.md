# 🏠 Home Automation System (Java)

A console-based **Home Automation System** built using **Core Java**, following **MVC architecture**.  
Rooms (parts of house) are dynamically loaded from a text file, and devices can be managed room-wise.

---

## 📌 Features

- Rooms loaded dynamically from `rooms.txt`
- Menu-driven console application
- Select **part of house** before operating devices
- Add multiple devices per room
- Prevent duplicate device IDs in the same room
- Device capabilities via interfaces:
  - Adjustable
  - TemperatureControl
  - Monitorable
  - Schedulable
- Custom exception handling

---

## 🧱 Project Architecture (MVC)

src
├── controller
│ ├── HomeController.java
│ ├── RoomController.java
│ └── DeviceController.java
│
├── model
│ ├── Home.java
│ ├── Room.java
│ ├── AbstractDevice.java
│ ├── devices
│ │ ├── Fan.java
│ │ ├── AC.java
│ │ ├── TV.java
│ │ ├── Light.java
│ │ ├── MusicSystem.java
│ │ ├── Geyser.java
│ │ ├── Shower.java
│ │ └── Fridge.java
│ │
│ ├── interfaces
│ │ ├── Adjustable.java
│ │ ├── TemperatureControl.java
│ │ ├── Monitorable.java
│ │ └── Schedulable.java
│ │
│ └── exception
│ └── DuplicateDeviceException.java
│
├── view
│ └── View.java
│
├── rooms.txt
