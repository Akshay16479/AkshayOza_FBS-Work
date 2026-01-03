package ADT;
import java.util.Scanner;

public class stack1 {

    String[] arr;
    int top;

    stack1(int size) {
        arr = new String[size];
        top = -1;
    }

    boolean isFull() {
        return top == arr.length - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(String element) {
        if (!isFull()) {
        	top++;
        	arr[top]=element;
            System.out.println("Line added");
        } else {
            System.out.println("Stack Overflow");
        }
    }

    String pop() {
        if (!isEmpty()) {
            return arr[top--];
        } else {
            System.out.println("Stack Underflow");
            return null;
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("stack Underflow");
            return;
        }
        else
        	for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }






    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        stack1 s = new stack1(10);

        while (true) {
            System.out.println("\n1. Write");
            System.out.println("2. Undo");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter text: ");
                    String line = sc.nextLine();
                    s.push(line);
                    break;

                case 2:
                    s.pop();
                    System.out.println("Undo done");
                    break;

                case 3:
                    s.display();
                    break;

                case 4:
                    System.out.println("Exit");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

