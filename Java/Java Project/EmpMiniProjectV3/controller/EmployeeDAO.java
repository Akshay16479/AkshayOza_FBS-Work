package Controller;

import Model.Employee;
import Model.Admin;
import Model.HR;
import Model.SalesManager;

import java.io.*;
import java.util.*;

public class EmployeeDAO implements Serializable {

    ArrayList<Employee> eArr = new ArrayList<>();

    // Load from file OR use default records
    public EmployeeDAO() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.dat"));
            eArr = (ArrayList<Employee>) ois.readObject();
            ois.close();
            System.out.println("Loaded saved employee data...");
        } catch (Exception e) {
            System.out.println("No saved file found. Loading default records...");

            eArr.add(new Admin(105, "Akshu", 60000.0, 5000.0));
            eArr.add(new HR(184, "ABC", 45000.0, 2500.0));
            eArr.add(new SalesManager(103, "XYZ", 48000.0, 50, 7000.0));
            eArr.add(new HR(254, "PQR", 47000.0, 2000.0));
            eArr.add(new Admin(158, "aaabb", 52000.0, 3000.0));

            save(); // first time save
        }
    }

    // Save method
    private void save() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.data"));
            oos.writeObject(eArr);
            oos.close();
        } catch (Exception e) {
            System.out.println("Error while saving data!");
        }
    }

    // Add employee
    public boolean addEmployee(Employee e) {
        boolean result = eArr.add(e);
        save();
        return result;
    }

    // Search employee
    public Employee searchEmployee(int id) {
        for (Employee e : eArr) {
            if (e.getId() == id) return e;
        }
        return null;
    }

    // Update employee
    public boolean updateEmployee(int id, double salary) {
        for (Employee e : eArr) {
            if (e.getId() == id) {
                e.setSalary(salary);
                save();
                return true;
            }
        }
        return false;
    }

    // Delete employee
    public boolean deleteEmployee(int id) {
        for (int i = 0; i < eArr.size(); i++) {
            if (eArr.get(i).getId() == id) {
                eArr.remove(i);
                save();
                return true;
            }
        }
        return false;
    }

    // Display all
    public void displayAll() {
        System.out.println(eArr);
    }

    // Comparators
    public class MyIdComparator implements Comparator<Employee> {
        public int compare(Employee o1, Employee o2) {
            return o1.getId() - o2.getId();
        }
    }

    public class MyNameComparator implements Comparator<Employee> {
        public int compare(Employee o1, Employee o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public class MySalaryComparator implements Comparator<Employee> {
        public int compare(Employee o1, Employee o2) {
            return Double.compare(o1.getSalary(), o2.getSalary());
        }
    }

    // Sort method
    public void sortEmployee(int choice) {
        switch (choice) {
            case 0:
                System.out.println("Exited");
                return;

            case 1:
                Collections.sort(eArr, new MyIdComparator());
                break;

            case 2:
                Collections.sort(eArr, new MyNameComparator());
                break;

            case 3:
                Collections.sort(eArr, new MySalaryComparator());
                break;

            default:
                System.out.println("Invalid choice!");
                return;
        }

        System.out.println(eArr);
        save(); // optional (if want sorted list saved)
    }
}
