# 🏠 Home Automation System (Java – Console Based)

## 📌 Project Overview
This project is a **console-based Home Automation System** developed in **Java** using **OOP principles**.  
It allows users to manage different parts of a house (rooms) and control devices like Fan, AC, TV, Light, Geyser, etc.

Rooms are **loaded dynamically from a text file**, making the system configurable without changing source code.

---

## ✨ Key Features
- Load house rooms from external file (`rooms.txt`)
- Select a part of the house before performing operations
- Add devices to rooms with **duplicate device ID validation**
- Turn devices ON / OFF
- Adjust device levels (Fan speed, TV volume, etc.)
- Set temperature for supported devices
- Read sensor data
- Schedule devices (ON / OFF)
- View complete home status

---


---

## 🏠 Rooms Configuration (`rooms.txt`)
Rooms are defined externally in a text file.

### 📄 rooms.txt
Living Room
Bedroom
Kitchen
Bathroom
Balcony
Study Room
Lobby
Corridor
Staircase
Pooja Room



➡ Each line represents one **part of the house**.  
➡ Rooms are automatically loaded at application startup.

---

## 🧭 Menu Flow
1. Select Part of House  
2. Add Room  
3. Add Device to Room  
4. Turn ON Device  
5. Turn OFF Device  
6. Adjust Device Level  
7. Set Temperature  
8. Read Sensor  
9. Schedule Device  
10. Show Home Status  

> ⚠ Most operations require selecting a room first.

---

## ▶ How to Run the Project
1. Clone or download the repository
2. Open the project in **Eclipse / IntelliJ**
3. Make sure `rooms.txt` is present inside the `src` folder
4. Run `View.java`
5. Use the menu to interact with the system

---

## ⚠ Important Notes
- Device IDs must be **unique within a room**
- Room selection is mandatory before controlling devices
- File-based room loading improves flexibility and maintainability

---

## 🧠 Concepts Used
- Object-Oriented Programming (OOP)
- Abstraction & Inheritance
- Interfaces
- Exception Handling
- File Handling (BufferedReader)
- MVC Architecture (Model–View–Controller)

---

## 👨‍💻 Author
**Akshay**

---

## 📌 Future Enhancements
- Persist devices to file
- GUI using JavaFX / Swing
- User authentication
- Device usage analytics


