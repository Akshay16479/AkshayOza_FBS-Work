package ADT;

import java.util.Scanner;

class node {
	int data;
	node next;
	node prev;

	node(int ele) {
		data = ele;
		this.next = null;
		this.prev = null;
	}

	int getData() {
		return data;
	}

	void setData(int data) {
		this.data = data;
	}

	node getNext() {
		return next;
	}

	void setNext(node next) {
		this.next = next;
	}

	node getPrev() {
		return prev;
	}

	void setPrev(node prev) {
		this.prev = prev;
	}
}

 class DLL {
	node start;
	node last;

	DLL() {
		start = null;
		last = null;
	}

	boolean isEmpty() {
		return start == null;
	}

	void insertatPos(int ele, int pos) {
		if (pos < 1) {
			System.out.println("Invalid Position");
			return;
		}

		node temp1 = new node(ele);

		if (isEmpty()) {
			start = last = temp1;
		} 
		else if (pos == 1) {
			temp1.setNext(start);
			start.setPrev(temp1);
			start = temp1;
		}
		else {
			node temp = start;
			int c = 1;

			while (c < pos - 1 && temp.getNext() != null) {
				temp = temp.getNext();
				c++;
			}

			if (temp == last) {
				temp1.setPrev(last);
				last.setNext(temp1);
				last = temp1;
			}
			else {
				temp1.setNext(temp.getNext());
				temp1.setPrev(temp);
				temp.getNext().setPrev(temp1);
				temp.setNext(temp1);
			}
		}
	}

	void insertatEnd(int ele) {
		node temp1 = new node(ele);

		if (isEmpty()) {
			start = last = temp1;
		}
		else {
			temp1.setPrev(last);
			last.setNext(temp1);
			last = temp1;
		}
	}

	void displayStart() {
		node temp = start;
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}

	void displayLast() {
		node temp = last;
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getPrev();
		}
	}
}


 class DoublyLinkedList {
	    public static void main(String[] args) {
	        DLL dll = new DLL();   // FIXED
	        Scanner sc = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\n--- Doubly Linked List Menu ---");
	            System.out.println("1. Insert at Position");
	            System.out.println("2. Insert at End");
	            System.out.println("3. Display from Start");
	            System.out.println("4. Display from Last");
	            System.out.println("0. Exit");
	            System.out.print("Enter choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter element: ");
	                    int ele1 = sc.nextInt();
	                    System.out.print("Enter position: ");
	                    int pos = sc.nextInt();
	                    dll.insertatPos(ele1, pos);
	                    break;

	                case 2:
	                    System.out.print("Enter element: ");
	                    int ele2 = sc.nextInt();
	                    dll.insertatEnd(ele2);
	                    break;

	                case 3:
	                    System.out.println("List from Start:");
	                    dll.displayStart();
	                    break;

	                case 4:
	                    System.out.println("List from Last:");
	                    dll.displayLast();
	                    break;

	                case 0:
	                    System.out.println("Exiting...");
	                    break;

	                default:
	                    System.out.println("Invalid choice");
	            }

	        } while (choice != 0);

	        sc.close();
	    }
	}
