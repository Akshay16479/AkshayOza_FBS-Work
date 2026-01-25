package com.demo;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        EmployeeManagement em = new EmployeeManagement();

        do {
            System.out.println("\n1. Add Employee");
            System.out.println("2. Search Employee By ID");
            System.out.println("3. Update Employee By ID");
            System.out.println("4. Delete Employee By ID");
            System.out.println("5. Display All Employee");
            System.out.println("6. Exit");
            System.out.print("Enter Your Choice: ");

            choice = sc.nextInt();   

            switch (choice) {
                case 1:
                    em.addEmployee();
                    break;

                case 2:
                    em.searchEmployee();
                    break;

                case 3:
                    em.updateEmployee();
                    break;

                case 4:
                    em.deleteEmployee();
                    break;

                case 5:
                    em.displayAll();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("--- Invalid Choice!!! ---");
            }

        } while (choice != 6);

        sc.close();
    }
}
