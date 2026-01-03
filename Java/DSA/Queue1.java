package ADT;

import java.util.*;

public class Queue1 {

	String[] arr;
	int front;
	int rear;

	Queue1(int size) {
		arr = new String[size];
		rear = -1;
		front = -1;
	}

	boolean isFull() {
		if (front == 0 && rear == arr.length - 1 || (rear + 1 == front))
			return true;
		else
			return false;
	}

	boolean isEmpty() {
		if (rear == -1)
			return true;
		else
			return false;
	}

	String enqueue(String ele) {
		if (isFull() == false) {
			if (rear == -1) {
				front = 0;
				rear = 0;
			} else if (rear == arr.length - 1) {
				rear = 0;
			} else
				rear++;
			arr[rear] = ele;

		} else {
			System.out.println("queue overflow");
		}
		return ele;
	}

	String dequeue() {
		if (isEmpty() == false) {
			String element = arr[front];

			if (rear == front) {
				rear = -1;
				front = -1;
			}

			else if (front == arr.length - 1) {
				front = 0;

			} else {
				front++;
			}
			return element;
		}
		System.out.println("Queue Underflow");
		return null;
	}

	void display() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}

		int i = front;

		while (i != rear) {
			System.out.println(arr[i]);
			if (i == arr.length - 1) {
				i = 0;
			} else {
				i++;
			}

		}
		System.out.println(arr[i]);
	}

	public static void main(String[] args) {
		Queue1 q = new Queue1(5);
		Scanner sc = new Scanner(System.in);

//		q.display();
//		q.enqueue("akshay oza");
//		q.enqueue("oza");
//		q.enqueue("abc");
//		q.enqueue("pqr");
//		q.enqueue("yz");
//		q.display();
//		q.enqueue("ff");
//		q.dequeue();
//		q.display();

		while (true) {
			System.out.println("1 : Add Patient (enqueue)");
			System.out.println("2 : Call Next Patient (dequeue)");
			System.out.println("3 : Display Waiting List ");
			System.out.println("4 : Exit");
			System.out.println("choice: ");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("enter Patient name");
				String a = sc.nextLine();
				q.enqueue(a);
				break;

			case 2:
				q.dequeue();
				System.out.println("Called next patient");
				break;

			case 3:

				q.display();
				break;
			case 4:

				System.out.println("Exiting");
				return;
			default:
				System.out.println("Invalid choice");
				break;
			}

		}

	}

}
