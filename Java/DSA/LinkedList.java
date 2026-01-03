package ADT;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }

    int getData() {
        return data;
    }

    void setData(int data) {
        this.data = data;
    }

    Node getNext() {
        return next;
    }

    void setNext(Node next) {
        this.next = next;
    }
}

public class LinkedList {
    Node start;

    LinkedList() {
        start = null;
    }

    boolean isEmpty() {
        return start == null;
    }

    void insert(int ele) // insert at last
    {
        if (isEmpty()) {
            start = new Node(ele);
            System.out.println(ele + " inserted as the first node.");
            return;
        }

        Node temp = start;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }

        Node temp1 = new Node(ele);
        temp.setNext(temp1);
        System.out.println(ele + " inserted at the end of the list.");
    }

    void insertBeg(int ele) // insert at beginning
    {
        if (isEmpty()) {
            start = new Node(ele);
            System.out.println(ele + " inserted as the first node.");
            return;
        } else {
            Node temp1 = new Node(ele);
            temp1.setNext(start);
            start = temp1;
            System.out.println(ele + " inserted at the beginning of the list.");
        }
    }

    void insertAtPosition(int ele, int pos) // insert at any position
    {
        if (isEmpty()) {
            start = new Node(ele);
            System.out.println(ele + " inserted as the first node.");
            return;
        } else if (pos == 1) {
            Node temp1 = new Node(ele);
            temp1.setNext(start);
            start = temp1;
            System.out.println(ele + " inserted at position 1.");
        } else {
            Node temp1 = new Node(ele);
            Node temp = start;
            int c = 1;

            while (temp.getNext() != null && c < pos - 1) {
                temp = temp.getNext();
                c++;
            }

            temp1.setNext(temp.getNext());
            temp.setNext(temp1);
            System.out.println(ele + " inserted at position " + pos + ".");
        }
    }

    void deleteAtPosition(int pos) // delete at any position
    {
        if (isEmpty()) {
            System.out.println("List is empty. Cannot delete.");
            return;
        } else if (pos == 1) {
            System.out.println(start.getData() + " deleted from position 1.");
            start = start.getNext();
        } else {
            int c = 1;
            Node temp = start;

            while (temp.getNext() != null && c < pos - 1) {
                temp = temp.getNext();
                c++;
            }

            if (c < pos && temp.getNext() == null)
                System.out.println("Invalid position: " + pos);
            else {
                System.out.println(temp.getNext().getData() + " deleted from position " + pos + ".");
                temp.setNext(temp.getNext().getNext());
            }
        }
    }

    void deleteBeg() // delete from start
    {
        if (isEmpty()) {
            System.out.println("List is empty. Cannot delete from beginning.");
            return;
        }

        System.out.println(start.getData() + " deleted from the beginning of the list.");
        start = start.getNext();
    }

    void deleteEnd() // delete from end
    {
        if (isEmpty()) {
            System.out.println("List is empty. Cannot delete from end.");
            return;
        }

        if (start.getNext() == null) {
            System.out.println(start.getData() + " deleted. The list is now empty.");
            start = null;
            return;
        }

        Node temp = start;
        while (temp.getNext().getNext() != null) {
            temp = temp.getNext();
        }

        System.out.println(temp.getNext().getData() + " deleted from the end of the list.");
        temp.setNext(null);
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Linked List is empty.");
            return;
        }

        System.out.println("Linked List elements:");
        Node temp = start;
        while (temp != null) {
            System.out.print(temp.getData() + "  ");
            temp = temp.getNext();
        }
        System.out.println("null");
    }
    
    

    public class LinkedListDemo {
        public static void main(String[] args) {

            LinkedList list = new LinkedList();

            System.out.println("=== Insert at End ===");
            list.insert(10);
            list.insert(20);
            list.insert(30);
            list.display();

            System.out.println("\n=== Insert at Beginning ===");
            list.insertBeg(5);
            list.display();

            System.out.println("\n=== Insert at Position ===");
            list.insertAtPosition(15, 3); // insert 15 at position 3
            list.display();

            System.out.println("\n=== Delete from Beginning ===");
            list.deleteBeg();
            list.display();

            System.out.println("\n=== Delete from End ===");
            list.deleteEnd();
            list.display();

            System.out.println("\n=== Delete at Position ===");
            list.deleteAtPosition(2); // delete node at position 2
            list.display();

            System.out.println("\n=== Final List ===");
            list.display();
        }
    }
 
    
    
    
    
    
    
    
}
